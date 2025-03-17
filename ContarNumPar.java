package aula_condicional;

import java.util.Scanner;

public class ContarNumPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, vamos verificar os números pares!");

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Números pares até " + numero + ":");
        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}