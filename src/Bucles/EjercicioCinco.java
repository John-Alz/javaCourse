package Bucles;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "";

        while (!word.equalsIgnoreCase("Salir")) {
            System.out.println("Ingresa una plabra: ");
            word = scan.nextLine();
            System.out.println(word);
        }
        System.out.println("Gracias por usar nuestro programa!!!");
    }
}
