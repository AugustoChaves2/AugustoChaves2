package Recursividade;

public class SomarParesRecursivo {


    public int imprimirRecursivo(int x) {

        if (x == 0)
            return 0;
        if (x % 2 == 0)
            return x + imprimirRecursivo(x - 1);

        return imprimirRecursivo(x - 1);
    }

}
