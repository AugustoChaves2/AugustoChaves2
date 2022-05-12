package Recursividade;

import groovy.json.JsonOutput;

import java.util.Arrays;

public class PesquisarVetor<vetorA> {
    int vetorA[] = {1, 4, 8, 2, 3, 9, 12, 17, 32};

    public int[] getVetorA() {

        for (int i = 0; i < vetorA.length; i++) {

            //Imprimir todos os vetores
            // System.out.println("Vetor A na posição " + i + ": " + vetorA[i]);
            //Identificar os numeros pares do vetor
            if (vetorA[i] % 2 == 0) { //
                System.out.println("Numeros pares vetor A na posição " + i + ": " + vetorA[i]);

            } else {
                System.out.println("Numeros impar vetor A na posição " + i + ": " + vetorA[i]);
            }
        }
        return vetorA;

    }

    public int[] getImprimirVetorA() {

        System.out.println("Numeros do vetor A: " + Arrays.toString(vetorA));
        return vetorA;
    }
}
