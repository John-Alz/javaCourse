package variables;

import java.util.Scanner;

public class ConverTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe los grados celsius: ");
        double celsiusUser = scan.nextDouble();
        double fahrenheit = (1.8 * celsiusUser) + 32;

        System.out.println("Los grados celsius " + celsiusUser + " a fahrentheit es: " + fahrenheit);

    }
}
