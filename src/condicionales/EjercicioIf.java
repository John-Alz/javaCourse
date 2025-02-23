package condicionales;

import java.util.Scanner;

public class EjercicioIf {
    public static void main(String[] args) {

        int edad;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        edad = scan.nextInt();

        if (edad > 18) {
            System.out.println("Tienes mas de 18 anios");
            if ( edad > 40) {
                System.out.println("Eres generacion X");
            } else {
                System.out.println("Eres generacion milenial");
            }
        } else {
            if (edad == 18) {
                System.out.println("Tienes exactamente 18 anios");
            } else {
                System.out.println("Tienes menos de 18 anios");
            }
        }

        System.out.println("Llegue al final.");

    }

}
