
//Eduardo Ferreira Proenca
import javax.swing.JOptionPane;
public class Desconto {
   
    public static void main(String[] args) {
        float valor = 0;
        float desconto =0;
        float valTotal = 0;
        
        // solicita o valor total de compra
        valor= Integer.parseInt(JOptionPane.showInputDialog("Insira o valor total da compra "));
        //        valor= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total da compra "));
        
        // calcula o desconto 
        if(valor<200){
            valTotal = valor * 0.95f;// 5% de desconto
        }else{
        if(valor >= 200 && valor < 300){
            valTotal = valor * 0.90f;// 10% de desconto
        }else{
        if( valor >=300 ){
            valTotal = valor * 0.85f;// 15% de desconto
        }}}
        
        desconto = valor - valTotal;// valor do desconto
         
        // exibe o resultado
        JOptionPane.showMessageDialog(null,"Valor da compra R$:"+valor+"\n O cliente recebe um desconto de R$:" +desconto+"\n O valor a ser pago após o desconto R$:"+ valTotal);
    }
    
}
