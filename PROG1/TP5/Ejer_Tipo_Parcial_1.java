package PROG1.TP5;

public class Ejer_Tipo_Parcial_1 {
    final static int MAX = 25;
    final static int R = 22;

    public static void main(String[] args) {
        int arreglo[] = { 0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0 };
        int POS_I = 0;
        int POS_F = 0;
        int C = 2;
        for (int i = 0; i < C; i++) {
            System.out.println("");
            POS_I = Pos_Inicial(arreglo, POS_F);
            POS_F = Pos_Final(arreglo, POS_I);
            Corrimiento_Derecha(arreglo, POS_F);
            Mostrar_Secuencias(POS_I, POS_F, i);
            Mostrar_arreglo(arreglo);
            System.out.println("");
            POS_F++;
        }
    }

    public static int Pos_Inicial(int[] arreglo, int POS_F) {
        int r = 0;
        try {
            for (int p = POS_F; p < MAX; p++) {
                if (arreglo[p] == 0) {
                    r = 0;
                } else if (arreglo[p + 1] == 0) {
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

    public static int Pos_Final(int[] arreglo, int POS_I) {
        int r = 0;
        try {
            for (int p = POS_I; p < MAX; p++) {
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

    public static void Corrimiento_Derecha(int[] arreglo, int POS_F) {
        int aux = 0;
        int r = POS_F + 1;
        for (int i = MAX - 1; i > POS_F + 2; i--) {
            aux = arreglo[i];
            arreglo[i] = arreglo[i - 1];
            arreglo[i - 1] = aux;
        }
        arreglo[r] = R;
    }

    public static void Mostrar_Secuencias(int POS_I, int POS_F, int i) {
        i++;
        System.out.println(
                "Pos_I de la " + i + " secuencia es: " + POS_I + "\n" + "Pos_F de la " + i + " secuencia es: "
                        + POS_F);
    }

    public static void Mostrar_arreglo(int[] arreglo) {
        System.out.print("|");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + "|");
        }
    }
}
