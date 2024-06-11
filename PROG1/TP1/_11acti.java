package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _11acti {
    public static void main(String[] args) {
        int num1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("De un valor: ");
            num1 = Integer.valueOf(entrada.readLine());
            if (((num1 % 6) == 0) && ((num1 % 7) == 0)) {
                System.out.println("> El nº " + num1 + " es multipo de 6 y 7 <");
            } else {
                System.out.println("> El nº " + num1 + " no es multipo de 6 y 7 <");
            }
            System.out.println(">RESULTADO< " + (num1 % 6));
            System.out.println(">RESULTADO< " + (num1 % 7));
            System.out.println("<------------------------------------------------------->");

            if ((num1 > 30) && ((num1 % 2) == 0)) {
                System.out.println("> El nº " + num1 + " es mayor que 30 y multipo de 2 <");
                System.out.println(">RESULTADO< " + (num1 % 2));
            } else {
                if (num1 <= 30) {
                    System.out.println("> El nº " + num1 + " es menor o igual a 30 <");
                    System.out.println(">RESULTADO< " + num1);
                }
            }
            System.out.println("<------------------------------------------------------->");

            if ((num1 / 5) > 10) {
                System.out.println("el cociente de la division de " + num1 + " por 5 es mayor que 10 ");
            } else {
                System.out.println("> el cociente de la division de " + num1 + " por 5 es menor que 10 <");
            }
            System.out.println(">RESULTADO< " + (num1 / 5));
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
