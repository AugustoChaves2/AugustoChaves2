package Lista;

class ListaEncadeadaInteirosTest {

    public static void main(String[] args) throws ElementoNaoExisteException {
        ListaEncadeadaInteiros listaEncadeadaInteiros = new ListaEncadeadaInteiros();
        listaEncadeadaInteiros.criarLista();
        listaEncadeadaInteiros.addOrdenado(45);
        listaEncadeadaInteiros.addOrdenado(60);
        listaEncadeadaInteiros.addOrdenado(1);
        listaEncadeadaInteiros.addOrdenado(32);
        listaEncadeadaInteiros.addOrdenado(23);
        listaEncadeadaInteiros.remove(1);
        listaEncadeadaInteiros.exibir();
        listaEncadeadaInteiros.buscaElemento(32);
        //listaEncadeadaInteiros.limparLista();
        //listaEncadeadaInteiros.exibir();

    }
}