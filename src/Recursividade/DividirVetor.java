package Recursividade;

import java.util.Arrays;

public class DividirVetor {

    int inicio = 0;
    int fim = 0;
    int vetorA[] = {1, 4, 8, 2, 3, 9, 12, 17, 32};
    int corte = vetorA.length / 2;
    int vetoraux[] = new int[vetorA.length];
    int vetoraux2[] = new int[vetorA.length];

    public int[] getVetorA() {
        for (int i = 0; i < vetorA.length; i++) {

            if (i < (vetorA.length - corte)) {
                vetoraux[i] = vetorA[i];
            } else {
                vetoraux2[i] = vetorA[i];
            }
        }

        System.out.println("Vetor A : " + Arrays.toString(vetorA));
        System.out.println("Vetor auxiliar 1 : " + Arrays.toString(vetoraux));
        System.out.println("Vetor auxiliar 2 : " + Arrays.toString(vetoraux2));


        return vetorA;
    }


}