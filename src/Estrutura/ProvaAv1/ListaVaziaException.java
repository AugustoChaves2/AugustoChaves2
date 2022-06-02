package Estrutura.ProvaAv1;

import javax.swing.*;

public class ListaVaziaException extends Throwable{
    static {

        JOptionPane.showMessageDialog(null,
                "Não foi posssivél remover o elemento desejado \n\n Lista sem elementos ", //mensagem
                "ListaVaziaException", // titulo da janela
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
