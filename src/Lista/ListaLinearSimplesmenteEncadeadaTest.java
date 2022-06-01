package Lista;

import org.junit.jupiter.api.Test;

import java.sql.ClientInfoStatus;

import static org.junit.jupiter.api.Assertions.*;

class ListaLinearSimplesmenteEncadeadaTest {

    public static void main(String[] args) {
        ListaLinearSimplesmenteEncadeada<Integer> listaLinearSimplesmenteEncadeada = new ListaLinearSimplesmenteEncadeada();

        listaLinearSimplesmenteEncadeada.inserirInicio(2);
        listaLinearSimplesmenteEncadeada.inserirInicio(9);
        listaLinearSimplesmenteEncadeada.inserirInicio(4);
        listaLinearSimplesmenteEncadeada.toString();


        // System.out.println("imprimir elementos: " + listaLinearSimplesmenteEncadeada);

    }
}