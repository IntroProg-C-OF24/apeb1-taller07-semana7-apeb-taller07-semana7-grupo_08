package javaapplication11;

import java.util.Scanner;

public class Jugadores_04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String reporte = "";
        int cont = 0;
        int sumaEdades = 0;
        double sumaEstaturas = 0;

        System.out.println("¿Deseas ingresar un jugador? (S/N): ");
        String newJugador = teclado.nextLine();

        if (newJugador.equals("S")) {
            cont++;
            while (cont > 0) {
                System.out.println("Ingrese el nombre del jugador:");
                String nombre = teclado.next();
                System.out.println("Ingrese la posición en el campo:");
                String posicion = teclado.next();
                System.out.println("Ingrese la edad:");
                int edad = teclado.nextInt();
                sumaEdades += edad;
                System.out.println("Ingrese la estatura:");
                double estatura = teclado.nextDouble();
                sumaEstaturas += estatura;

                reporte += "Jugador: " + nombre
                        + "\nPosición: " + posicion
                        + "\nEdad: " + edad + " años"
                        + "\nEstatura: " + estatura + " metros\n\n";

                System.out.println("¿Deseas ingresar otro jugador? (S/N): ");
                newJugador = teclado.next();

                if (newJugador.equals("N")) {
                    cont = 0;
                    System.out.println("Reporte:" + reporte);
                    double promedioEdades = (double) sumaEdades / cont;
                    double promedioEstaturas = sumaEstaturas / cont;

                    System.out.println("Promedio de edades: " + promedioEdades);
                    System.out.println("Promedio de estaturas: " + promedioEstaturas);
                }
            }
        } else {
            cont = 0;
            System.out.println("Reporte vacío.");
        }
    }
}
