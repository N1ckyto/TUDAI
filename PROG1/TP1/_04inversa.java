package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _04inversa {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("cargue un valor: ");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.print("cargue un valor: ");
            n2 = Integer.valueOf(entrada.readLine());
            System.out.print("cargue un valor: ");
            n3 = Integer.valueOf(entrada.readLine());
            System.out.print("cargue un valor: ");
            n4 = Integer.valueOf(entrada.readLine());
            System.out.print("cargue un valor: ");
            n5 = Integer.valueOf(entrada.readLine());
            System.out.println("EL SENTIDO INVERSO QUEDO DE LA SIGUIENTE FORMA: ");
            System.out.println(n5);
            System.out.println(n4);
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
