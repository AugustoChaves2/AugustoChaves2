package Estrutura.Turma;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {

        // vetor de tamanho 4
        int[] nomes = new int[5];

        //adiciona os elementos
        nomes[0] = 5;
        nomes[1] = 31;
        nomes[2] = 20;
        nomes[3] = 14;

        //Imprime a lista antes de ordenar
        System.out.println(Arrays.toString(nomes));

        //Ordena Coleção
        Arrays.sort(nomes);

        // imprime a lista após ordenação
        System.out.println(Arrays.toString(nomes));

        // imprime a posição do elemento "Segundo" na lista
        System.out.println(Arrays.binarySearch(nomes, 1));

    }
}
