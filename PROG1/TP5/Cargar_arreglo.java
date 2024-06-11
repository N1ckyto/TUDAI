package PROG1.TP5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cargar_arreglo {
    final static int MAX = 15;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        CargarArreglo(arreglo);
        MostrarArreglo(arreglo);
    }

    public static void CargarArreglo(int[] arreglo) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int pos = 0; pos < MAX; pos++) {
                System.out.print("Ingrese el entero de la posición " + pos + ": ");
                arreglo[pos] = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void MostrarArreglo(int[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
        System.out.println();
    }
}
