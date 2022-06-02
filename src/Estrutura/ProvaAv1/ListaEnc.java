package Estrutura.ProvaAv1;

public abstract class ListaEnc<T extends Comparable<T>> extends Lista<T> {

    private T[] elemento;
    private int posicao;
    private Integer quantidade;

    /* public ListaEnc() {
        this.elemento = (T[]) new Object();
        this.quantidade = 0;
        this.posicao = 0;

    }*/

    public boolean vazia() throws ListaVaziaException {
        return this.quantidade == 0;
    }

    public boolean cheia() throws ListaCheiaException {
        return this.quantidade == this.elemento.length;
    }

    @Override
    protected Object assertThat(Integer integer) {
        return null;
    }

    @Override
    protected void assertThat(Integer i, Object equalTo) {

    }

    public int getQuantidade(int i) {
        return this.quantidade;
    }

    @Override
    public void incluir(T elemento) throws Exception, ListaCheiaException {
        if (this.cheia()) {
            try {
                throw new ListaCheiaException();
            } catch (ListaCheiaException e) {
                e.printStackTrace();
            }
        }
        this.elemento[this.quantidade++] = elemento;
    }


    public T get(int i) throws Exception, ElementoNaoExisteException {
        for (int j = 0; j < this.quantidade; ++j)
            if (this.elemento[j].equals(elemento)) return elemento[j];
        throw new ElementoNaoExisteException();

    }


    public int getPosElemento(T elemento) throws ElementoNaoExisteException {
        for (int i = 0; i < this.quantidade; ++i)
            if (this.elemento[i].equals(elemento)) return i;
        throw new ElementoNaoExisteException();
    }

    @Override
    public void incluirInicio(T elemento) throws ListaCheiaException {
        if (this.cheia()) throw new ListaCheiaException();
        for (int j = this.quantidade; j > 0; --j)
            this.elemento[j] = this.elemento[j - 1];
        this.elemento[0] = elemento;
        ++this.quantidade;
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public void remover(T elemento) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public T removerInicio() throws ListaVaziaException {
        T aux;
        if (this.vazia()) throw new ListaVaziaException();
        aux = this.elemento[0];
        --this.quantidade;
        for (int i = 0; i <= this.quantidade; ++i)
            this.elemento[i] = this.elemento[i + 1];
        return aux;
    }

    @Override
    public Integer removerFim() throws ListaVaziaException {
        Integer valor;
        valor = this.quantidade;
        valor--;
        if (this.vazia()) throw new ListaVaziaException();
        --this.quantidade;

        for (int i = this.quantidade; i < this.elemento.length; --i) {
            this.elemento[i] = this.elemento[i + 1];
            if (valor == i) {
                break;
            }

        }
        return valor;
    }


    public void remover(int posicao) throws Exception {

    }

    public void limpar() throws ListaVaziaException {

        if (this.vazia()) throw new ListaVaziaException();

        for (int i = this.quantidade; i < this.elemento.length; --i) {
            this.elemento[i] = null;

        }
    }


    public int getTamanho() throws ListaVaziaException {
        if (this.vazia()) try {
            throw new ListaVaziaException();
        } catch (ListaVaziaException e) {
            e.printStackTrace();
        }
        return this.quantidade;
    }

    @Override
    public boolean contem(T elemento) throws Exception, ElementoNaoExisteException {
        for (int i = 0; i < this.quantidade; ++i)
            if (this.elemento[i].equals(elemento)) return true;
        throw new ElementoNaoExisteException();
    }

}
