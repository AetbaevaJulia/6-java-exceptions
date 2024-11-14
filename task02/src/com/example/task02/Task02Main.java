package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
//        System.out.println(getSeason(-5));
//         for (int i = 1; i <= 12; i++){
//             System.out.println(getSeason(i));
//         }
    }

    static String getSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12){
            if (monthNumber <= 2 || monthNumber == 12){
                return "зима";
            }
            else if (monthNumber >= 3 && monthNumber <= 5){
                return "весна";
            }
            else if (monthNumber >= 6 && monthNumber <= 8){
                return "лето";
            }
            else if (monthNumber >= 9 && monthNumber <= 11){
                return "осень";
            }
        }
        throw new IllegalArgumentException(String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber));
    }
}