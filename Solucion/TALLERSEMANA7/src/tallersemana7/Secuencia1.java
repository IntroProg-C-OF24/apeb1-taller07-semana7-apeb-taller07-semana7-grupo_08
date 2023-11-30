package tallersemana7;
public class Secuencia1 {
    public static void main(String[] args) {
        int i, nominador, denominador;
        i=1;
        nominador=1;
        denominador=10;
        while(i<=6){
            System.out.println(nominador+"/"+denominador);
            nominador++;
            denominador++;
            i++;
        }
    }
}