package PROG1.TP5;

public class Encontrar_Primer_Secuencia {
    final static int MAX = 10;

    public static void main(String[] args) {
        int arreglo[] = { 0, 3, 5, 6, 0, 0, 2, 4, 6, 0 };
        int POS_I = 0;
        int POS_F = 0;
        POS_I = Pos_Inicial(arreglo);
        POS_F = Pos_Final(arreglo);
        Mostrar_arreglo(arreglo);
        Mostar_Secuencias(POS_I, POS_F);
    }

    public static int Pos_Inicial(int[] arreglo) {
        int r = 0;
        try {
            for (int p = 0; p < MAX; p++) {
                if (arreglo[p] == 0) {
                    r = 0;
                } else {
                    r = p;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return r;
    }

    public static int Pos_Final(int[] arreglo) {
        int r = 0;
        try {
            for (int p = 0; p < MAX; p++) {
                if (arreglo[p] == 0) {
                    r = 0;
                } else if ((arreglo[p] != 0) && (arreglo[p + 1] == 0)) {
                    r = p;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return r;
    }

    public static void Mostrar_arreglo(int[] arreglo) {
        System.out.print("|");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
        System.err.println();
    }

    public static void Mostar_Secuencias(int POS_I, int POS_F) {
        System.out.println(
                "Pos_I de la primer secuencia es: " + POS_I + "\n" + "Pos_F de la primer secuencia es: "
                        + POS_F);
    }

}
