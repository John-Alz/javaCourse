package Bucles;

public class DoWhile {
    public static void main(String[] args) {

        int contador = 0;

        do {
            System.out.println("Estoy en la vuelta: #" + contador);
            contador++;
        } while (contador < 10);
    }
}
