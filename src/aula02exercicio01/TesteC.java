/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio01;

/**
 *
 * @author ALUNOS
 */
public class TesteC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] vetor={4.6, 6.8, 2.1, 5.4, 4.2, 2.7, 1.1};
        double aux;
        int posicaoMenor;
        for(int i=0; i<vetor.length-1; i++){
            posicaoMenor = i;
            for (int j=i+1; j<vetor.length; j++){
                if (vetor[j]<vetor[posicaoMenor]) posicaoMenor = j;
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor [i];
            vetor[i] = aux;
            
            System.out.println(vetor[i]);
    }
    
}
}
