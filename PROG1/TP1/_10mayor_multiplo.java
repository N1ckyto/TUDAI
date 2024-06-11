package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10mayor_multiplo {
    public static void main(String[] args) {
        int num1, num2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("De un valor: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.print("De un valor: ");
            num2 = Integer.valueOf(entrada.readLine());
            if (num1 > num2) {
                System.out.println("> El primer numero es mayor que el segundo numero <");
            } else {
                System.out.println("> El segundo numero es mayor que el primer numero <");
            }
            if (((num1 % 2) == 0) && ((num2 % 2) == 0)) {
                System.out.println("> ambos numeros son multipos de 2 <");
            } else {
                System.out.println("> ambos numeros no son multipos de 2 <");
            }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
