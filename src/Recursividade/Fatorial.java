package Recursividade;

public class Fatorial {
    public int fatorailRecursivo(int num) {
        //se n é igual a 0, retorne 1

        if (num == 0 || num == 1) {
            return 1;
        }

        //Caso contrario, o metodo recursivo é chamado
        return num * fatorailRecursivo(num - 1);
    }
}
