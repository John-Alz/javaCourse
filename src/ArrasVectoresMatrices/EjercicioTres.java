package ArrasVectoresMatrices;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros [] = new int[15];
        int count = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe un numero: ");
            numeros[i] = scan.nextInt();
//            if (numeros[i] == 3) {
//                count++;
//            }
        }


        for (int i = 0; i < numeros.length; i++) { // Luego de cargados lo leemos para tener cada funcion separada
            if (numeros[i] == 3) {
                count++;
            }
        }
        System.out.println("La cantidad de veces que se escribio el numero 3 fueron: " + count);

    }
}
