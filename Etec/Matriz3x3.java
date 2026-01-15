
import javax.swing.JOptionPane;

public class Matriz3x3 {

    public static void main(String[] args) {
       int Matriz[][] = new int [3][3];// Declara uma matriz 3x3 de inteiros
       int Linha,Coluna,Resultado=0;// Declara variáveis para linha, coluna e o resultado da soma

       // Preenche a matriz com valores inseridos pelo usuário
    for(Linha =0; Linha < 3;Linha++){ // Loop para percorrer as linhas da matriz
       for(Coluna =0; Coluna < 3;Coluna++){ // Loop para percorrer as colunas da matriz
       // Pede ao usuário para inserir um número
       Matriz[Linha][Coluna]= Integer.parseInt(JOptionPane.showInputDialog("Os numero: "));
    }}
      // Soma todos os elementos da matriz
    for(Linha =0; Linha < 3;Linha++){ // Loop para percorrer as linhas da matriz novamente
       for(Coluna =0; Coluna < 3;Coluna++){ // Loop para percorrer as colunas novamente
       Resultado += Matriz[Linha][Coluna];// Adiciona o valor atual da matriz à variável Resultado
    }}
    // Exibe o resultado da soma dos elementos da matriz
    JOptionPane.showMessageDialog(null,"Soma de todos os elementos da matriz é :"+Resultado);
}}
