package condicionales;

import java.util.Scanner;

public class EnglishSchool {
    public static void main(String[] args) {
        int edad;
        Scanner scan = new Scanner(System.in);

        System.out.println("***** BIENVENIDO A ENGLISH SCHOOL *****");
        System.out.println("Ingrese la edad del alumno: ");
        edad = scan.nextInt();

        if (edad >= 4 &&  edad <= 6 ) {
            System.out.println("KINDER: Lunes y Miercoles de 16:00 a 17:00");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("1st Year: Martes y jueves de 16:30 a 17:30");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("2nd Year: Martes y jueves de 17:30 a 19:00");
                } else {
                    if(edad >= 11 && edad <= 13) {
                        System.out.println("3rd Year: Lunes y Miercoles de 17:00 a 18:30");
                    } else {
                        System.out.println("ERROR: La edad ingresada no es valida");
                    }
                }
            }
        }

    }
}
