package edu.guilherme.operadores;

public class Operadores {
    public static void main(String[] args) {
        // String fullName = "Guilherme " + "Henrique de Castro";

        // String concat = "?";
        // System.out.println(concat);

        // concat = 1 + 1 + 1 + "1";
        // System.out.println(concat);

        // concat = 1 + "1" + 1 + 1;
        // System.out.println(concat);

        // concat = 1 + "1" + 1 + "1";
        // System.out.println(concat);

        // concat = "1" + 1 + 1 + 1;
        // System.out.println(concat);

        // concat = "1" + (1 + 1 + 1);
        // System.out.println(concat);

        // int number = 5;
        // System.out.println(number);

        // number = -number;
        // System.out.println(number);

        // number = -number;
        // System.out.println(number);

        // number++;
        // System.out.println(number);

        // System.out.println(++number);

        // number--;
        // System.out.println(number);

        // System.out.println(--number);

        // int otherNumber = ++number;
        // System.out.println(otherNumber);
        // System.out.println(number);

        // boolean trueOrFalse = true;
        // System.out.println(trueOrFalse);
        // System.out.println(!trueOrFalse);
        // System.out.println(trueOrFalse);

        // int a, b;

        // a = 5;
        // b = 6;

        // /*
        // * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // * if(a==b)
        // * resultado = "verdadeiro";
        // * else
        // * resultado = "falso";
        // */

        // // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL
        // TERNÁRIO
        // String result = (a == b) ? "verdadeiro" : "false";

        // System.out.println(result);

        // int numero1 = 1;
        // int numero2 = 2;

        // if (numero1 == numero2)
        // System.out.print("| Numero 1 igual a numero 2 ");

        // if (numero1 > numero2)
        // System.out.print("| Numero 1 maior que numero 2 ");

        // if (numero1 < numero2)
        // System.out.print("| Numero 1 menor que numero 2 ");

        // if (numero1 >= numero2)
        // System.out.print("| Numero 1 maior ou igual que numero 2 ");

        // if (numero1 <= numero2)
        // System.out.print("| Numero 1 menor ou igual que numero 2 ");

        // if (numero1 != numero2)
        // System.out.print("| Numero 1 é diferente de numero 2 ");

        // String nome1 = "JAVA";
        // String nome2 = "JAVA";

        // System.out.println(nome1 == nome2); // true

        // String nome3 = new String("JAVA");

        // System.out.println(nome1 == nome3); // false

        // String nome4 = nome3;

        // System.out.println(nome3 == nome4); // true

        // // equals na parada
        // System.out.println(nome1.equals(nome2)); // ??
        // System.out.println(nome2.equals(nome3)); // ??
        // System.out.println(nome3.equals(nome4)); // ??

        boolean condition1 = true;

        boolean condition2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se condition1 e condition2 forem verdadeiras, executar código"
         */

        if (condition1 && condition2) //os dois valores precisam ser verdadeiros
            System.out.print("Operador E");
        ;

        // Se condition1 OU condition2 for verdadeira, executar código.
        if (condition1 || condition2) //um dos valores precisa ser verdadeiro
            System.out.print("Operador OU");
    }
}
