package PROG1.TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _Bonus1 {
    public static void main(String[] args) {
        int numero_ticket, dia, ultimo_n_dni;
        Double importe1, importe2, importe3, importe_total, descuento;
        String cuit, dni, hora;
        final String producto1 = "Lapiz";
        final String producto2 = "Papel";
        final String producto3 = "Cartuchera";
        final String nombre_cajero = "Luis Mercado";
        final int caja = 8;
        final Double reintegro = 3000.0;
        final String leyenda = "El precio lo pone el cliente";
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Lunes > 1" + "\n" + "Martes > 2" + "\n" + "Miercoles > 3" + "\n" + "Jueves > 4" + "\n"
                    + "Viernes > 5" + "\n" + "Sabado > 6" + "\n" + "Domingo > 7" + "\n");
            System.out.print("Dia: ");
            dia = Integer.valueOf(entrada.readLine());

            System.out.print("Hora: ");
            hora = entrada.readLine();

            System.out.print("Nº de ticket: ");
            numero_ticket = Integer.valueOf(entrada.readLine());

            System.out.print("Cuit: ");
            cuit = entrada.readLine();

            System.out.print("Dni: ");
            dni = entrada.readLine();

            System.out.print("Ultimo digito del Dni:");
            ultimo_n_dni = Integer.valueOf(entrada.readLine());

            System.out.print("Importe Producto 1: ");
            importe1 = Double.valueOf(entrada.readLine());

            System.out.print("Importe Producto 2: ");
            importe2 = Double.valueOf(entrada.readLine());

            System.out.print("Importe Producto 3: ");
            importe3 = Double.valueOf(entrada.readLine());

            importe_total = (importe1 + importe2) + importe3;

            System.out.println("\t\t" + "> Supermercado CARREFIVE <");
            if ((dia == 2) && (importe_total > 13000.0) && (importe_total < 20000.0)) {
                descuento = importe_total - ((importe_total * 5) / 100);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Martes" + "-" + hora + "\t\t\t" + "Ticket Nro."
                        + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n" + "Cajero: " + nombre_cajero + "\t\t\t"
                        + "Caja: " + caja + "\n" + "DNI: " + dni + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto"
                        + "\t\t\t\t" + "Importe" + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2
                        + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                        + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total + "\n" + "Descuento %5:" + "\t\t\t\t"
                        + "$" + descuento);
                System.out.println("-----------------------------------------------------------------");
            } else {
                if ((dia == 2) && (importe_total > 20000.0)) {
                    descuento = importe_total - ((importe_total * 7.5) / 100);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Martes" + "-" + hora + "\t\t\t"
                            + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n" + "Cajero: "
                            + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni + ultimo_n_dni
                            + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe" + "\n" + producto1
                            + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2 + "\t\t\t\t\t" + "$" + importe2 + "\n"
                            + producto3 + "\t\t\t\t" + "$" + importe3 + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$"
                            + importe_total + "\n" + "Descuento %7.5:" + "\t\t\t\t" + "$" + descuento);
                    System.out.println("-----------------------------------------------------------------");
                } else {
                    if (((dia == 4) && (importe_total > 25000))) {
                        descuento = importe_total - ((importe_total * 10) / 100);
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Jueves" + "-" + hora + "\t\t\t"
                                + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n" + "Cajero: "
                                + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni + ultimo_n_dni
                                + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe" + "\n" + producto1
                                + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2 + "\t\t\t\t\t" + "$" + importe2
                                + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t"
                                + "$" + importe_total + "\n" + "Descuento %7.5:" + "\t\t\t\t" + "$" + descuento + "\n"
                                + "Reintegro:" + "\t\t\t\t" + "$" + reintegro);
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        if (dia == 1) {
                            System.out.println("-----------------------------------------------------------------");
                            System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Lunes" + "-" + hora + "\t\t\t"
                                    + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n"
                                    + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni
                                    + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe"
                                    + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2 + "\t\t\t\t\t"
                                    + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                                    + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                            System.out.println("-----------------------------------------------------------------");
                        } else {
                            if (dia == 3) {
                                System.out.println("-----------------------------------------------------------------");
                                System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Miercoles" + "-" + hora + "\t\t\t"
                                        + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n"
                                        + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni
                                        + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe"
                                        + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2
                                        + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3
                                        + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                                System.out.println("-----------------------------------------------------------------");
                            } else {
                                if (dia == 5) {
                                    System.out.println(
                                            "-----------------------------------------------------------------");
                                    System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Viernes" + "-" + hora
                                            + "\t\t\t" + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit
                                            + "\n" + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n"
                                            + "DNI: " + dni + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto"
                                            + "\t\t\t\t" + "Importe" + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1
                                            + "\n" + producto2 + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3
                                            + "\t\t\t\t" + "$" + importe3 + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$"
                                            + importe_total);
                                    System.out.println(
                                            "-----------------------------------------------------------------");
                                } else {
                                    if (dia == 6) {
                                        System.out.println(
                                                "-----------------------------------------------------------------");
                                        System.out.println(
                                                "\t\t" + "> CARREFIVE <" + "\n" + "Sabado" + "-" + hora + "\t\t\t"
                                                        + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: "
                                                        + cuit + "\n" + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: "
                                                        + caja + "\n" + "DNI: " + dni + ultimo_n_dni + "\t\t\t"
                                                        + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe" + "\n"
                                                        + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2
                                                        + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3 + "\t\t\t\t"
                                                        + "$" + importe3 + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$"
                                                        + importe_total);
                                        System.out.println(
                                                "-----------------------------------------------------------------");
                                    } else {
                                        System.out.println(
                                                "-----------------------------------------------------------------");
                                        System.out.println(
                                                "\t\t" + "> CARREFIVE <" + "\n" + "Domingo" + "-" + hora
                                                        + "\t\t\t" + "Ticket Nro." + numero_ticket + "\n" + "\t\t"
                                                        + "CUIT: " + cuit + "\n" + "Cajero: " + nombre_cajero + "\t\t\t"
                                                        + "Caja: " + caja + "\n" + "DNI: " + dni + ultimo_n_dni
                                                        + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t"
                                                        + "Importe" + "\n" + producto1 + "\t\t\t\t\t" + "$"
                                                        + importe1 + "\n" + producto2 + "\t\t\t\t\t" + "$" + importe2
                                                        + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                                                        + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                                        System.out.println(
                                                "-----------------------------------------------------------------");
                                    }

                                }
                            }
                        }
                    }
                }

            }

            System.out.println("\t\t" + "> Supermercado SOBERANO <");

            if ((dia == 5) && ((numero_ticket % 2) == 0) && (importe_total >= 15000.0) && ((ultimo_n_dni % 2) != 0)) {
                descuento = importe_total - ((importe_total * 8) / 100);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("\t\t" + "> SOBERANO <" + "\n" + "Viernes" + "-" + hora + "\t\t\t" + "Ticket Nro."
                        + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n" + "Cajero: " + nombre_cajero + "\t\t\t"
                        + "Caja: " + caja + "\n" + "DNI: " + dni + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto"
                        + "\t\t\t\t" + "Importe" + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2
                        + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                        + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total + "\n" + "Descuento %8:" + "\t\t\t\t"
                        + "$" + descuento);
                System.out.println("-----------------------------------------------------------------");
            } else {
                if ((dia == 6) && ((numero_ticket % 2) == 0) && (importe_total >= 15000.0)
                        && ((ultimo_n_dni % 2) != 0)) {
                    descuento = importe_total - ((importe_total * 8) / 100);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\t\t" + "> SOBERANO <" + "\n" + "Sabado" + "-" + hora + "\t\t\t"
                            + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n" + "Cajero: "
                            + nombre_cajero + "\t\t\t"
                            + "Caja: " + caja + "\n" + "DNI: " + dni + ultimo_n_dni + "\t\t\t" + leyenda + "\n"
                            + "Producto" + "\t\t\t\t" + "Importe" + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1
                            + "\n" + producto2 + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$"
                            + importe3 + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total + "\n"
                            + "Descuento %8:" + "\t\t\t\t" + "$" + descuento);
                    System.out.println("-----------------------------------------------------------------");
                } else {
                    if (dia == 1) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("\t\t" + "> SOBERANO <" + "\n" + "Lunes" + "-" + hora + "\t\t\t"
                                + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n"
                                + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni
                                + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe"
                                + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2 + "\t\t\t\t\t"
                                + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                                + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        if (dia == 2) {
                            System.out.println("-----------------------------------------------------------------");
                            System.out.println("\t\t" + "> SOBERANO <" + "\n" + "Martes" + "-" + hora + "\t\t\t"
                                    + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n"
                                    + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni
                                    + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe"
                                    + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2 + "\t\t\t\t\t"
                                    + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                                    + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                        } else {
                            if (dia == 3) {
                                System.out.println("-----------------------------------------------------------------");
                                System.out.println("\t\t" + "> SOBERANO <" + "\n" + "Miercoles" + "-" + hora + "\t\t\t"
                                        + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n"
                                        + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: " + dni
                                        + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t" + "Importe"
                                        + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2
                                        + "\t\t\t\t\t"
                                        + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$" + importe3 + "\n"
                                        + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                                System.out.println("-----------------------------------------------------------------");
                            } else {
                                if (dia == 4) {
                                    System.out.println(
                                            "-----------------------------------------------------------------");
                                    System.out.println("\t\t" + "> CARREFIVE <" + "\n" + "Jueves" + "-" + hora
                                            + "\t\t\t"
                                            + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit + "\n"
                                            + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n" + "DNI: "
                                            + dni
                                            + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto" + "\t\t\t\t"
                                            + "Importe"
                                            + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1 + "\n" + producto2
                                            + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3 + "\t\t\t\t" + "$"
                                            + importe3
                                            + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$" + importe_total);
                                    System.out.println(
                                            "-----------------------------------------------------------------");
                                } else {
                                    System.out.println(
                                            "-----------------------------------------------------------------");
                                    System.out.println("\t\t" + "> SOBERANO <" + "\n" + "Domingo" + "-" + hora
                                            + "\t\t\t" + "Ticket Nro." + numero_ticket + "\n" + "\t\t" + "CUIT: " + cuit
                                            + "\n" + "Cajero: " + nombre_cajero + "\t\t\t" + "Caja: " + caja + "\n"
                                            + "DNI: " + dni + ultimo_n_dni + "\t\t\t" + leyenda + "\n" + "Producto"
                                            + "\t\t\t\t" + "Importe" + "\n" + producto1 + "\t\t\t\t\t" + "$" + importe1
                                            + "\n" + producto2 + "\t\t\t\t\t" + "$" + importe2 + "\n" + producto3
                                            + "\t\t\t\t" + "$" + importe3 + "\n" + "IMPORTE TOTAL:" + "\t\t\t\t" + "$"
                                            + importe_total);
                                    System.out.println(
                                            "-----------------------------------------------------------------");
                                }
                            }

                        }

                    }
                }

            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
