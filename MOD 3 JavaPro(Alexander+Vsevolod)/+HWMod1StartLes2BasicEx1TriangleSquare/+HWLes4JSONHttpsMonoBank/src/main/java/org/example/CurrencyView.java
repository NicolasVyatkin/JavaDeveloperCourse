package org.example;

/*
* 4.1. 02.03.2023
ДЗ: https://api.monobank.ua/docs/
1) Забрати курс доллара через HTTPS
2) Розпарсити відповідь в JSON
3) Вивести курс грн на консоль  
* */


public class CurrencyView {
    public static void main(String[] args) {
        MonoBank monoBank = new MonoBank();
        System.out.println(monoBank.prettyPrint());
        System.out.println("""
                
                Currency converted:
                """);
        System.out.println(monoBank.prettyPrint("EUR"));
    }
}