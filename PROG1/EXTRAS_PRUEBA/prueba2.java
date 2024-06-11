package PROG1.EXTRAS_PRUEBA;

public class prueba2 { 
    public static void main(String[] args) {
        final int max = 10;
        int[] arr = { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };
        int i = 0;
        mostrar(arr, max);
        System.out.println("el arreglo comenzo asi");
        while (i < max) {
            if (arr[i] > 5 || arr[i] % 2 == 0) {
                corrimientoAIzq(arr, i, max);
                mostrar(arr, max);
            }
            i++;
        }
    }

    public static void corrimientoAIzq(int[] arr, int pos, int MAX) {
        for (int i = pos; i < MAX - 1; i++)
            arr[i] = arr[i + 1];
    }

    public static void mostrar(int[] arr, int MAX) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}