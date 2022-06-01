package Lista;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaInteirosTest {

    public static void main(String[] args) {
        ListaEncadeadaInteiros listaEncadeadaInteiros = new ListaEncadeadaInteiros();
        listaEncadeadaInteiros.criarLista();
        listaEncadeadaInteiros.addOrdenado(45);
        listaEncadeadaInteiros.addOrdenado(60);
        listaEncadeadaInteiros.addOrdenado(1);
        listaEncadeadaInteiros.addOrdenado(32);
        listaEncadeadaInteiros.addOrdenado(23);
        //listaEncadeadaInteiros.remove(1);
        listaEncadeadaInteiros.exibir();
        //listaEncadeadaInteiros.limparLista();
        //listaEncadeadaInteiros.exibir();

    }
}