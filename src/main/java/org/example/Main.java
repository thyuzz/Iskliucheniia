package org.example;

import java.util.Scanner;

public class Main {
    // Урок 1. Задание 1.
    public static int div(int a, int b){
        if (b == 0) {
            throw new RuntimeException("Деление на ноль недопустимо");
        }
        return a/b;
    }

    public static void main(String[] args) {
        // Урок 1. Задание 1.
        System.out.println(div(20,5));
        System.out.println(div(2,0));


        // Урок 1. Задание 2.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        String a = in.nextLine();
        try {
            int age = Integer.parseInt(a);
            System.out.printf("Ваш возраст = %d", age);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        }
        System.out.println("Завершение работы");
    }
}