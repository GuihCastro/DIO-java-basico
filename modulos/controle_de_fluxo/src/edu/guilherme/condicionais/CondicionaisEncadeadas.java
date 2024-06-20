package edu.guilherme.condicionais;

import java.util.Scanner;
import java.util.Locale;

public class CondicionaisEncadeadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe a nota: ");
        double nota = scanner.nextDouble();

        System.out.println("Sua nota final foi: " + nota);

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota < 7 && nota >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
