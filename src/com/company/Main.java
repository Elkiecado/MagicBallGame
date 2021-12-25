package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomInt = new Random(); // Для определения приветствия
        Random randomSecondInt = new Random(); // Для определения результата
        Scanner text = new Scanner(System.in); // Дает игроку ввести значение
        int random = randomInt.nextInt(3); // Задает число от 0 до 3 для определения индекса массива приветствия
        int randomSecond = randomSecondInt.nextInt(20); // Задает число от 0 до 20 для определения результата

        System.out.println("Задай вопрос на который можно дать только точный ответ: ");

        String Greetings[] = {"Привет, дорогой друг. Отвечаю на твой вопрос...", "Кто вопрошает, тот получит ответ:",
                "Здравствуй, смертный. Сегодня для тебя такой ответ:"}; //Массив с приветсвиями
        String Result[] = {
                //положительные
        "Бесспорно",
                "Предрешено",
                "Никаких сомнений",
                "Определённо да",
                "Можешь быть уверен в этом",
                //нерешительно положительные
        "Мне кажется — «да»",
                "Вероятнее всего",
                "Хорошие перспективы",
                "Знаки говорят — «да»",
                "Да",
                //нейтральные
        "Пока не ясно, попробуй снова",
                "Спроси позже",
                "Лучше не рассказывать",
                "Сейчас нельзя предсказать",
                "Сконцентрируйся и спроси опять",
                //отрицательные
        "Даже не думай",
                "Мой ответ — «нет»",
                "По моим данным — «нет»",
                "Перспективы не очень хорошие",
                "Весьма сомнительно"};//Второй массив для ответов на вопросы

        String question;
        question = text.nextLine();//Вопрос
        String Answer;
        System.out.println(Greetings[random] + Result[randomSecond]);// ответ ;)


    }
}
