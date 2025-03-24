package aula_condicional;

import java.util.Scanner;

public class SomaMultiplicacao {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	//Exercicio5
    	 System.out.println("Olá, Digite um número! ");
         int numero = sc.nextInt();

       
        int resultado = numero;

        for (int i = 0; i < 5; i++) {
            resultado += numero;
            resultado *= 2;
        }

       
        System.out.println("O resultado final é: " + resultado);
    }
}

