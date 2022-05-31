package Lista;

import org.jetbrains.annotations.NotNull;

import java.util.*;


public class ListaEstatica<T> {

    private T[] elementos;
    private int quantidade;


    public ListaEstatica(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.quantidade = 0;

    }

    public boolean isVazia() throws ListaVaziaException {
        return this.quantidade == 0;

    }

    public boolean isCheia() {
        return this.quantidade == this.elementos.length;
    }

    public int getQuantidade() {

        return this.quantidade;
    }

    public void inserindoInicio(T novo) throws ListaCheiaException {
        if (this.isCheia()) throw new ListaCheiaException();
        for (int i = this.quantidade; i > 0; --i)
            this.elementos[i] = this.elementos[i - 1];
        this.elementos[0] = novo;
        ++this.quantidade;

    }

    public Integer Ordenar() {
        T aux = null;
        for (int i = this.quantidade; i <= this.elementos.length; ++i)


            this.elementos[i] = this.elementos[i + 1];
        return null;

    }


    public void inserirFim(T novo) {
        if (this.isCheia()) {
            try {
                throw new ListaCheiaException();
            } catch (ListaCheiaException e) {
                e.printStackTrace();
            }
        }
        this.elementos[this.quantidade++] = novo;
    }


    public Iterator<T> get() {
        @SuppressWarnings("unchecked") T[] temp = (T[]) new Object[this.getQuantidade()];
        for (int i = 0; i < this.quantidade; i++) temp[i] = this.elementos[i];
        return Arrays.asList(temp).iterator();
    }

    public Integer get(T elementos) throws ElementoNaoExisteException {
        for (int i = 0; i < this.quantidade; ++i)
            if (this.elementos[i].equals(elementos)) return i;
        throw new ElementoNaoExisteException();
    }

    public T removerInicio() throws ListaVaziaException {
        T aux;
        if (this.isVazia()) throw new ListaVaziaException();
        aux = this.elementos[0];
        --this.quantidade;
        for (int i = 0; i <= this.quantidade; ++i)
            this.elementos[i] = this.elementos[i + 1];
        return aux;
    }

    public Integer removerFim() throws ListaVaziaException {
        Integer valor;
        valor = this.quantidade;
        valor--;
        if (this.isVazia()) throw new ListaVaziaException();
        --this.quantidade;

        for (int i = this.quantidade; i < this.elementos.length; --i) {
            this.elementos[i] = this.elementos[i + 1];
            if (valor == i) {
                break;
            }

        }
        return valor;
    }

    public T limparLista() throws ListaVaziaException {
        T aux;
        if (this.isVazia()) throw new ListaVaziaException();
        aux = this.elementos[quantidade];

        for (int i = this.quantidade; i < this.elementos.length; --i) {
            this.elementos[i] = this.elementos[i + 1];
            if (i == 0) {
                break;
            }

        }
        return aux;
    }

    public Object remover(T elementos) throws ElementoNaoExisteException {
        int posicao = this.get(elementos);

        if (posicao < 0) throw new ElementoNaoExisteException();

        for (int i = posicao; i < this.quantidade; ++i)
            this.elementos[i] = this.elementos[i + 1];
        --this.quantidade;
        return elementos;
    }

    @Override
    public String toString() {
        return "Elementos: " + Arrays.toString(this.elementos);
    }
}


