package Estrutura.ProvaEstruraDados1.Lista;

public class ListaEnc<T extends Comparable<T>> extends Lista<T> {


    private No<T> primmeiroNo;
    private No<T> ultimoNo;
    private int tamanho;


    public ListaEnc(Class<T> dataType) {

        this.primmeiroNo = null;
        this.ultimoNo = null;

    }

    @Override
    public void incluir(T elemento) throws Exception {
        throw new Exception("Não implementado");
    }


    public T get(int posicao) throws Exception {
        throw new Exception("Posição solicitada não existe na lista");
    }


    public int getPosElemento(T elemento) throws Exception {
        throw new Exception("Elemento não localizado");
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public int getTamanho() {
        return Integer.MIN_VALUE;
    }

    public void limpar() {
    }


    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("Não implementado");
    }

}