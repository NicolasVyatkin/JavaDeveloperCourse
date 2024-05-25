package org.example;

/*
* 8.2.-30/03/2023
 * Создать базу данных «Банк» с таблицами «Пользователи», «Транзакции», «Счета» и «Курсы валют».
 * Счет бывает 3-х видов: USD, EUR, UAH. Написать запросы для пополнения счета в нужной валюте,
 * перевода средств с одного счета на другой, конвертации валюты по курсу в рамках счетов одного
 * пользователя. Написать запрос для получения суммарных средств на счету одного пользователя в UAH
 * (расчет по курсу).
 * */

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    private EntityManagerFactory emf;
    private EntityManager em;
    private AccountRepository accountRepository;
    public ExchangeRateRepository exchangeRateRepository;

    public Main() {
        String persistenceUnitName = "bank";
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        em = emf.createEntityManager();

        accountRepository = new AccountRepositoryImpl(em);
        exchangeRateRepository = new ExchangeRateRepositoryImpl(em);
    }

    public void close() {
        accountRepository.close();
        exchangeRateRepository.close();
        em.close();
        emf.close();
    }

    public List<Account> getUserAccounts(int userId) {
        return accountRepository.findByUserId(userId);
    }

    public String getUserName(int userId) {
        List<Account> accounts = accountRepository.findByUserId(userId);
        if(!accounts.isEmpty()) {
            return accounts.get(0).getUser().getName();
        } else {
            return "";
        }
    }

    public BigDecimal getTotalAmountInUAH(int userId) {
        List<Account> accounts = accountRepository.findByUserId(userId);
        BigDecimal totalAmountInUAH = BigDecimal.ZERO;

        for (Account account : accounts) {
            String accountType = account.getAccountType();
            if (accountType.equals("UAH")) {
                totalAmountInUAH = totalAmountInUAH.add(account.getBalance()); // Add balance to total amount in UAH
            } else {
                BigDecimal exchangeRate = exchangeRateRepository.findExchangeRate(accountType, "UAH");
                BigDecimal balanceInUAH = account.getBalance().multiply(exchangeRate);
                totalAmountInUAH = totalAmountInUAH.add(balanceInUAH); // Add balance in UAH to total amount in UAH
            }
        }
        return totalAmountInUAH;
    }

    interface AccountRepository {
        Account findByUserIdAndAccountType(int userId, String accountType);
        List<Account> findByUserId(int userId);
        void close();
    }

    class AccountRepositoryImpl implements AccountRepository {
        private EntityManager em;

        public AccountRepositoryImpl(EntityManager em) {
            this.em = em;
        }

        @Override
        public Account findByUserIdAndAccountType(int userId, String accountType) {
            TypedQuery<Account> query = em.createQuery(
                    "SELECT a FROM Account a WHERE a.user.userId = :userId AND a.accountType = :accountType", Account.class);
            query.setParameter("userId", userId);
            query.setParameter("accountType", accountType);
            try {
                return query.getSingleResult();
            } catch (NoResultException e) {
                return null;
            }
        }

        @Override
        public List<Account> findByUserId(int userId) {
            TypedQuery<Account> query = em.createQuery(
                    "SELECT a FROM Account a WHERE a.user.userId = :userId", Account.class);
            query.setParameter("userId", userId);
            return query.getResultList();
        }

        @Override
        public void close() {
            em.close();
        }
    }

    interface ExchangeRateRepository {
        BigDecimal findExchangeRate(String currencyFrom, String currencyTo);
        void close();
    }

    class ExchangeRateRepositoryImpl implements ExchangeRateRepository {
        private EntityManager em;

        public ExchangeRateRepositoryImpl(EntityManager em) {
            this.em = em;
        }

        @Override
        public BigDecimal findExchangeRate(String currencyFrom, String currencyTo) {
            TypedQuery<ExchangeRate> query = em.createQuery(
                    "SELECT e FROM ExchangeRate e WHERE e.currencyFrom = :currencyFrom AND e.currencyTo = :currencyTo", ExchangeRate.class);
            query.setParameter("currencyFrom", currencyFrom);
            query.setParameter("currencyTo", currencyTo);
            try {
                ExchangeRate exchangeRate = query.getSingleResult();
                return exchangeRate.getExchangeRate();
            } catch (NoResultException e) {
                return BigDecimal.ZERO;
            }
        }

        @Override
        public void close() {
            em.close();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();

        // Find all user accounts
        List<Account> accounts = main.getUserAccounts(userId);
        BigDecimal totalAmountInUAH = main.getTotalAmountInUAH(userId);

        if (accounts.isEmpty()) {
            System.out.println("No accounts found for user " + userId);
        } else {
            // Print user ID and name
            String userName = main.getUserName(userId);
            System.out.println("User ID: " + userId + ", User name: " + userName);

            // Loop through each account and print balance for each currency
            for (Account account : accounts) {
                String accountType = account.getAccountType();
                if (accountType.equals("UAH")) {
                    System.out.println("Account type: " + accountType +
                            ", Balance: " + account.getBalance());
                } else {
                    BigDecimal balanceInUAH = account.getBalance().multiply(main.exchangeRateRepository.findExchangeRate(accountType, "UAH"));
                    System.out.println("Account type: " + accountType +
                            ", Balance: " + account.getBalance() +
                            ", Balance in UAH: " + balanceInUAH);
                }
            }

            // Print total amount in UAH
            System.out.println("Total amount in UAH: " + totalAmountInUAH);
        }

        main.close();
    }
}
