package Bucles;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit;

        System.out.println("Ingrese hasta que numeor quiere hacer la iteracion: ");
        limit = scan.nextInt();

        for(int i = 0; i < limit; i++) {
            System.out.println("numero: " + (i + 1));
        }

    }
}
