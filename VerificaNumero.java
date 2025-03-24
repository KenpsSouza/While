package aula_condicional;

public class VerificaNumero {
    public static void main(String[] args) {
    	//Exercicio3
        System.out.println("Olá, vamos verificar o número!");
        
        int numero = 15; 

        boolean condicao1 = numero > 10 && numero < 20;
        boolean condicao2 = numero > 30 && numero < 40;

        if (condicao1 || condicao2) {
            System.out.println("O número " + numero + " atende às condições.");
        } else {
            System.out.println("O número " + numero + " não atende às condições.");
        }
    }
}