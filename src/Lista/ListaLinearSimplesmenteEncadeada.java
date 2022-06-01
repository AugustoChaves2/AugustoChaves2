package Lista;

import java.util.Arrays;
import java.util.Iterator;

public class ListaLinearSimplesmenteEncadeada<T extends Comparable<T>> {
    private No<T> inicio;

    public ListaLinearSimplesmenteEncadeada() {
        this.inicio = null;

    }

    public boolean isVazia() {
        return this.inicio == null;
    }

    public int getQuantidade() {
        int qtde = 0;
        No<T> atual;
        for (atual = this.inicio; atual != null; atual = atual.getProximo()) ++qtde;
        return qtde;
    }

    public void inserirInicio(T elem) {
        No<T> no = new No<T>(elem);
        no.setElemento(elem);
        no.setProximo(inicio);
        inicio = no;
    }

    public void inserirFim(T elem) {
        if (this.isVazia()) inserirInicio(elem);
        else {
            No<T> atual, no = new No<T>(elem);
            atual = this.inicio;
            while (atual.getProximo() != null) atual = atual.getProximo();
            atual.setProximo(no);
            no.setProximo(atual);
        }
    }

    public Object[] get() {
        int i = 0;
        No<T> atual;
        @SuppressWarnings("unchecked") T[] vetor = (T[]) new Object[this.getQuantidade()];
        for (atual = this.inicio; atual != null; atual = atual.getProximo()) vetor[i++] = atual.getElemento();
        return new Iterator[]{Arrays.asList(vetor).iterator()};
    }

    public void inserir(T valor) {

        //Criar novo nó com o valor
        No<T> novoNo = new No<>(valor);

        No<T> auxiliar = inicio;
        No<T> auxiliar2 = null;

        //Primeiro no
        while ((auxiliar != null) && (auxiliar.getElemento().compareTo(novoNo.getElemento())) == -1) {
            auxiliar2 = auxiliar;
            auxiliar = auxiliar.getProximo();
        }

        //e o primeiro no
        if (this.inicio == null) {
            this.inicio = novoNo;
        } else if (auxiliar == this.inicio) {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        } else {
            //liga novo no ao inicio
            novoNo.setProximo(auxiliar);
            //liga o no ao anterior novo no
            auxiliar2.setProximo(novoNo);
        }
    }

    public boolean get(T elemento) throws ElementoNaoExisteException {
        No<T> atual;
        for (atual = this.inicio; atual != null; atual = atual.getProximo())
            if (atual.getElemento().equals(elemento)) return true;
        throw new ElementoNaoExisteException();
    }

    public T removerInicio() throws ListaVaziaException {
        if (this.isVazia()) throw new ListaVaziaException();
        T elemento = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        return elemento;
    }

    public T removerFim() throws ListaVaziaException {
        No<T> atual, anterior = null;
        if (this.isVazia()) throw new ListaVaziaException();
        atual = this.inicio;
        while (atual.getProximo() != null) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (anterior == null) return this.removerInicio();
        anterior.setProximo(atual.getProximo());
        return atual.getElemento();
    }

    public void remover(T elemento) throws ElementoNaoExisteException, ListaVaziaException {
        No<T> atual, anterior = null;
        if (this.isVazia()) throw new ListaVaziaException();
        atual = this.inicio;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                if (anterior == null) this.removerInicio();
                else anterior.setProximo(atual.getProximo());
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
        throw new ElementoNaoExisteException();
    }


    public String toString() {
        String valor = "";
        No<T> atual = this.inicio;
        while (atual != null) {
            valor += atual.getElemento().toString();
            atual = atual.getProximo();
        }

        return valor;
    }

}

