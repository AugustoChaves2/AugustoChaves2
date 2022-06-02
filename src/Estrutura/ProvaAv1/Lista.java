package Estrutura.ProvaAv1;

public abstract class Lista<T extends Comparable> {


    public abstract boolean vazia() throws ListaVaziaException;

    public abstract boolean cheia() throws ListaCheiaException;

    public abstract int getQuantidade(int i);

    public abstract void incluir(T elemento) throws Exception, ListaCheiaException;

    /**
     * Adiciona um elemento no final da lista
     * O(1)
     *
     * @param elemento
     * @throws Exception
     */

    public abstract void incluirInicio(T elemento) throws Exception, ListaCheiaException;

    /**
     * Adiciona um elemento no início da lista
     * O(n)
     *
     * @param elemento
     * @throws Exception
     */

    public abstract void incluir(T elemento, int posicao) throws Exception;

    /**
     * Adiciona um elemento em uma posição específica da lista
     * O(n)
     *
     * @param i
     * @throws Exception
     */

    public abstract T get(int i) throws Exception, ElementoNaoExisteException;

    /**
     * Retorna o elemento que está na posição
     * O(1)
     *
     * @param posicao
     * @return
     * @throws Exception
     */
    protected abstract Object assertThat(Integer integer);

    protected abstract void assertThat(Integer i, Object equalTo);

    public abstract int getPosElemento(T elemento) throws Exception, ElementoNaoExisteException;

    /**
     * Retorna a posição do elemento
     * O(n)
     *
     * @param elemento
     * @return
     * @throws Exception
     */

    public abstract void remover(T elemento) throws Exception;

    /**
     * Remove o elemento da posição
     * O(n)
     *
     * @param posicao
     * @throws Exception
     */

    public abstract Integer removerFim() throws ListaVaziaException;

    /**
     * Remove elemento fim
     */

    public abstract T removerInicio() throws ListaVaziaException;

    /**
     * Remove elemento inicio
     *
     * @return
     */

    public abstract void limpar() throws ListaVaziaException;

    /**
     * Remove todos os elementos da lista.
     * O(1)
     */

    public abstract int getTamanho() throws ListaVaziaException;

    /**
     * Retorna a quantidade de elementos na lista
     * O(1)
     *
     * @return
     */

    public abstract boolean contem(T elemento) throws Exception, ElementoNaoExisteException;
    /**
     * Indica se contém ou não o elemento na lista
     * O(n)
     * @param elemento
     * @return
     * @throws Exception
     */

}