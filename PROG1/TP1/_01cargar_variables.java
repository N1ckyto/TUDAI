package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _01cargar_variables {
    public static void main(String[] args) {
        int numero;
        double valor;
        char letra;
        boolean resultado, t;
        t = true;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("cargar un valor entero: ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("el numero quedo de la siguiente manera: " + numero);
            System.out.print("carge un valor decimal: ");
            valor = Double.valueOf(entrada.readLine());
            System.out.println("el valor quedo de la siguiente manera: " + valor);
            System.out.print("cargue una letra: ");
            letra = entrada.readLine().charAt(0);
            System.out.println("la letra quedo de la siguiente manera: " + letra);
            resultado = t;
            System.out.println("el valor de resultado es: " + resultado);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

}
