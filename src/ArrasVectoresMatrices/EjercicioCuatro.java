package ArrasVectoresMatrices;

public class EjercicioCuatro {
    public static void main(String[] args) {
        int sueldos [] = {1200, 14500, 10000, 11300, 12200, 13000, 12334, 10653, 8506, 13644, 16283, 17474};
        int sumaSueldos = 0;
        double prom = 0;

        for(int i = 0; i < sueldos.length; i++) {
            sumaSueldos += sueldos[i];
        }

        prom = sumaSueldos / sueldos.length;

        System.out.println("La suma de los sueldos fue: " + sumaSueldos);
        System.out.println("Y el promedio fue: " + prom);
    }
}
