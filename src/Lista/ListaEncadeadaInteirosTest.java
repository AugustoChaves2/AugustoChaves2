package Lista;

class ListaEncadeadaInteirosTest {

    public static void main(String[] args) throws ElementoNaoExisteException {
        ListaEncadeadaInteiros listaEncadeadaInteiros = new ListaEncadeadaInteiros();
        listaEncadeadaInteiros.criarLista();
        listaEncadeadaInteiros.addOrdenadoDecres(45);
        listaEncadeadaInteiros.addOrdenadoDecres(60);
        listaEncadeadaInteiros.addOrdenadoDecres(1);
        listaEncadeadaInteiros.addOrdenadoDecres(32);
        listaEncadeadaInteiros.addOrdenadoDecres(23);
        listaEncadeadaInteiros.remove(1);
        listaEncadeadaInteiros.exibir();
        listaEncadeadaInteiros.buscaElemento(32);
        //listaEncadeadaInteiros.limparLista();
        //listaEncadeadaInteiros.exibir();

    }
}