package PROG1.TP1;

public class _02cargar_double {
    public static void main(String[] args) {
        final double valor;
        double asigvalor;
        valor = 1.0;

        try {
            asigvalor = valor * 2;
            System.out.println(valor);
            System.out.println(asigvalor);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
