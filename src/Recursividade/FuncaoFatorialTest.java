package Recursividade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncaoFatorialTest {

    public static void main(String[] args) {

        double num = 3;
        FuncaoFatorial funcao = new FuncaoFatorial();
        funcao.funcaoFatorialRecursiva(num);
        num = funcao.funcaoFatorialRecursiva(num);
        System.out.println("Numero da função fatorial: " + funcao.x);
    }
}