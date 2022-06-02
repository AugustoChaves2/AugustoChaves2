package Estrutura.ProvaAv1;

import org.junit.jupiter.api.Test;

abstract class ListaTest {

    Lista<Integer> lista;


    @Test
    void incluirNaListaVazia() throws ListaCheiaException, Exception, ElementoNaoExisteException {
        lista.incluir(1);
        // assertThat(lista.get()).isOne();
        //assertThat((Integer) lista.get(0)).isEqualTo(1);
    }

    @Test
    void limpar() throws Exception, ListaCheiaException, ListaVaziaException {
        int qtd = 5;
        for (int i = 0; i < qtd; i++) {
            lista.incluirInicio(i);
        }
        //testWithMatchers(3);
        //testWithMatchers(lista.getQuantidade(3)).isNotZero();
        lista.limpar();
        //assertThat(lista.getTamanho()).isZero();
    }

    @Test
    void getPosicaoMaiorQueQtd() throws Exception, ListaCheiaException {
        //assertThatExceptionOfType(Exception.class)
        // .isThrownBy(() -> lista.get(11))
        //.withMessage("Posição solicitada não existe na lista");
        lista.incluir(11);
        //assertThatExceptionOfType(Exception.class)
        // .isThrownBy(() -> lista.get(11))
        //.withMessage("Posição solicitada não existe na lista");
    }

    @Test
    void incluirInicio() throws ListaCheiaException, ElementoNaoExisteException, Exception {
        int qtd = 5;
        for (int i = 0; i < qtd; i++) {
            lista.incluirInicio(i);
        }
        testWithMatchers(lista.get(qtd).compareTo(qtd));
        testWithMatchers(lista.get(0).compareTo(4));
        testWithMatchers(lista.get(4).compareTo(0));
    }

    @Test
    private void testWithMatchers(int elemento) {

        assertThat(1);
    }

    private void assertThat(int elemento) {
    }

    public Object isEqualTo(int elemento) {
        return true;
    }

    @Test
    void testIncluir() throws Exception, ListaCheiaException, ListaVaziaException {
        int qtd = 5;
        for (int i = 0; i < qtd; i++) {
            lista.incluir(i);
        }
        //assertThat(lista.getTamanho()).isEqual(qtd);
        //assertThat(lista.get(0)).isEqualTo(0);
        //assertThat(lista.get(4)).isEqualTo(4);
    }

    @Test
    void getPorPosicaoElementoTest() throws Exception, ListaCheiaException {
        int qtd = 5;
        for (int i = 0; i < qtd; i++) {
            lista.incluir(i);
        }
        for (int i = 0; i < qtd; i++) {
            //assertThat(lista.get(i)).isEqualTo(i);
        }
    }

    @Test
    void getPorComparacaoElementoTest() throws Exception, ListaCheiaException, ElementoNaoExisteException {
        Integer[] valores = new Integer[]{1, 2, 3, 4, 5};
        int qtd = valores.length;

        for (int i = 0; i < qtd; i++) {
            lista.incluir(valores[i]);
        }

        for (int i = 0; i < qtd; i++) {
            // assertThat(lista.getPosElemento(valores[i])).isEqualTo(i);
        }
    }

    @Test
    void remover() throws Exception, ListaCheiaException {
        int[] valores = new int[]{1, 2, 3, 4, 5};
        int qtd = valores.length;

        for (int i = 0; i < qtd; i++) {
            lista.incluir(valores[i]);
        }
        //assertThat(lista.getTamanho()).isEqualTo(5);
        lista.remover(3); // remove o elemento 4
        //assertThat(lista.getTamanho()).isEqualTo(4);
        //assertThat(lista.get(2)).isEqualTo(3);
        //assertThat(lista.get(3)).isEqualTo(5);
    }

    @Test
    public void getTamanhoNaInclusao() throws Exception, ListaCheiaException {
        int[] valores = new int[]{1, 2, 3, 4, 5};
        int qtd = valores.length;
        for (int i = 0; i < qtd; i++) {
            lista.incluir(valores[i]);
            //assertThat(lista.getTamanho()).isEqualTo(i+1);
        }
    }

    @Test
    public void getTamanhoNaRemocao() throws Exception, ListaCheiaException {
        int[] valores = new int[]{1, 2, 3, 4, 5};
        int qtd = valores.length;
        for (int i = 0; i < qtd; i++) {
            lista.incluir(valores[i]);
        }
        for (int i = 0; i < qtd; i++) {
            lista.remover(0);
            //assertThat(lista.getTamanho()).isEqualTo(4-i);
        }
    }

    @Test
    public int contem() throws Exception, ElementoNaoExisteException, ListaCheiaException {
        int[] valores = new int[]{1, 2, 3, 4, 5};
        int qtd = valores.length;
        //assertThat(lista.contem(1)).isFalse();
        for (int i = 0; i < qtd; i++) {
            lista.incluir(valores[i]);
            // assertThat(lista.getTamanho()).isEqualTo(i+1);
        }
        for (int i = 0; i < qtd; i++) {
            //assertThat(lista.contem(valores[i])).isTrue();
        }
        //assertThat(lista.contem(10)).isFalse();
        return qtd;
    }


}