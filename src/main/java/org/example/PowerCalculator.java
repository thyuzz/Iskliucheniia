package org.example;

import java.util.Scanner;

public class PowerCalculator {
    public static double calculatePower(double base, int exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Invalid input: base cannot be 0 and exponent cannot be negative");
        }
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание: ");
        double base;
        try {
            base = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Невверный ввод, основние должно быть числом");
            return;
        }
        System.out.print("Введите степень: ");
        int exponent;
        try {
            exponent = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Невверный ввод, степень должна быть целочисленной и положительной");
            return;
        }
        try {
            double result = calculatePower(base, exponent);
            System.out.println(base + " в степени " + exponent + " равно " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
