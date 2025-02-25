package Bucles;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String placa = "", centinela = "";
        int tipoEst = 0,  cantHoras = 0, contPrHr = 0, contMdJd = 0, contJdCt = 0;
        double montoPagar, desc, montoConDesc, ganDia = 0;

        while (!centinela.equalsIgnoreCase("Fin")) {

            System.out.println("Escribe la placa de tu vehiculo: ");
            placa = scan.nextLine();

            System.out.println("Selecciona el tipo de estacionamiento: ");

            System.out.println("1. Estacionamiento por hora.");
            System.out.println("2. Estacionamiento media jornada (5hr).");
            System.out.println("3. Estacionamiento jornada completa (10hr).");


            scan = new Scanner(System.in);
            tipoEst = scan.nextInt();

            if (tipoEst == 1) {
                contPrHr++;
                System.out.println("Cuantas horas deseas dejar tu vehiculo?: ");
                scan = new Scanner(System.in); // podemos usar el mismo escaner porque la ultima vez se uso para un numero, pero ante la duda resetear.
                cantHoras = scan.nextInt();
                montoPagar = cantHoras * 3;
                ganDia += montoPagar;
                System.out.println("Tu costo final sera de $" + montoPagar);
            } else {
                if (tipoEst == 2) {
                    contMdJd++;
                    montoPagar = 15;
                    desc = montoPagar * 0.05;
                    montoConDesc = montoPagar - desc;
                    ganDia += montoConDesc;
                    System.out.println("El servicio de media jornada consta de 5hr y tiene un descuento de 5%");
                    System.out.println("Tu costo final por media jornada sera de $" + montoConDesc);
                } else {
                    if(tipoEst == 3) {
                        contJdCt++;
                        montoPagar = 30;
                        desc = montoPagar * 0.10;
                        montoConDesc = montoPagar - desc;
                        ganDia += montoConDesc;
                        System.out.println("El servicio de media jornada consta de 10hr y tiene un descuento de 10%");
                        System.out.println("Tu costo final por jornada completa sera de $" + montoConDesc);
                    } else {
                        System.out.println("Tipo de estacionamiento no valido (debe ser 1, 2 o 3).");
                    }
                }
            }

            System.out.println("Quieres salir del programa? Escribe 'Fin' sino Escribe 'No'.");
            scan = new Scanner(System.in);
            centinela = scan.nextLine();
        }

        System.out.println("=========================================================================================");

        System.out.println("Cantidad por hora: " + contPrHr);
        System.out.println("Cantidad de media jornada: " + contMdJd);
        System.out.println("Cantidad de jornada completa: " + contJdCt);
        System.out.println("La suma total de ingresos en el dia fue: $" + ganDia);


    }
}
