package Lista;

import groovy.json.JsonOutput;

import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ListaEstatica<T> {

    private T[] elementos;
    private int quantidade;


    public ListaEstatica(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.quantidade = 0;

    }

    public boolean isVazia() {
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
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[this.getQuantidade()];
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
        for (int i = 0; i < this.quantidade; ++i)
            this.elementos[i] = this.elementos[i + 1];
        return aux;
    }

    public T removerFim(int i) throws ListaVaziaException {
        if (this.isVazia()) throw new ListaVaziaException();
        return this.elementos[--this.quantidade];

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


