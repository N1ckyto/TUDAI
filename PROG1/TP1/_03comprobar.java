package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _03comprobar {

    public static void main(String[] args) {
        int valor;
        final int n = 1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese un valor: ");
            valor = Integer.valueOf(entrada.readLine());
            System.out.println(valor);
            System.out.println(n);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

}
