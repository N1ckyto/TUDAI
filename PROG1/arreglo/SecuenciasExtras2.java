package PROG1.arreglo;

public class SecuenciasExtras2 {
    final static int MAX = 12;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arreglo = { 0, 8, 4, -2, 0, 10, 5, 0, 1, 25, 2, 0 };
        int ini = 0;
        int fin = -1;
        int suma;

        // Muestro el arreglo original
        mostrar(arreglo);

        // Mientras haya secuencias (el inicio sea válido)
        while (ini < MAX) {
            // Busco el inicio de la secuencia a partir del fin anterior (o 0 si es la
            // primera iteración)
            ini = buscarInicio(arreglo, fin + 1);
            // Chequeo que el inicio sea válido
            if (ini < MAX) {
                // Busco el fin de la secuencia a partir del inicio
                fin = buscarFin(arreglo, ini);
                // Evalúo si la secuencia cumple con la condición de ser par la suma de sus
                // elementos
                suma = sumarSecuencia(arreglo, ini, fin);
                if (suma % 2 == 0) {
                    // Proceso la secuencia, incremenetando en 1 cada uno de sus elementos
                    incrementarSecuencia(arreglo, ini, fin);
                }
            }
        }
        // Muestro el arreglo modificado
        mostrar(arreglo);
    }

    // Incrementa en uno todos los elementos de la secuencia
    private static void incrementarSecuencia(int[] arreglo, int ini, int fin) {
        for (int i = ini; i <= fin; i++)
            arreglo[i] += 1;
    }

    // Suma los elementos de la secuencia
    public static int sumarSecuencia(int[] arreglo, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++)
            suma += arreglo[i];
        return suma;
    }

    public static int buscarInicio(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
        System.out.println();
    }
}
