package ArrasVectoresMatrices;

import java.util.Scanner;

public class EjercicioExtra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alumnNotas [][] = new double[4][3]; // Primero filas y despues columnas;
        double promVector [] = new double[4];
        double prom=0, sum=0;

        for(int i =0; i < alumnNotas.length; i++) {
            System.out.println("Ingrese las 3 notas del alumno: #" + (i + 1));
            for (int j = 0; j < alumnNotas[0].length; j++) {
                alumnNotas[i][j] = scan.nextDouble();
            }
        }

        System.out.println("*******************************************************************************");

        for(int i =0; i < alumnNotas.length; i++) {
            for (int j = 0; j < alumnNotas[0].length; j++) {
               sum += alumnNotas[i][j];
            }
            prom = sum / alumnNotas[0].length;
            promVector[i] = prom;
            sum = 0;
        }

        for(int i =0; i < alumnNotas.length; i++) {
            System.out.println("Las notas del alumno #" + (i+1));
            for (int j = 0; j < alumnNotas[0].length; j++) {
                System.out.println(alumnNotas[i][j]);
            }
            System.out.println("Promedio: " + promVector[i]);
        }

    }
}
