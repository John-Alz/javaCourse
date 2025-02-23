package operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Guardar dentro los datos. y toma configuraciones de sistema como idioma de teclado.

        // Declaracion de variables;
        double num1, num2, suma;
        System.out.println("Ingresa el primer numero que quieras operar: ");
        num1 = scan.nextInt(); // Permite traer o leer el entero ingresador por teclado

        System.out.println("Ingresa el segundo numero que quieras operar: ");
        num2 = scan.nextInt();

        suma = num1 + num2;

        System.out.println("El resultado de " + num1 + " + " + num2 + " = " + suma);

    }
}
