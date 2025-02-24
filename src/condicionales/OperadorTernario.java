package condicionales;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // Programa que dependendiendo del promedio de un alumno nos diga si aprobo o no una materia.

        Scanner scan = new Scanner(System.in);
        double prom;
        String result;

        System.out.println("Ingrese el promedio del alumno: ");
        prom = scan.nextDouble();

        result = (prom >= 6) ? "Aprobaste la materia" : "No aprobaste la materia";
        System.out.println(result + " tu promedio fue: " + prom);

    }
}
