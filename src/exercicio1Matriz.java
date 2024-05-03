import java.util.Arrays;
import java.util.Random;

public class exercicio1Matriz {
    public static void main(String[] args) {
        /*
         * Gerar e escrever uma matriz bidimensional de tamanho 9x7,
         * com números aleatórios entre zero e cem. Ao final, imprimir a média geral dos
         * números da tabela.
         */

        int linha = 9;
        int coluna = 5;
        int[][] matriz = new int[linha][coluna];

        Random random = new Random();
        int soma = 0;
        for (int i = 0; i < linha; i++) {

            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = random.nextInt(101);
                soma = soma + matriz[i][j];
            }


            System.out.println(Arrays.toString(matriz[i]));
        }
        double media = soma/(linha * coluna);
        System.out.println(soma);
        System.out.println(media);
    }
}
