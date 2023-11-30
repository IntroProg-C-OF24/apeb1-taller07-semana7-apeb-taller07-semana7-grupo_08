package tallersemana7;
import java.util.Scanner;
public class CincoEmpleados {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int i = 1, diastrab;
        double costodia;
        String nombre;
        while (i <= 5) {
            System.out.println("Ingrese el nombre del empleado" + i);
            nombre = put.next();
            System.out.println("Ingrese el numero de dias trabajados");
            diastrab = put.nextInt();
            System.out.println("Ingrese el costo por dia de trabajo");
            costodia = put.nextDouble();
            System.out.println("NOMBRE EMPLEADO " + i + ": " + nombre + " -- DIAS TRABAJADOS: " + diastrab + " -- COSTO POR DIA: $" + costodia + " -- VALOR A CANCELAR: $" + (diastrab * costodia));
            i++;
        }
    }
}