package tallersemana7;
public class SumatoriaFracciones {
    public static void main(String[] args) {
        int i=1;
        double oper, sumatoria=0, numerador=1, denominador=1;
        while(i<=10){
            oper=numerador/denominador;
            if(denominador%2!=0){
                oper=oper*(-1);
                System.out.println("-(1/"+denominador+")");
            }
            else
                System.out.println("+(1/"+denominador+")");
            sumatoria=sumatoria+oper;
            denominador++;
            i++;  
        }
        System.out.println("La sumatoria es: "+sumatoria);
    }
}