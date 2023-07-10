package mainuno;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        double numeroIngresado = entradaTeclado.nextDouble();
        if (numeroIngresado % 2 == 0) {
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }
    }
}
