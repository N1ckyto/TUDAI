package PROG1.arreglo;

public class SecuenciasExtras3 {

    final static int MAX = 12;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arreglo = {0, 8, 4, -2, 0, 10, 5, 0, 1, 25, 3, 0};
        int ini = 0;
        int fin = -1;
        int tamanio;
        
        // Muestro el arreglo original
        mostrar(arreglo);

        // Mientras haya secuencias (el inicio sea válido)
        while (ini < MAX) {
            // Busco el inicio de la secuencia a partir del fin anterior (o 0 si es la primera iteración)
            ini = buscarInicio(arreglo, fin + 1);
            // Chequeo que el inicio sea válido
            if (ini < MAX) {
                // Busco el fin de la secuencia a partir del inicio
                fin = buscarFin(arreglo, ini);
                // Obtengo el tamaño de la secuencia
                tamanio = fin - ini + 1;
                // Evalúo que la secuencia cumpla con la condición de tener tamaño impar y AL MENOS un elemento par
                if ( tamanio % 2 != 0 && tieneAlMenosUnPar(arreglo, ini, fin)) {
                    // Proceso la secuencia, eliminandola
                    eliminarSecuencia(arreglo, ini, fin);
                    // Actualizo el fin
                    fin = ini;
                }
            }
        }

        // Muestro el arreglo modificado
        mostrar(arreglo);

    }

    // Elimina la secuencia completa
    private static void eliminarSecuencia(int[] arreglo, int ini, int fin) {
        // Realizo tantas eliminaciones (corrimientos a izquierda) como elementos tiene la secuencia
        for (int i = ini; i <= fin; i++)
            corrimientoAIzquierda(arreglo, ini); // Los realizo siempre en ini
    }

    // Corrimiento a izquierda en una posición dada
    private static void corrimientoAIzquierda(int[] arreglo, int pos) {
        for (int i = pos; i < MAX - 1; i++)
            arreglo[i] = arreglo[i + 1];
    }

    // Determina si la secuencia tiene al menos un elemento par
    private static boolean tieneAlMenosUnPar(int[] arreglo, int ini, int fin) {
        // DEBO usar while porque si encuentro un elemento par es suficiente para retornar true
        // Mientras no me "caiga" de la secuencia y siga encontrando elementos impares en el arreglo, avanzo
        while (ini <= fin && arreglo[ini] % 2 != 0)
            ini++;
        
        // Retorno en base a chequear por cual de las dos condiciones del while salimos
        if (ini <= fin) // Si aún ini <= fin significa que salimos porque arreglo[ini] % 2 != 0 fue falso, por lo tanto encontramos un elemento par
            return true;
        else // Si ini > fin, significa que arreglo[ini] % 2 != 0 siempre fue verdadero, por lo tanto, nunca encontré un elemento par
            return false;
        // Equivalente a: return ini <= fin;
    }

    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
        System.out.println();
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
