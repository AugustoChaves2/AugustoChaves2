package Recursividade;

class SomarNumerosPrimosVetorTest {

    public static void main(String[] args) {
        int vetor[] = {5, 2, 8, 1, 4, 11, 9};
        SomarNumerosPrimosVetor somarNumerosPrimosVetor = new SomarNumerosPrimosVetor();
        somarNumerosPrimosVetor.recursivo(vetor, 0);
        System.out.println("A soma dos numeros Primos: " + somarNumerosPrimosVetor.somaPrimos);
    }

}