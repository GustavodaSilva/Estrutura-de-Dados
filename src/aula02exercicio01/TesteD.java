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
public class TesteD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] vetor = {"Valentio", "Daniel", "Paulo"};
        String aux;
        int posicaoMenor;
        //Estrutra de ordenação
        for (int i = 0; i < vetor.length - 1; i++) {
            posicaoMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if ((vetor[j].compareTo(vetor[posicaoMenor])) < 0) {
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
    }
}
