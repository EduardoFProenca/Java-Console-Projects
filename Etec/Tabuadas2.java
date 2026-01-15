import java.util.Scanner;

public class Tabuadas2 {
    public static void main(String[] args) {
    int  Num1 =1,Num2 = 6,Num3= 60, Resultado;
    
    while(Num1 <=10 ){
        Resultado = Num1* Num2;
        System.out.println( Num1+"x"+Num2+"="+Resultado);
        
        
        if(Resultado >= Num3 && Resultado<100 ){
            Num3 +=10;
            Num1 = 1;
            Num2 ++;
        }else{
       Num1 ++;
    }
}}}
