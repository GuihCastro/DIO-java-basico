package edu.guilherme.condicionais;

public class CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 100000;
        System.out.println("Saldo atual: " + saldo);
        double valorSolicitado = 5000;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println("Saldo atualizado: " + saldo);
    }
}
