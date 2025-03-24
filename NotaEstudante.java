package aula_condicional;

import java.util.Scanner;

public class NotaEstudante {
    public static void main(String[] args) {
    	// Exercicio1
        Scanner input = new Scanner(System.in);

        
        double nota1 = obterNota(input, 1);
        double nota2 = obterNota(input, 2);
        double nota3 = obterNota(input, 3);

      
        double media = calcularMedia(nota1, nota2, nota3);

 
        exibirResultado(media);

        input.close();
    }

    
    private static double obterNota(Scanner input, int numeroNota) {
        System.out.println("Digite a nota " + numeroNota + ": ");
        return input.nextDouble();
    }

 
    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }


    private static void exibirResultado(double media) {
        if (media >= 7) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
    }
}