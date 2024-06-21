package edu.guilherme.tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
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
        catch (InputMismatchException e) {
            System.err.println("Os dados fornecidos para idade e altura precisam ser numéricos, e a altura deve ser escrita com ponto ('.') ao invés de vírgula (',')");
        }
    }
}
