package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _05pedir_datos {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Double altura;
        String ocupacion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("ingrese su nombre: ");
            nombre = entrada.readLine();
            System.out.print("ingrese su edad: ");
            edad = Integer.valueOf(entrada.readLine());
            System.out.print("ingrese su altura: ");
            altura = Double.valueOf(entrada.readLine());
            System.out.print("ingrese su ocupacion: ");
            ocupacion = entrada.readLine();
            System.out.println("---------------------------------");
            System.out.println("FICHA DE LA PERSONA: ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Ocupación: " + ocupacion);

        } catch (Exception exc) {
            System.out.println(exc);
        }

    }

}
