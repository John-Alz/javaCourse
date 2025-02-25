package ArrasVectoresMatrices;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numeros [] = new int [8];
//        int numeros [] = {15,35,22,14,64,61,91,23}; Usar cuando sabemos el tamanio y valores delk vector
//        numeros[0] = 15;
//        numeros[1] = 35;
//        numeros[2] = 22;
//        numeros[3] = 14;
//        numeros[4] = 64;
//        numeros[5] = 61;
//        numeros[6] = 91;
//        numeros[7] = 23;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un numero entero: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("Los valores ingresados fueron: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + ": " + numeros[i]);
        }
    }
}
