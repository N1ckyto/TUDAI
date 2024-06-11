package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _07operaciones {
    public static void main(String[] args) {
        int num1, num2, num3, resultado;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese 1 valor: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.print("Ingrese 1 valor: ");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.print("Ingrese 1 valor: ");
            num3 = Integer.valueOf(entrada.readLine());
            resultado = (num1 / num2) - num3;
            System.out.println("el resultado final es: " + resultado);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}