package Recursividade;

import org.jetbrains.annotations.Contract;

public class SomarNumerosPrimosVetor {


    int somaPrimos = 0;
    int cont = 0;

    public void recursivo(int[] vetor, int posicao) {

        if (isPrimo(posicao, vetor) >= vetor.length)
            return;
        if (cont == 2) {
            somaPrimos = vetor[posicao] + somaPrimos;
        }
        cont = 0;

        recursivo(vetor, posicao + 1);
    }


    private int isPrimo(int i, int[] vetor) {
        for (int j = 1; j <= vetor[i]; j++) {
            if (vetor[i] == 2 || vetor[i] == 1)
                return cont = 2;
            if (vetor[i] % j == 0) {
                cont = cont + 1;

            }
        }

        return cont;

    }


}

