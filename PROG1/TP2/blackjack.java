package PROG1.TP2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class blackjack {
    public static void main(String[] args) {
        int acumulacion = 0, comando = 0, banca = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            acumulacion += (int) ((Math.random() * 100 % 10) + 1);
            System.out.println("Tu numero es:");
            System.out.println(acumulacion);
            while ((acumulacion < 21) && (comando != 2)) {
                System.out.println("Ingrese 1 para pedir o 2 para plantarse:");
                comando = Integer.valueOf(entrada.readLine());
                if (comando == 1) {
                    acumulacion += (int) ((Math.random() * 100 % 10) + 1);
                    System.out.println("Tu numero es:");
                    System.out.println(acumulacion);
                }
            }
            if (comando == 2 || acumulacion > 21) {
                System.out.println("Juega la banca");
                while (banca < 16 && banca <= 21) {
                    banca += (int) ((Math.random() * 100 % 10) + 1);
                    System.out.println("El numero de la banca es:");
                    System.out.println(banca);
                }
            }
            if (acumulacion > 21 && banca > 21) {
                System.out.println("Hay empate");
            } else if (acumulacion < banca && banca <= 21 || acumulacion > 21) {
                System.out.println("Perdiste");
            } else if (acumulacion > banca && acumulacion <= 21 || banca > 21) {
                System.out.println("Ganaste");
            }

        } catch (Exception exec) {
            System.out.println(exec + "error");
        }
    }
}
