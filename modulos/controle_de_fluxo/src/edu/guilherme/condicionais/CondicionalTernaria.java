package edu.guilherme.condicionais;

import java.util.Scanner;
import java.util.Locale;

public class CondicionalTernaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe a nota: ");
        double nota = scanner.nextDouble();

        System.out.println("Sua nota final foi: " + nota);

        String resultado = nota >= 7 ? "Aprovado!" : nota < 7 && nota >= 5 ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);

        scanner.close();
    }
}
