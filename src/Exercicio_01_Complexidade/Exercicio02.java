package Exercicio_01_Complexidade;

public class Exercicio02 {

        public static void buscaForcaBruta(String sentenca, String janela) {
            int m = janela.length();
            int n = sentenca.length();

            for (int i = 0; i <= n - m; i++) {
                int j;


                for (j = 0; j < m; j++) {
                    if (sentenca.charAt(i + j) != janela.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    System.out.println("Padrão encontrado na posicao " + (i + 1));
                }
            }
        }

        public static void main(String[] args) {
            String sentenca = "YCTABWATAB";
            String janela = "AB";

            System.out.println("Sentenca: " + sentenca);
            System.out.println("Janela: " + janela);

            System.out.println("Posicao:");
            buscaForcaBruta(sentenca, janela);
        }


}
