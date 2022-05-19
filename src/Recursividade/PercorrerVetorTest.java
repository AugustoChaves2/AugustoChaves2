package Recursividade;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PercorrerVetorTest {

    public static void main(String[] args) {

        PercorrerVetor percorrerVetor = new PercorrerVetor();
        int vetor[] = {1, 5, 3, 2, 10, 5, 7, 9};
        percorrerVetor.recusivo(vetor, 0);
        percorrerVetor.exibirMensagem();

    }
}


