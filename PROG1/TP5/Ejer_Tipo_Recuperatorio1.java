package PROG1.TP5;

public class Ejer_Tipo_Recuperatorio1 {
    public static int MAXFILA = 3;
    public static int MAXCOLUMNA = 20;
    public static int SEPARATOR = 0;
    public static int NUMBER_NEGATIVE = -1;
    public static int COMPARATIVE = 1;

    public static void main(String[] args) {
        int[][] matriz = {
                { 0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 25, 25, 0, -5, 3, 0, 25, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        imprimir_matriz_int(matriz);
        System.out.println("");
        encontrarSecuencias(matriz);
        imprimir_matriz_int(matriz);
    }

    public static void encontrarSecuencias(int[][] mat) {
        int cantidadt = 0;
        for (int fila = 0; fila < MAXFILA; fila++) {
            int pos_i = 0, pos_f = -1, cantidad = 0;
            while (pos_i < MAXCOLUMNA) {
                pos_i = buscarPos_I(mat[fila], pos_f + 1);
                if (pos_i < MAXCOLUMNA) {
                    pos_f = buscarPos_F(mat[fila], pos_i);
                    if (valuePosMat(mat[fila], pos_i) < NUMBER_NEGATIVE) {
                        cantidad += cantidadD(mat[fila], pos_i);
                        numeroNegativo(mat[fila], pos_i, pos_f);
                    }
                }
            }
            cantidadt += cantidad;
            System.out.println("la cantidad en la fila " + fila + " es: " + cantidad);
        }
        System.out.println("cantidad total es: " + cantidadt);
    }

    public static int buscarPos_I(int[] arr, int pos) {
        while ((pos < MAXCOLUMNA) && (arr[pos] == SEPARATOR)) {
            pos++;
        }
        return pos;
    }

    public static int buscarPos_F(int[] arr, int pos) {
        while ((pos < MAXCOLUMNA) && (arr[pos] != SEPARATOR)) {
            pos++;
        }
        return pos - 1;
    }

    public static int valuePosMat(int[] arr, int pos) {
        int valor = arr[pos];
        return valor;
    }

    public static void numeroNegativo(int[] arr, int pos_i, int pos_f) {
        int numero_corrimiento = 0, numero = arr[pos_f];
        numero_corrimiento = Math.abs(arr[pos_i]) - 2;
        agregar_secuencia(arr, numero_corrimiento, pos_f);
        intercambio_numero(arr, pos_i, pos_f, numero_corrimiento, numero);
    }

    public static int cantidadD(int[] arr, int pos_i) {
        int cantidadD = 0;
        cantidadD += Math.abs(arr[pos_i]);
        return cantidadD;
    }

    public static void agregar_secuencia(int[] arr, int numero_corrimiento, int pos) {
        for (int v = 0; v < numero_corrimiento; v++) {
            corrimiento_derecha(arr, pos);
        }
    }

    public static void corrimiento_derecha(int[] arr, int pos) {
        int aux = 0;
        for (int p = MAXCOLUMNA - 1; p > pos + 1; p--) {
            aux = arr[p];
            arr[p] = arr[p - 1];
            arr[p - 1] = aux;
        }
    }

    public static void intercambio_numero(int[] arr, int pos_i, int pos_f, int numero_corrimiento, int numero) {
        for (int i = pos_i; i <= numero_corrimiento + pos_f; i++) {
            arr[i] = numero;
        }
    }

    public static void imprimir_matriz_int(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo_int(mat[fila]);
            System.out.println("");
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        System.out.print("|");
        for (int COLUMNA = 0; COLUMNA < MAXCOLUMNA; COLUMNA++) {
            System.out.print(arr[COLUMNA] + "|");
        }
    }
}
