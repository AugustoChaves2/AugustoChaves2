package Recursividade;

public class SomarNumerosVetores {

    int somaVetor = 0;


    public int recursivo(int[] vetor, int posicao) {


        if (posicao >= vetor.length) {
            return posicao;
        } else {

            recursivo(vetor, posicao + 1); // aqui a recursividade

        }
        if (vetor[posicao] % vetor[posicao] == 0) {

            somaVetor = somaVetor + vetor[posicao];

        }

        return somaVetor;

    }

}
