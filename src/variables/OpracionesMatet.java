package variables;

import java.util.Scanner;

public class OpracionesMatet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Pedimos el primer numero al usuario
        System.out.println("Escribe el primer numero entero: ");
        double num1 = scan.nextDouble();

        // Pedimos el segundo numero al usuario
        System.out.println("Escribe el segundo numero entero: ");
        double num2 = scan.nextDouble();

        // opcion de operacion
        boolean salir = false;
        int operacion;
        double result;

        while (!salir) {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones: ");
            operacion = scan.nextInt();

            switch (operacion) {
                case 1:
                    result = num1 + num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("La resta de " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("La division de " + num1 + " / " + num2 + " = " + result);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros del 1 al 5");
                    break;

            }
        }



    }
}
