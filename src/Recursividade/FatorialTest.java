package Recursividade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatorialTest {

    public static void main(String[] args) {
        double numero;
        numero = 4;
        Fatorial fatorial = new Fatorial();
        fatorial.fatorailRecursivo(numero);
        numero = fatorial.fatorailRecursivo(numero);
        System.out.println("Fatorail é: " + numero);
    }
}