package PROG1.TP5;

public class ayuda {
    public final static int MAX = 21;
    public final static int SEPARATOR = -1;

    public static void main(String[] args) {
        int[] arreglo = { -1, 12, 22, 24, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1 };

        int pos_I = 0;
        int pos_F = -1;
        Mostrar(arreglo);
        pos_I = Buscar_PosI(arreglo, pos_F + 1);
        pos_F = Buscar_PosF(arreglo, pos_I);
        // eliminarSecuencia(arreglo, pos_I, pos_F);
        agregarSecuencia(arreglo, pos_I, pos_F);
        System.out.println("-----------------------------------------");
        System.out.println("pos_i: " + pos_I);
        System.out.println("pos_f: " + pos_F);
        Mostrar(arreglo);
    }

    public static int Buscar_PosI(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARATOR) {
            pos++;
        }
        return pos;
    }

    public static int Buscar_PosF(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARATOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++)
            corrimientoAIzq(arr, ini);
    }

    public static void corrimientoAIzq(int[] arr, int pos) {
        for (int i = pos; i < MAX - 1; i++)
            arr[i] = arr[i + 1];
    }

    public static int agregarSecuencia(int[] arr, int ini, int fin) {
        int cantidad = (-1) * arr[ini];
        arr[ini] = arr[fin];
        for (int i = 0; i < cantidad - 2; i++) {
            correrDerecha(arr, ini);
        }
        return cantidad;
    }

    public static void correrDerecha(int[] arr, int pos) {
        for (int i = MAX - 1; i > pos; i--)
            arr[i] = arr[i - 1];
    }

    public static void Mostrar(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println("");
    }
}
