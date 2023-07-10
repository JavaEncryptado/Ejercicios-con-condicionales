package maindos;

import java.util.Scanner;

public class EjercicioDosIf {
    public static void main(String[] args) {
        /*
        Ejercicio 2 
            Nesecitamos un codigo donde podamos ingresar un numero 
            o una cantidad para determinar si es positivo, negativo o es cero.
         */
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        var numeroIngresado = entradaTeclado.nextDouble();
        if (numeroIngresado > 0) {
            System.out.println("El numero " + numeroIngresado + " es POSITIVO");
        } else if (numeroIngresado < 0){
            System.out.println("El numero " + numeroIngresado + " es NEGATIVO");
        } else {
            System.out.println("El numero ingresado es 0");
        }
    }
}
