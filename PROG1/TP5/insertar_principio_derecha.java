package PROG1.TP5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class insertar_principio_derecha {

    final static int MAX = 10;

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int numero = 0;
        numero = pedir_numero();
        Corrimiento_Derecha(arreglo, numero);
        Mostrar_arreglo(arreglo);
    }

    public static int pedir_numero() {
        int numero = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nº que quiere que comience en el arreglo: ");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
            System.out.println("Valor invalido");
        }
        return numero;
    }

    public static void Corrimiento_Derecha(int[] arreglo, int numero) {
        int aux = 0;
        int pos = 0;
        for (int i = MAX - 1; i > 0; i--) {
            aux = arreglo[i];
            arreglo[i] = arreglo[i - 1];
            arreglo[i - 1] = aux;
        }
        arreglo[pos] = numero;
    }

    public static void Mostrar_arreglo(int[] arreglo) {
        System.out.print("|");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
        System.err.println();
    }
}
