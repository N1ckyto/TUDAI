package PROG1.TP2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class juego {
    public static void main(String[] args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int numeroSecreto = (int) (Math.random() * 1000 % 100);
            System.out.println(numeroSecreto);
            System.out.print("ingrese un nº: ");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != numeroSecreto) {
                System.out.println("El numero es incorrecto");
                if (numero > numeroSecreto) {
                    System.out.println("el numero es mayor");
                    
                } else {
                    System.out.println("el numero es menor");
                }
                System.out.println("ingrese un nº:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exec) {
            System.out.println(exec);
        }
    }
}
