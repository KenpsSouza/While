package aula_condicional;

public class Notas {
    public static void main(String[] args) {
    	//Exercicio2
    	System.out.println("Olá, Vamos calcular as notas! ");
        // Notas objetivas
        double[] notasObjetivas = {8.5, 7.0, 9.0, 6.0, 8.0};
        // Notas discursivas
        double[] notasDiscursivas = {9.0, 8.0, 9.5, 7.0, 8.5};

        
        double somaObjetivas = 0;
        double somaDiscursivas = 0;

        
        for (int i = 0; i < notasObjetivas.length; i++) {
            somaObjetivas += notasObjetivas[i];
            somaDiscursivas += notasDiscursivas[i];
        }

     
        double mediaObjetivas = somaObjetivas / notasObjetivas.length;
        double mediaDiscursivas = somaDiscursivas / notasDiscursivas.length;

       
        System.out.println("Média das notas objetivas: " + mediaObjetivas);
        System.out.println("Média das notas discursivas: " + mediaDiscursivas);
    }
}