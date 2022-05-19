package Recursividade;

public class Fatorial {
    public double fatorailRecursivo(double num) {
        //se n é igual a 0, retorne 1

        if (num == 0 || num == 1) {
            return 1;
        }

        //Caso contrario, o metodo recursivo é chamado Fatorial n . (n – 1)
        return num * fatorailRecursivo(num - 1);

    }
}
