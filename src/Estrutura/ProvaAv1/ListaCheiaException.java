package Estrutura.ProvaAv1;

import javax.swing.*;

public class ListaCheiaException extends Throwable {
    static {

        JOptionPane.showMessageDialog(null,
                "Não foi posssivél adicionar o elemento desejado \n\n Lista Cheia ", //mensagem
                "ListaCheiaException", // titulo da janela
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
