package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _09divisores_resto {
    public static void main(String[] args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("INGRESE UN VALOR: ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("El cociente de la division " + numero + " por 2 es: " + (numero / 2));
            System.out.println("El resto de la division " + numero + " por 2 es: " + (numero % 2));
            System.out.println("------------------------------------------------------------");
            System.out.println("El cociente de la division " + numero + " por 3 es: " + (numero / 3));
            System.out.println("El resto de la division " + numero + " por 3 es: " + (numero % 3));
            System.out.println("------------------------------------------------------------");
            System.out.println("El cociente de la division " + numero + " por 4 es: " + (numero / 4));
            System.out.println("El resto de la division " + numero + " por 4 es: " + (numero % 4));

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

}
