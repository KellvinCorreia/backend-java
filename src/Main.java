import java.util.Arrays;
import java.util.Scanner;


void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o valor de N, que servirá como matriz de ordem N: ");
    int numeroN = scanner.nextInt();
    System.out.println("Agora insira os valores de N: " + numeroN + " em sequencia, são " + numeroN * numeroN + " números");
    int[][] matriz = new int[numeroN][numeroN];

    System.out.println("Insira o numero da matriz: ");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = scanner.nextInt();
        }
    }
    for (int i = 0; i < matriz.length; i++) {
        System.out.println();
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.printf(String.valueOf(matriz[i][j])+" ");
        }
    }
    System.out.println();
    for (int i = 0; i < matriz.length; i++) {
        System.out.println("Diagonal principal " + String.valueOf(matriz[i][i]));
    }
    System.out.println();
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] < 0) {
                System.out.println("Numero negativo encontrado: " + String.valueOf(matriz[i][j]));
            }
        }
    }
    scanner.close();
}