package Lista;

import Estrutura.ArraysSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class ListaEstaticaTest<T> {

    public static void main(String[] args) throws ListaVaziaException, ElementoNaoExisteException, ListaCheiaException {


        ListaEstatica<Integer> listaEstatica = new ListaEstatica<>(15);
        listaEstatica.inserindoInicio(1);
        listaEstatica.inserindoInicio(3);
        listaEstatica.inserindoInicio(7);
        listaEstatica.inserirFim(4);
        listaEstatica.inserirFim(9);
        listaEstatica.inserirFim(2);


        System.out.println("imprimir elementos: " + listaEstatica);
        // listaEstatica.removerInicio();
        listaEstatica.removerFim();
        System.out.println("imprimir elementos: " + listaEstatica);
        listaEstatica.removerFim();
        System.out.println("imprimir elementos: " + listaEstatica);
        //JOptionPane.showMessageDialog(null, "Quantidade elementos: " + listaEstatica.getQuantidade());
        //JOptionPane.showMessageDialog(null, "Remover Numero: " + listaEstatica.remover(2));
        //JOptionPane.showMessageDialog(null, "Quantidade elementos: " + listaEstatica.getQuantidade());
        //JOptionPane.showMessageDialog(null, "Remover Numero: " + listaEstatica.remover(4));
        // JOptionPane.showMessageDialog(null, "Quantidade elementos: " + listaEstatica.getQuantidade());
        //System.out.println("Pesquisar posição do elemento: " + listaEstatica.get(1));
        //System.out.println("imprimir elementos: " + listaEstatica);


    }

    @Test
    void isVazia() throws ListaVaziaException {
        System.out.println("Está Vazia a Lista");
        ListaEstatica instance = null;
        boolean expResult = false;
        boolean result = instance.isVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void isCheia() {
        System.out.println("Está Cheia a Lista");
        ListaEstatica instance = null;
        boolean expResult = false;
        boolean result = instance.isCheia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void getQuantidade() {
        System.out.println("getQuantidade");
        ListaEstatica instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInserindoInicio() throws Exception, ListaCheiaException {
        System.out.println("inserindoInicio");
        Object novo = 1;
        ListaEstatica instance = null;
        instance.inserindoInicio(novo);
        // TODO review the generated test code and remove the default call to fail.
        Assertions.fail("The test case is a prototype.");
    }

    @Test
    public void testInserirFim() throws Exception, ListaCheiaException {
        System.out.println("inserirFim");
        Object novo = null;
        ListaEstatica instance = null;
        instance.inserirFim(novo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void get() {
    }

    @Test
    void testGet() {
    }

    @Test
    void removerInicio() {
    }

    @Test
    void removerFim() {
    }

    @Test
    void remover() {
    }

    @Test
    void testToString() {
    }

}