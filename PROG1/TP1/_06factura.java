package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _06factura {
    public static void main(String[] args) {
        char factura;
        int numero_de_factura;
        String nombre_completo;
        String producto1;
        Double importe1;
        String producto2;
        Double importe2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Tipo de factura?: ");
            factura = entrada.readLine().charAt(0);
            System.out.print("Numero de factura: ");
            numero_de_factura = Integer.valueOf(entrada.readLine());
            System.out.print("Nombre completo: ");
            nombre_completo = entrada.readLine();
            System.out.print("producto a llevar?: ");
            producto1 = entrada.readLine();
            System.out.print("Importe del producto?: ");
            importe1 = Double.valueOf(entrada.readLine());
            System.out.print("producto a llevar?: ");
            producto2 = entrada.readLine();
            System.out.print("Importe del producto?: ");
            importe2 = Double.valueOf(entrada.readLine());
            System.out.println("----------------------------------------");
            System.out.println("Factra\t " + factura + "\t\t N " + numero_de_factura);
            System.out.println("Nombre: " + nombre_completo);
            System.out.println("Producto \t\t" + "Importe");
            System.out.println(producto1 + "\t\t\t" + "$" + importe1);
            System.out.println(producto2 + "\t\t\t" + "$" + importe2);
            System.out.println("Importe total \t\t" + "$" + (importe1 + importe2));

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
