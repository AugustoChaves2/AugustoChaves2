package Recursividade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomarNumerosVetoresTest {


    public static void main(String[] args) {
        int vetor[] = {5, 2, 8, 1, 4, 11, 9};
        SomarNumerosVetores somarNumerosVetores = new SomarNumerosVetores();
        somarNumerosVetores.recursivo(vetor, 0);
        System.out.println("Valores da soma dos numeros Primos: " + somarNumerosVetores.somaVetor);
    }
}