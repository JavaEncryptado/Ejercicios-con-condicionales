package maincuatro;

import java.util.Scanner;

public class EjercicioCuatroIf {
    public static void main(String[] args) {
        /*
           PROBLEMA 4.
            Estamos creando un programa para una tienda de mascotas. 
            La tienda tiene una promoción en la que los clientes 
            pueden obtener un descuento basado en la cantidad de productos que compren. 
            El descuento se calcula de la siguiente manera:
        
            Si el cliente compra 1 producto de 100.00 pesos, no obtiene descuento.
            Si el cliente compra entre 2 y 5 productos de $100.00, obtiene un descuento del 10%.
            Si el cliente compra entre 6 y 10 productos de $100.00, obtiene un descuento del 20%.
            Si el cliente compra más de 10 productos de $100.00, obtiene un descuento del 30%.
        */
        Scanner entradaDatos = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de productos comprados: ");
        var cantidadProductos = entradaDatos.nextInt();
        var porcentajeDescuento = 0.0;
        
        if (cantidadProductos >= 2 && cantidadProductos <= 5) {
            porcentajeDescuento = 0.10;
        } else if (cantidadProductos >= 6 && cantidadProductos <= 10) {
            porcentajeDescuento = 0.20;
        } else if (cantidadProductos > 10) {
            porcentajeDescuento = 0.30;
        } else {
            System.out.println("No tienes ningun descuesto");
        }
        
        var precioTotal = cantidadProductos * 100.0;
        var precioTotalConDescuento = precioTotal - (precioTotal * porcentajeDescuento);
        
        System.out.println("Cantidad de productos comprados: " + cantidadProductos);
        System.out.println("Precio total sin descuento: " + precioTotal);
        System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Precio total a pagar con descuento aplicado: " + precioTotalConDescuento);
    }
}
