package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        //Обращение по нулевой ссылке
        Object str = null;
        str.toString();
    }
}
