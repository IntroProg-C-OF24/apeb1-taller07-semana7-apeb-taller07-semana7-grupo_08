package tallersemana7;
public class Secuencia2 {
    public static void main(String[] args) {
        int i, nominador, denominador;
        i=1;
        nominador=5;
        denominador=10;
        while(i<=6){
            System.out.println(nominador+"/"+denominador);
            nominador=nominador+5;
            denominador=denominador+2;
            i++;
        }
    }
}