package edu.guilherme.anatomia_das_classes;
public class MyClass {
   
    public static void main(String[] args) {

        String name = "Guilherme";
        String surname = "Henrique de Castro";

        String fullName = fullName(name, surname);

        System.out.println(fullName);

    }

    public static String fullName(String name, String surname) {
        return "Resultado do método: " + name.concat(" ").concat(surname);
    }

}
