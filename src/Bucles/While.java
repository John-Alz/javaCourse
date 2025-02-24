package Bucles;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // Bucle controlado por contador.

       /* int count = 0;

        while (count <= 10) {
            System.out.println("Estoy en la vuelta #" + count);
            count++;
        } */

        // Bucle controlado por centinela

        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        String respuesta;

        while (flag == true) {
            System.out.println("Tu Suscripcion es: " + flag);
            System.out.println("Quieres desuscribirte?");
            respuesta = scan.next();
            flag = (respuesta.equalsIgnoreCase("Si")) ? false : true;
        }
        System.out.println("------------------------------------------------------------------");
    }
}
