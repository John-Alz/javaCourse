package ArrasVectoresMatrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        int matriz [][] = new int[3][4];

        Scanner scan = new Scanner(System.in);

        // Recorrido y carga de matrices
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor para la fila " + i + " Columna: " + j);
                matriz[i][j] = scan.nextInt();
            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Fila: " + i + " Columna: " + j + " Valor: " + matriz[i][j]);
            }
        }

    }
}
