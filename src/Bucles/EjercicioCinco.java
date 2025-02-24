package Bucles;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "";

        while (!word.equalsIgnoreCase("Salir")) {
            System.out.println("Ingresa una plabra: ");
            word = scan.next();
            System.out.println(word);
        }
    }
}
