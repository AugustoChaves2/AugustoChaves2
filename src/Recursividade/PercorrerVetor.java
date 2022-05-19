package Recursividade;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class PercorrerVetor {

    int[] vetorauxiliar = new int[8];

    int vetor[] = {1, 5, 3, 2, 10, 5, 7, 9};

    public void recusivo(int vetor[], int posicao) {
        if (posicao >= vetor.length) {
            return;
        } else {
            vetorauxiliar[posicao] = vetor[posicao];
            recusivo(vetor, posicao + 1); // aqui a recursividade

        }

    }

    public void exibirMensagem() {
        System.out.println("Elementos Vetores auxiliar: " + Arrays.toString(vetorauxiliar));

    }
}



