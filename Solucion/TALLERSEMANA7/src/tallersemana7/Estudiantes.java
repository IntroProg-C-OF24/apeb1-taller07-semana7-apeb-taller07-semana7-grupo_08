package tallersemana7;
import java.util.Scanner;
public class Estudiantes {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String nombre, resultado;
        double promedio;
        int i=1;
        while(i<=4){
            System.out.println("Escriba el nombre del estudiante "+i);
            nombre=put.next();
            System.out.println("Escriba el promedio del estudiante");
            promedio=put.nextDouble();
            if(promedio<7)
                resultado="REPROBADO";
            else
                resultado="APROBADO";
            System.out.println("ESTUDIANTE "+i+": "+nombre+" -- PROMEDIO: "+promedio+" -- RESULTADO: "+resultado);
            i++;
        }
    }
}