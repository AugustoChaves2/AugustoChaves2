package Lista;

import javax.swing.*;

class ListaEstaticaTest<T> {

    public static void main(String[] args) throws ListaVaziaException, ElementoNaoExisteException, ListaCheiaException {

        ListaEstatica<Integer> listaEstatica = new ListaEstatica<>(10);
        listaEstatica.inserindoInicio(1);
        listaEstatica.inserindoInicio(3);
        listaEstatica.inserindoInicio(7);
        listaEstatica.inserirFim(4);
        listaEstatica.inserirFim(9);
        listaEstatica.inserirFim(2);

        System.out.println("imprimir elementos: " + listaEstatica);
        JOptionPane.showMessageDialog(null, "Quantidade elementos: " + listaEstatica.getQuantidade());
        JOptionPane.showMessageDialog(null, "Remover Numero: " + listaEstatica.remover(7));
        JOptionPane.showMessageDialog(null, "Quantidade elementos: " + listaEstatica.getQuantidade());
        JOptionPane.showMessageDialog(null, "Remover Numero: " + listaEstatica.remover(4));
        JOptionPane.showMessageDialog(null, "Quantidade elementos: " + listaEstatica.getQuantidade());
        System.out.println("Pesquisar posição do elemento: " + listaEstatica.get(1));
        System.out.println("imprimir elementos: " + listaEstatica);



    }
}