import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Digite o valor de n e m separados por espaço: ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        int matriz[][] = new int[n][m];
        int numeroBuscarNaMatriz;
        int qntdNumerosRepetidos = 0;

        System.out.println("Insira os numeros da matriz "+n+" por "+m+", são "+n*m+" números.");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Agora digite um numero para buscar na matriz: ");
        numeroBuscarNaMatriz = scanner.nextInt();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(String.valueOf(matriz[i][j])+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numeroBuscarNaMatriz == matriz[i][j]) {
                    qntdNumerosRepetidos += 1;
                    if (i > 0) {
                        System.out.println("numero de cima" + matriz[i - 1][j]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("numero de baixo" + matriz[i + 1][j]);
                    }
                    if (j > 0 ) {
                        System.out.println("numero da esquerda" + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("numero da direita" + matriz[i][j + 1]);
                    }
                }
            }
        }
        System.out.println("Numero "+numeroBuscarNaMatriz+" foi encontrado "+qntdNumerosRepetidos+" vezes na matriz");
    }
}