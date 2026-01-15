
import java.util.Scanner;


public class cobranca {

    public static void main(String[] args) {
        
      String  modelo;  // Armazena o modelo do carro
      float valorDia;  // Armazena o valor da diária
      float dias;      // Armazena a quantidade de dias de locação
      float vaLocacao; // Armazena o valor total das diárias
      float percorrido;// Armazena a quantidade de Km percorridos
      float valPercorrido;// Armazena o valor total cobrado pelos Km percorridos
      double valTotal;   // Armazena o valor total a pagar
      
      Scanner leitor = new Scanner(System.in);
      
      //  Leitura do modelo do carro
      System.out.print("Qual modelo do carro alugado?");
      modelo=leitor.next();
      
      // Leitura do valor da diária
          System.out.println("Valor da diaria para locacao");
          valorDia=leitor.nextFloat();
     
       // Leitura da quantidade de dias de locação, com verificação de entrada 
      while(true){ 
      System.out.println(" Quantidade de dias de locacao:");
      if(leitor.hasNextInt()){
      dias=leitor.nextFloat();
      break;}
      else{
           System.out.println("Entrada invalida. Por favor, insira um numero.");
          leitor.next();} // Limpa a entrada inválida para evitar loops infinitos
      }
      
      vaLocacao = valorDia * dias ; // Cálculo do valor da locação (diária * dias)
      
      // Leitura da quantidade de Km percorridos
      System.out.println("Quantidade de Km percorridos: ");
      percorrido=leitor.nextFloat();
      
      valPercorrido =  0.2f  * percorrido;  // Cálculo do valor adicional por Km percorrido * R$ 0,20 
      
      
      valTotal= vaLocacao + valPercorrido ; // Cálculo do valor total a pagar
     System.out.println("Qual modelo do carro alugado? " + modelo+"\n"+ "Valor da diaria para locacao: "+ valorDia+"\nQuantidade de dias de locacao: "+dias+"\nQuantidade de Km percorridos: "+ percorrido);
     System.out.println("\n o modelo do carro: " + modelo +". \n" + "Valor total a pagar R$: " + valTotal);
    }
    
}
