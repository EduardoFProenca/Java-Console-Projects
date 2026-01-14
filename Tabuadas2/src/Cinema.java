import javax.swing.JOptionPane;
public class Cinema {

    public static void main(String[] args) {
        // Declaração das variáveis principais
        char Opiniao; // Armazena a opinião (nota) do espectador.
        int Idade,TotalIdade=0; // 'Idade' para armazenar a idade atual e 'TotalIdade' para somar a idade de quem respondeu "ruim".
        float MediaIdade, PorcentagemPessimo=0, MediaGeral;// Variáveis para as médias e porcentagem de respostas.
        int Otimo=0,Bom=0,Regular=0,Ruim=0,Pessimo=0;// Contadores para cada tipo de resposta.
        float veze =40; // Representa o número de entrevistados 
        
        //Solicita ao usuário quantos questionário participarão.
        //float TotalQuestionario;
        //veze=  Integer.parseInt(JOptionPane.showInputDialog("Quantos entrevistados vai participaram?"));
        //TotalQuestionario = veze;
        
        
        while (veze>0){  // Loop para solicitar a entrada de dados para todos os 40 entrevistados
            Idade= Integer.parseInt(JOptionPane.showInputDialog("Idade: "));   // Solicita a idade do espectador
            Opiniao=  JOptionPane.showInputDialog("Opinião em relação ao filme, segundo as seguintes notas:\n "+
                "  A - Ótimo    B - Bom    C - Regular     D - Ruim     E -  Péssimo").charAt(0); // Solicita a opinião do espectador e armazena a primeira letra da resposta
            
            switch (Opiniao){// Estrutura switch para verificar qual foi a opinião dada pelo entrevistado.
                case 'A':// Caso a opinião seja "Ótimo" (maiúsculo ou minúsculo)
                case 'a':
                    Otimo++; // Incrementa o contador de respostas "Ótimo".
                    break;// Sai do switch.
                    
                case 'B': // Caso a opinião seja "Bom" (maiúsculo ou minúsculo)
                case 'b': 
                    Bom++; // Incrementa o contador de respostas "Bom".
                    break;
                    
                case 'C' : // Caso a opinião seja "Regular" (maiúsculo ou minúsculo)
                case 'c' : 
                    Regular++; 
                    break;
                    
                case 'D':// Caso a opinião seja "Ruim" (maiúsculo ou minúsculo)
                case 'd':
                    Ruim++;// Incrementa a contagem de respostas RUIM.
                    TotalIdade +=Idade; // Soma a idade das pessoas que responderam "Ruim".
                    break;
                    
                case 'E': //Caso a opinião seja "Péssimo" (maiúsculo ou minúsculo)
                case 'e': 
                    Pessimo++;  
                    break;
                    
                default: // Caso o usuário digite uma opinião inválida (fora do intervalo A-E)
                     veze++;   // Decrementa o contador para refazer a coleta do mesmo questionário.
                    JOptionPane.showMessageDialog(null,"Valor digitado está incorreto, fora da faixa entre A a E"); // Mostra mensagem de erro.
                    break;
                }
            veze--;  // Diminui o contador de entrevistados a cada loop
        }
        
        if (Ruim>0){ // Calcula a média de idade das pessoas que responderam "Ruim", se houver pelo menos uma resposta "Ruim"
           MediaIdade = TotalIdade/Ruim;}
        else{
            MediaIdade=0;} // Se não houver respostas "Ruim", a média de idade será 0.
        PorcentagemPessimo= (Pessimo/40f) *100; // Calcula a porcentagem de respostas "Péssimo"
        MediaGeral= (5*Otimo+4*Bom+3*Regular+2*Ruim+Pessimo)/40f;
        
        //PorcentagemPessimo= (Pessimo/TotalQuestionario) *100;//
        //MediaGeral= (5*Otimo+4*Bom+3*Regular+2*Ruim+Pessimo)/TotalQuestionario;
       
        // Exibe os resultados finais
        JOptionPane.showMessageDialog(null,"Quantidade de respostas 'Ótimo': " + Otimo+
            "\nA média de idade das pessoas que responderam \"Ruim\": "+ MediaIdade+"%"+
            "\nA porcentagem de respostas \"Péssimo\": " +PorcentagemPessimo+"%" +
            "\nA média geral das notas: " +MediaGeral);
    }
    
}
