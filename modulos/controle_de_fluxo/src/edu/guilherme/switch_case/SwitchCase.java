package edu.guilherme.switch_case;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o plano para saber os benefícios (B para BÁSICO | M para MÍDIA | T para TURBO");
        String plano = scanner.next();

        switch (plano) {
            case "T": {
                System.out.println("5GB para YouTube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
