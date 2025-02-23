package condicionales;

import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        //Declaracion de variables.

        Scanner scan = new Scanner(System.in);

        int dia;
        String nombreDia = "";

        System.out.println("Ingrese un numero del 1 al 7: ");
        dia = scan.nextInt();

        switch(dia) {
            case 1 :
                nombreDia = "Lunes";
                break;
            case 2 :
                nombreDia = "MArtes";
                break;
            case 3 :
                nombreDia = "Miercoles";
                break;
            case 4 :
                nombreDia = "Jueves";
                break;
            case 5 :
                nombreDia = "Viernes";
                break;
            case 6 :
                nombreDia = "Sabado";
                break;
            case 7 :
                nombreDia = "Domingo";
                break;
            default:
                System.out.println("ERROR: Deben se numeros del 1 al 7");
                break;
        }

        System.out.println("El dia de la semana es: " + nombreDia);
    }
}
