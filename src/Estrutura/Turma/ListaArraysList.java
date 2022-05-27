package Estrutura.Turma;

import javax.swing.*;
import java.util.ArrayList;

public class ListaArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(12);
        list.add(7);
        list.add(4);
        JOptionPane.showMessageDialog(null, "Quantidade elementos: " + list.size());
        JOptionPane.showMessageDialog(null, "Remover Numero: " + list.remove(1));
        JOptionPane.showMessageDialog(null, "Quantidade elementos: " + list.size());
        JOptionPane.showMessageDialog(null, "Remover Numero: " + list.remove(4));
        JOptionPane.showMessageDialog(null, "Quantidade elementos: " + list.size());

        System.out.println("imprimir elementos: " + list);
    }
}
