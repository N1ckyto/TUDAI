package PROG1.arreglo;

public class SecuenciasExtras1 {
    final static int MAX = 11;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        // Definición por extensión del arreglo
        int[] arreglo = { 0, 2, 4, 5, 0, 8, 0, 16, 20, 22, 0 };
        // Inicio y fin de la secuencia
        int ini = 0;
        int fin = -1;
        int cantNumerosPares;
        int mayorCantidad = -1;
        int iniMayor = -1, finMayor = -1;

        // Mientras haya secuencias (el inicio sea válido)
        while (ini < MAX) {
            // Busco el inicio de la secuencia a partir del fin anterior (o 0 si es la
            // primera iteración)
            ini = buscarInicio(arreglo, fin + 1);
            // Chequeo que el inicio sea válido
            if (ini < MAX) {
                // Busco el fin de la secuencia a partir del inicio
                fin = buscarFin(arreglo, ini);
                // En condiciones de procesar la secuencia entre ini y fin
                cantNumerosPares = contarNumerosPares(arreglo, ini, fin); // Proceso la secuencia
                if (cantNumerosPares > mayorCantidad) {
                    // Guardo la mayor cantidad hasta el momento
                    mayorCantidad = cantNumerosPares;
                    // Guardo el inicio y el fin de la secuencia con mayor cantidad hasta el momento
                    iniMayor = ini;
                    finMayor = fin;
                }
            }
        }
        // Informo los resultados
        System.out.println("La mayor cantidad de pares esta entre " + iniMayor + " y " + finMayor);
    }

    public static int contarNumerosPares(int[] arreglo, int ini, int fin) {
        int cont = 0;
        // Para contar, debo recorrer toda la secuencia (puedo usar un for o un while)
        while (ini <= fin) {
            // Si el elemento en la posición ini es par entonces lo cuento
            if (arreglo[ini] % 2 == 0)
                cont++;
            ini++; // Actualizo la variable de control
        }

        // Retorno la cantidad de números pares que posee la secuencia
        return cont;
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
}
