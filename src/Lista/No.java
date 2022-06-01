package Lista;

public class No<T> {
    public T elemento;
    private No<T> proximo;

    public No(T elem) {
        this.elemento = elem;
        this.proximo = null;

    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public void setProximo(No<T> inicio) {
        inicio = inicio;
    }

    public No<T> getProximo() {

        return this.proximo;
    }

    public T getElemento() {

        return this.elemento;
    }

    public String toString() {
        return this.elemento.toString();
    }
}

