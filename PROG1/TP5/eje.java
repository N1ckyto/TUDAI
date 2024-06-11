package PROG1.TP5;

public class eje {
    public final static int MAX = 21;
    public final static int R = 200;

    public static void main(String[] args) {
        int[] arrAcc = { -1, 12, 22, 24, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1 };
        int ini = 5;
        int fin = 7;
        mostrar(arrAcc);
        agregarSecuencia(arrAcc, ini, fin);
        mostrar(arrAcc);
    }

    public static void agregarSecuencia(int[] arr, int ini, int fin) {
        for (int v = MAX - 1; v > ini; v--) {
            arr[v] = arr[v - 1];
        }
        arr[ini] = R;
    }

    public static void mostrar(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}
