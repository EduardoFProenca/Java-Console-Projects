//eduardo ferreira proenca
import javax.swing.JOptionPane;
public class IPVA {


    public static void main(String[] args) {
        int NumPlaca;
        
        NumPlaca= Integer.parseInt(JOptionPane.showInputDialog("Insira o número final da placa do veículo"));
        
        switch (NumPlaca){
            case 1:
                JOptionPane.showMessageDialog(null,"Placa Final 1"+ "\nPagamento até 30/04");
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null,"Placa Final 2\n"+"\nPagamento até 31/05");
            break;
            
            case 3:
                JOptionPane.showMessageDialog(null,"Placa Final 3"+ "\nPagamento até 30/06");
            break;
            
            case 4:
                JOptionPane.showMessageDialog(null,"Placa Final 4"+ "\nPagamento até 31/07");
            break;
            
            case 5:
                JOptionPane.showMessageDialog(null,"Placa Final 5"+"\nPagamento até 31/08");
                break;
            
            case 6:
                JOptionPane.showMessageDialog(null,"Placa Final 6"+"\nPagamento até 30/09");
                break;
            
            case 7:
                JOptionPane.showMessageDialog(null,"Placa Final 7\n" +"Pagamento até 31/10");
                break;
            
            case 8:
                JOptionPane.showMessageDialog(null,"Placa Final 8"+"\nPagamento até 30/11");
                break;
            
            case 9:
                JOptionPane.showMessageDialog(null,"Placa Final 9"+"\nPagamento até 31/12");
                break;
            
            case 0:
                JOptionPane.showMessageDialog(null,"Placa Final 0"+"\nPagamento até 31/12");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Valor digitado está incorreto, fora da faixa entre 0 a 9");
                break;
        } 
    }
    
}
