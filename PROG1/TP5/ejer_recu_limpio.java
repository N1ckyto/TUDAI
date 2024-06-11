package PROG1.TP5;

public class ejer_recu_limpio {
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
        System.out.println("LA MATRIZ ORIGINAL QUEDO DE LA SIGUIENTE FORMA:");
        imprimir_matriz_int(matriz);
        System.out.println("");
        mostrarSecuencias(matriz);
        System.out.println("LA MATRIZ QUEDO MODIFICADA DE LA SIGUIENTE MANERA");
        imprimir_matriz_int(matriz);
    }

    public static void mostrarSecuencias(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            int pos_i = 0, pos_f = -1;
            while (pos_i < MAXCOLUMNA) {
                pos_i = buscarPos_I(mat[fila], pos_f + 1);
                if (pos_i < MAXCOLUMNA) {
                    pos_f = buscarPos_F(mat[fila], pos_i);
                    if (mat[fila][pos_i] < NUMBER_NEGATIVE) {
                        int numero_corrimiento = 0, cant_numero_Secuencia = 0;
                        cant_numero_Secuencia = cant_numero(mat[fila], pos_i, pos_f);
                        numero_corrimiento = (mat[fila][pos_i] * NUMBER_NEGATIVE) - cant_numero_Secuencia;
                        agregar_secuencia(mat[fila], numero_corrimiento, pos_f);
                        intercambio_numero(mat[fila], pos_i, pos_f, numero_corrimiento);

                    }
                }
            }
        }
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

    public static int cant_numero(int[] arr, int pos_i, int pos_f) {
        int contador = 0;
        while (pos_i <= pos_f) {
            contador++;
            pos_i++;
        }
        return contador;
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

    public static void intercambio_numero(int[] arr, int pos_i, int pos_f, int numero) {
        int valor = arr[pos_f];
        arr[pos_i] = valor;
        for (int i = pos_f + 1; i <= numero + pos_f; i++) {
            arr[i] = valor;
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