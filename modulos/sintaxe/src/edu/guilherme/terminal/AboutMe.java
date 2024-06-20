package edu.guilherme.terminal;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome? ");
        String name = scanner.nextLine();

        System.out.println("E sobrenome? ");
        String surname = scanner.nextLine();

        System.out.println("Idade? ");
        int age = scanner.nextInt();

        System.out.println("E altura? ");
        double height = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá! Me chamo " + name + " " + surname);
        System.out.println("Tenho " + age + " anos de idade, e meço " + height + "m");
    }
}
