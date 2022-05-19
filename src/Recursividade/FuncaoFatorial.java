package Recursividade;

public class FuncaoFatorial {

    double parteFuncao;
    double outraParte;
    double x;

    public double funcaoFatorialRecursiva(double x) {

        if (parteFuncao(x) == 0 || outraFuncao(x) == 0) {
            return 0;
        }

        funcaoFatorialRecursiva(parteFuncao + outraParte);

        return x;
    }// f(x) = 1/x! + (x*5)!

    // Fatorial n . (n – 1)
    public double parteFuncao(double x) {
        if (x == 0)
            return (x = 0);
        return x * parteFuncao(1 / x);
    }

    public double outraFuncao(double x) {
        if (x == 0)
            return (x = 0);
        return x * outraFuncao(x * x);
    }
}
