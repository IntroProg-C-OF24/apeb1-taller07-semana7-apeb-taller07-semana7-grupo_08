package javaapplication11;
import java.util.Scanner;
public class empresa_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ventasR = 0;
        while (ventasR < 7) {
            System.out.println("Ingrese los datos para la venta " + (ventasR + 1) + ":");
            
            System.out.print("Nombre del cliente: ");
            String nombreCliente = teclado.next();
            
            System.out.print("Costo de la computadora: ");
            double costoComp = teclado.nextDouble();
            
            System.out.print("Tipo de cliente (1, 2, u otro): ");
            int tipoCliente = teclado.nextInt();
            
            double descuento = 0.0;

            if (tipoCliente == 1) {
                descuento = 0.10;
            } else if (tipoCliente == 2) {
                descuento = 0.20;
            }

            double precioFinal = costoComp - (costoComp * descuento);

            System.out.println("Cliente tipo " + tipoCliente + ", compra computadora con precio $" + costoComp +
                    " con descuento del " + (descuento * 100) + "%. Precio final: $" + precioFinal);
            ventasR++;
        }
    }
}

    

