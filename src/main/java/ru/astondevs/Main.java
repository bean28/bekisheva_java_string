package ru.astondevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 'a'");
        String someText1 = scanner.nextLine();
        System.out.println("Введите строку 'b'");
        String someText2 = scanner.nextLine();
        System.out.println(StringOperations.compare(someText1, someText2));
    }
}
