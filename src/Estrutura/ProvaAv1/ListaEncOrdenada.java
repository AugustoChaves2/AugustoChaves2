package Estrutura.ProvaAv1;

public class ListaEncOrdenada<T extends Comparable<T>> extends ListaEnc<T> {

    private No prim;

    public ListaEncOrdenada(T i) {
        i = (T) new Object();

    }

    public void criarLista() {
        prim = null;
    }

    public boolean listaVazia() {
        if (prim == null)
            return true;
        else
            return false;
    }


    @Override
    public void incluirInicio(T elemento) throws ListaCheiaException {
        No novo = new No();
        novo.setDado((Integer) elemento);
        novo.setProx(prim);
        prim = novo;

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {

    }

    @Override
    public T get(int i) throws Exception {
        return null;
    }

    @Override
    protected Object assertThat(Integer integer) {
        return null;
    }

    @Override
    protected void assertThat(Integer i, Object equalTo) {

    }

    @Override
    public int getPosElemento(T elemento) throws ElementoNaoExisteException {
        return 0;
    }

    @Override
    public void remover(int posicao) throws Exception {

        No anterior = null;

        No p = prim;

        while (p != null && p.getInfo() != posicao) {
            anterior = p;
            p = p.getProx();
        }

        if (p == null) {
            return; // não achou
        }
        if (p == null) {
            // nao achou matem o primeiro
        }

        if (anterior == null) {
            prim = p.getProx(); // retirar elemento inicio
        } else {
            anterior.setProx(p.getProx()); //retira meio da lista
        }

    }

    @Override
    public void limpar() {
        while (prim != null) {
            No temp = prim.getProx();
            prim = null;
            prim = temp;
        }
    }

    @Override
    public int getTamanho() {
        Integer qtd = 0;
        No atual;
        for (atual = this.prim; atual != null; atual = atual.getProx()) ++qtd;
        return qtd;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        return false;
    }
}
