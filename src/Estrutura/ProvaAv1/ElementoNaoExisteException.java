package Estrutura.ProvaAv1;

import javax.swing.*;

public class ElementoNaoExisteException extends Throwable {
    static {

        JOptionPane.showMessageDialog(null,
                "Não foi posssivél encontrar o elemento desejado \n\n Elemento não existe ", //mensagem
                "ElementoNaoExisteException", // titulo da janela
                JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Pesquise outro numero!");
        System.exit(0);
    }
}
