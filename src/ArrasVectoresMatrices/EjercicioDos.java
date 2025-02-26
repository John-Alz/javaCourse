package ArrasVectoresMatrices;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros [] = {73484,1237, 821,8384};
        int mayor = numeros[0], menor = numeros[0];

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Ingrese un numero: ");
//            numeros[i] = scan.nextInt();
//        }

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        for (int i = 0; i < numeros.length; i++) {
            menor = menor < numeros[i] ? menor : numeros[i];
            mayor = mayor > numeros[i] ? mayor : numeros[i];
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

    }
}
