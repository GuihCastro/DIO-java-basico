package edu.guilherme.condicionais;

public class CondicionalComposta {
    public static void main(String[] args) {
        double saldo = 100000;
        System.out.println("Saldo atual: " + saldo);
        double valorSolicitado = 10000;
        System.out.println("Valor solicitado: " + valorSolicitado);

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo final: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
