package Prueba_01;

import java.util.concurrent.ThreadLocalRandom;

public class TestMetodosAbreviados {

    public static void main(String[] args) {
        double[] numeros = new double[10];

        ThreadLocalRandom aleatorio = ThreadLocalRandom.current();

        for (int j = 0; j < numeros.length; j++) {

            if (j < numeros.length - 1) {
                numeros[j] = aleatorio.nextInt(10, 20);
                System.out.print("["+numeros[j]+"]");
                numeros[9]=numeros[9] +numeros[j] * 0.10 ;
                System.out.println("["+numeros[9]+"]");
            }

        }

    }
}
