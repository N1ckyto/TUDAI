package PROG1.EXTRAS_PRUEBA;

public class ayuda_matriz {
    public final static int MAXFILA = 2;
    public final static int MAXCOLUMNA = 3;

    public static void main(String[] args) {
        int numero = 5;
        int[][] matriz = { { 1, 2, 3 },
                { 4, 5, 6 }
        };
        mostrarmatriz(matriz, numero);
        mostrarn(matriz);
        mostrarMatrizentera(matriz);
    }

    public static int buscarpos(int[] arr, int numero) {
        int i = 0;
        while ((i < MAXCOLUMNA) && (arr[i] != numero)) {
            i++;
        }
        return i;
    }

    public static void mostrarmatriz(int[][] mat, int numero) {
        int fila = 0, columna = MAXCOLUMNA;
        while ((fila < MAXFILA) && (columna == MAXCOLUMNA)) {
            columna = buscarpos(mat[fila], numero);
            if (columna == MAXCOLUMNA) {
                fila++;
            }
        }
        if ((fila < MAXFILA) && (columna < MAXCOLUMNA)) {
            System.out.println(numero + " se encuentra en la fila " + fila + " columna " + columna);
        } else {
            System.out.println("no se encontro el numero en la matriz");
        }
    }

    public static void mostrarMatrizentera(int[][] matriz) {
        for (int f = 0; f < MAXFILA; f++) {
            for (int c = 0; c < MAXCOLUMNA; c++) {
                System.out.print("|");
                System.out.print(matriz[f][c] + "|");
            }
            System.out.println("");
        }
    }

    public static void mostrarn(int[][] Mat) {
        System.out.println("el nummero que queria encontar esta en: " + Mat[0][1]);

    }
}
