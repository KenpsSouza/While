package aula_condicional;

import java.util.Scanner;

public class DivisaoCorreta {
    public static void main(String[] args) {
        // Exercicio6
        System.out.println("Olá, Vamos realizar uma divisão!");
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Digite o dividendo: ");
        double dividendo = sc.nextDouble();

        double divisor = 0;
        int tentativas = 0;
        final int maxTentativas = 3;

       
        while (tentativas < maxTentativas) {
            System.out.println("Digite o divisor: ");
            divisor = sc.nextDouble();

            if (divisor != 0) {
                double resultado = dividendo / divisor;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
            } else {
                tentativas++;
                System.out.println("Erro: Divisão por zero não é permitida. Tentativas restantes: " + (maxTentativas - tentativas));
            }
        }

        if (tentativas == maxTentativas) {
            System.out.println("Número máximo de tentativas atingido. Não foi possível realizar a divisão.");
        }

        sc.close();
    }
}
