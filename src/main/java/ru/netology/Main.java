package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 34565432";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-123-45-67";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 6;
        post.birthday.year = 1990;
    }
}
