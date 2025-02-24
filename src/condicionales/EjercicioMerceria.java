package condicionales;

import java.util.Scanner;

public class EjercicioMerceria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantityProducts;
        double totalPrice, diff, discount, totalWithDiscount;

        System.out.println("**** Bienvenido a mayorista Merceria ****");

        // Requerimos la cantidad de productos a comprar
        System.out.println("Ingrese la cantidad de productos que desea comprar: ");
        quantityProducts = scan.nextInt();


        // Validaciones
        if (quantityProducts < 5) {
            if (quantityProducts < 0) {
                System.out.println("No puedes hacer comprar negativas");
            } else {
                System.out.println("No puedes comprar menos de 5 productos.");
            }
        } else {

            System.out.println("Ingrese el precio total de la compra: ");
            scan = new Scanner(System.in);
            totalPrice = scan.nextDouble();

            if (quantityProducts >= 5 && quantityProducts <=15) {
                totalPrice += 10;
                System.out.println("Tu compra tendra un costo de envio de 10$");
            } else {
                System.out.println("Felicidades, tu compra es superior a 15 productos, el envio es gratis.");
            }

            if (totalPrice < 100) {
                diff = 100 - totalPrice;
                System.out.println("No hay promociones te faltan $" + diff + " para obtener descuento." );
            } else {
                if (totalPrice >= 100 && totalPrice <= 300) {
                    discount = totalPrice * 0.05;
                    totalWithDiscount = totalPrice - discount;
                    System.out.println("Felicidades, tienes el 5% de descuento: $" + discount + " total con descuento es: $" + totalWithDiscount );
                } else {
                    discount = totalPrice * 0.10;
                    totalWithDiscount = totalPrice - discount;
                    System.out.println("Felicidades, tienes el 10% de descuento: $" + discount + " total con descuento es: $" + totalWithDiscount );
                }
            }

        }


//        if (quantityProducts < 5) {
//            System.out.println("No puedes comprar menos de 5 productos.");
//        } else if (quantityProducts >=5 && quantityProducts <= 15) {
//            System.out.println("Tu compra tendra un costo de envio de 10$");
//        } else {
//            System.out.println("Felicidades, tu compra es superior a 15 productos, el envio es gratis.");
//        }

    }
}
