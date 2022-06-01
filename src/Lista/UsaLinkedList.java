package Lista;

import java.util.Iterator;
import java.util.LinkedList;

public class UsaLinkedList {
    public static void main(String[] args) {

        // Cria a lista encadeada
        LinkedList<String> listaEncadeada = new LinkedList<String>();

        //Verifica se a lista está vazia
        System.out.println("Lista Vazia: " + listaEncadeada.isEmpty());

        // Insere no inicio da lista
        listaEncadeada.addFirst("Primeiro");
        listaEncadeada.addFirst("Segundo");

        // Insere no final da lista
        listaEncadeada.addLast("Terceiro");
        listaEncadeada.addLast("Quarto");

        // Verifica se a lista está vazia
        System.out.println("Lista Vazia: " + listaEncadeada.isEmpty());

        // Verifica a quantidade de elementos na lista
        System.out.println("Lista Vazia: " + listaEncadeada.size());

        // Imprime os elementos
        Iterator<String> it = listaEncadeada.iterator();
        while (it.hasNext())
            System.out.println("Removido: " + it.next());

        // Verifica a existencia de determinado elementos
        System.out.println(listaEncadeada.contains("Primeiro"));
        System.out.println(listaEncadeada.contains("Não existe"));
        System.out.println(listaEncadeada.indexOf("Primeiro"));

        // Remove do inicio da lista
        System.out.println(listaEncadeada.removeFirst());

        // Remove do final da lista
        System.out.println(listaEncadeada.removeLast());

        // Remove determinado elemento
        System.out.println(listaEncadeada.remove("Terceiro"));
        System.out.println(listaEncadeada.remove("Primeiro"));

        // Verificar se a lista está vazia
        System.out.println("Lista Vazia: " + listaEncadeada.isEmpty());


    }

}
