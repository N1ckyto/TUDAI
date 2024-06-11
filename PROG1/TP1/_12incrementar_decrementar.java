package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _12incrementar_decrementar {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número entero: ");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro número entero: ");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Números originales: " + numero1 + " " + numero2);
            System.out.println("Números modificados: " + (numero1 + 1) + " " + (numero2 - 1));
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
