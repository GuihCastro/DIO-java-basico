package edu.guilherme.tipos_e_variaveis;

public class TiposVariaveis {
   public static void main(String[] args) {
      // Tipos Primitivos
      byte age = 31;
		short year = 2024;
		int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; //deve terminar em 'L' e se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F; //deve terminar em 'F'
      double minimunSalary = 2500;
      /* 'String' é uma classe, e não um tipo primitivo, por isso inicia com letra maiúscula */

      // Conversão de int para short
      short shortNumber = 1;
      int regularNumber = shortNumber;
      short shortNumber2 = (short) regularNumber;

      // Variável vs Constante
      int number = 1; //variável
      number = 2; //posso alterar

      final double OTHER_NUMBER = 2500.00; //o 'final' bloqueia a constante, a caixa alta é uma convenção
      // ! OTHER_NUMBER = 3000.00; não posso alterar
   }
}
