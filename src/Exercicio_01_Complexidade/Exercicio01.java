package Exercicio_01_Complexidade;

public class Exercicio01 {

        public static int calcularTamanho(String[] vetor) {
            int tamanho = 0;

            while(vetor[tamanho] != "."){
                tamanho++;
            }

            return tamanho;
        }

        public static void main(String[] args) {

            String[] vetorDeStrings = {"String 1", "String 2", "String 3", "."};

            int tamanho = calcularTamanho(vetorDeStrings);
            System.out.println("O vetor tem tamanho: " + tamanho);
        }
}
