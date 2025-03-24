package aula_condicional;

public class ResultadoEstudante {
    public static void main(String[] args) {
        // Exercicio4
    	System.out.println("Olá, vamos observar o resultado do estudante!");
        double nota = 5.5; 
        
        
        if (nota > 7) {
            System.out.println("O estudante está aprovado.");
        } else if (nota < 4) {
            System.out.println("O estudante está reprovado.");
        } else {
            System.out.println("O estudante está em recuperação, sua nota foi: " + nota );
        }
    }
}