package maintres;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        /*
           EJERCICIO 3
            Carlos necesita determinar el número mayor entre tres valores ingresados. 
            Escribe un codigo que solicite al usuario ingresar tres números 
            y determine cuál es el mayor de los tres.
        */
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("***INGRESA TRES NUMERO***");
        System.out.print("Ingresa el primer numero: ");
        var numeroUno = entradaDatos.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        var numeroDos = entradaDatos.nextDouble();
        System.out.print("Ingresa el tercer numero: ");
        var numeroTres = entradaDatos.nextDouble();
        
        var auxiliar = numeroUno;
        
        if (numeroDos > auxiliar) {
            auxiliar = numeroDos;
        }
        if (numeroTres > auxiliar) {
            auxiliar = numeroTres;
        }
        
        System.out.println("El numero mayor de los numero ingresados es: " + auxiliar);
    }
}
