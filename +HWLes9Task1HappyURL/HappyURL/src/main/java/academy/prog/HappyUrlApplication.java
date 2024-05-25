package academy.prog;

/*
*9.1.-05.04.2023-HappyURL
*1.	додату в 2-й проєкт ф-ю видалення скорочених посилань
*2.	додати ф-ю “старіння” посилань, щоб вони переставалі працювати через певний час
*3.	Додано новий метод deleteUrl до UrlService, який приймає Long id та видаляє з бази даних посилання
* з відповідним ідентифікатором.
*4.	Додано нове поле expirationTime до UrlDTO, яке вказує час, протягом якого коротке посилання повинно
* бути активним.
*5.	Додано метод isExpired до UrlRecord, який повертає true, якщо минув час expirationTime від часу створення
* посилання.
*6.	Додано перевірку на стан посилання в методі getUrl класу UrlService. Якщо посилання застаріло, повертається
* null.
*7.	Додано додаткову перевірку на існування посилання у методі redirect класу UrlController. Якщо посилання
* не існує, повертається статус NOT_FOUND.
*8.	Додано новий метод ageUrls до UrlService, який збільшує лічильник часу життя посилань та видаляє застарілі.
*9.	Додано регулярну перевірку на застарілість посилань у методі getUrl класу UrlService. Якщо посилання
* застаріло, воно видаляється та повертається null.
* */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HappyUrlApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyUrlApplication.class, args);
    }

}