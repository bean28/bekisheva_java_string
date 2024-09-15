package ru.astondevs;

public class StringOperations {
    public static String compare(String someText1, String someText2) {
        if (someText1.equals(someText2)) {
            return "Строки идентичны";
        } else {
            return "Строки неидентичны";
        }
    }
}
