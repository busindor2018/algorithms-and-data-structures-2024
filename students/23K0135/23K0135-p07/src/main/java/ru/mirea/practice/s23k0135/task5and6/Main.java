package ru.mirea.practice.s23k0135.task5and6;

public abstract class Main {
    public static void main(String[] args) {
        Processable processer = new ProcessString();
        String s = "Hello, world!";
        System.out.println(processer.countChars(s, 'o'));
        System.out.println(processer.oddPlaces(s));
        System.out.println(processer.invert(s));
    }
}
