import javax.swing.JOptionPane;
public class Opinião {

    public static void main(String[] args) {
        String Nome ="o";  // Variável para armazenar o nome do entrevistado.
        int Idade = 0; // Variável para armazenar a idade do entrevistado.
        int Excelente=0,Bom= 0, Ruim=0;  // Variáveis para contar respostas EXCELENTE, BOM e RUIM.
        int Opiniao; // Variável para armazenar a opinião do entrevistado (1, 2 ou 3).
        int veze = 50;// Número de entrevistados (padrão 50)
        
        // Solicita ao usuário quantos entrevistados participarão da pesquisa
        //veze=  Integer.parseInt(JOptionPane.showInputDialog("Quantos entrevistados vai participaram?"));
        
        for(int Contador = 1;Contador <= veze ;Contador++){ // Estrutura de repetição FOR, que será executada o número de vezes   
            Nome = JOptionPane.showInputDialog("Nome:");// Solicita o nome do entrevistado
            Idade= Integer.parseInt(JOptionPane.showInputDialog("Idade: "));// Solicita a idade do entrevistado 
            Opiniao=  Integer.parseInt(JOptionPane.showInputDialog("Opinião sobre o atendimento prestado:\n "+"sendo: 1-EXCELENTE, 2-BOM ou 3-RUIM."));   // Solicita a opinião do entrevistado (1-EXCELENTE, 2-BOM, 3-RUIM)
            
            switch (Opiniao){// Estrutura switch para verificar qual foi a opinião dada pelo entrevistado.
                case 1:// Caso a opinião seja EXCELENTE.
                    Excelente++;// Incrementa a contagem de respostas EXCELENTE.
                    break;// Sai do switch.
                case 2: // Caso a opinião seja BOM.
                    Bom++;  
                    break;
                case 3:// Caso a opinião seja RUIM.
                    Ruim++;// Incrementa a contagem de respostas RUIM.
                    break;
                default:// Caso o número inserido seja inválido (fora da faixa de 1 a 3).
                    Contador--;   // Decrementa o contador para refazer a coleta do mesmo entrevistado.
                    JOptionPane.showMessageDialog(null,"Valor digitado está incorreto, fora da faixa entre 1 a 3"); // Mostra mensagem de erro.
                    break;
            }
        }
       // Exibe o resultado final da pesquisa com a contagem de EXCELENTE e RUIM.
       JOptionPane.showMessageDialog(null,"Quantidade de respostas “Excelente”: "+Excelente+ "\nQuantidade de respostas 'Ruim': "+Ruim);
       //JOptionPane.showMessageDialog(null,"Quantidade de respostas “Bom”: "+Bom); // Exibe o resultado final da pesquisa com BOM.

    }
    
}