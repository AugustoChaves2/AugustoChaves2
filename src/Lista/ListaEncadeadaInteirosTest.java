package Lista;

class ListaEncadeadaInteirosTest {

    public static void main(String[] args) throws ElementoNaoExisteException {
        ListaEncadeadaInteiros listaEncadeadaInteiros = new ListaEncadeadaInteiros();
        listaEncadeadaInteiros.criarLista();
        listaEncadeadaInteiros.incluirInicio(45);
        listaEncadeadaInteiros.incluirInicio(60);
        listaEncadeadaInteiros.incluirInicio(1);
        //listaEncadeadaInteiros.incluir(3, 2);
        listaEncadeadaInteiros.incluirInicio(32);
        //listaEncadeadaInteiros.incluirOrdenadoDecres(23);
        //listaEncadeadaInteiros.remover(1);
        listaEncadeadaInteiros.exibir();
        listaEncadeadaInteiros.getElemento(32);
        // listaEncadeadaInteiros.getElemento(60);
        // listaEncadeadaInteiros.contem(45);
        //listaEncadeadaInteiros.limparLista();
        //listaEncadeadaInteiros.exibir();

    }
}