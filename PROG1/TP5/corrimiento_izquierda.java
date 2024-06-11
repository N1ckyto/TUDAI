package PROG1.TP5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class corrimiento_izquierda {
    final static int MAX = 10;

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int pos = 0;
        pos = pedir_pos();
        Corrimiento_Izquierda(arreglo, pos);
        Mostrar_arreglo(arreglo);
    }

    public static int pedir_pos() {
        int pos = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Posicion que quiere que comience el corrimiento: ");
            pos = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
            System.out.println("Valor invalido");
        }
        return pos;
    }

    public static void Corrimiento_Izquierda(int[] arreglo, int pos) {
        int aux = 0;
        for (int i = pos; i < MAX - 1; i++) {
            aux = arreglo[i];
            arreglo[i] = arreglo[i + 1];
            arreglo[i + 1] = aux;
        }
    }

    public static void Mostrar_arreglo(int[] arreglo) {
        System.out.print("|");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
        System.err.println();
    }
}
