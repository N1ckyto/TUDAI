package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _0prueba {
    public static void main(String[] args) {
        int n;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("ingrese un valor: ");
            n = Integer.valueOf(entrada.readLine());
            System.out.println("el valor ingresado fue: " + n);
        }

        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
