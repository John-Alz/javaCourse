package ArrasVectoresMatrices;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombres [] = new String[8];

        for(int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre #" + (i + 1));
            nombres[i] = scan.next();
        }

        System.out.println("Los nombres que ingresaste fueron: ");

        for(int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre #" + (i + 1) + " => " + nombres[i]);
        }


    }
}
