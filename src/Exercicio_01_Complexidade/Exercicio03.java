package Exercicio_01_Complexidade;

import java.util.Random;

public class Exercicio03 {
    public static int encontrarMaiorValor(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        int[] vetor = new int[100];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);
        }


        int maiorValor = encontrarMaiorValor(vetor);

        System.out.println("O maior é: " + maiorValor);
    }
}
