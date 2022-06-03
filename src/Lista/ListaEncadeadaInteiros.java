package Lista;

public class ListaEncadeadaInteiros {
    private Nodo prim;


    public void criarLista() {
        prim = null;
    }

    public boolean listaVazia() {
        if (prim == null)
            return true;
        else
            return false;
    }

    // Inserir no inicio
    public void add(int i) {
        Nodo novo = new Nodo();
        novo.setInfo(i);
        novo.setProx(prim);
        prim = novo;
    }


    // Buscar Elemento
    public Nodo buscaElemento(int i) throws ElementoNaoExisteException {
        Nodo p = prim;
        if (prim != null) {
            while (p != null && p.getInfo() != i) {
                p = p.getProx();

            }
            System.out.println("Elemento encontrado: " + p.getInfo());
        } else {
            throw new ElementoNaoExisteException();

        }

        return p;
    }

    public void addOrdenadoCres(int i) {
        Nodo novo;

        // Move elemento para anterior
        Nodo anterior = null;
        // Percore a lista
        Nodo p = prim;

        // Procurar elemento na lista
        while (p != null && p.getInfo() > i) {
            anterior = p;
            p = p.getProx();
        }

        // Cria novo elemento
        novo = new Nodo();
        novo.setInfo(i);

        //Encadeia novo elemento
        if (anterior == null) { // Insere no inicio
            novo.setProx(prim);
            prim = novo;
        } else { // Insere no meio da lista
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }

    public void addOrdenadoDecres(int i) {
        Nodo novo;

        // Move elemento para anterior
        Nodo anterior = null;
        // Percore a lista
        Nodo p = prim;

        // Procurar elemento na lista
        while (p != null && p.getInfo() < i) {
            anterior = p;
            p = p.getProx();
        }

        // Cria novo elemento
        novo = new Nodo();
        novo.setInfo(i);

        //Encadeia novo elemento
        if (anterior == null) { // Insere no inicio
            novo.setProx(prim);
            prim = novo;
        } else { // Insere no meio da lista
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }

    public void remove(int i) {

        // Move o elemento para anterior
        Nodo anterior = null;

        // Percorre a lista
        Nodo p = prim;

        // Procura elemento na lista guardando anterior
        while (p != null && p.getInfo() != i) {
            anterior = p;
            p = p.getProx();
        }

        // Verifica se achou elemento
        if (p == null) {
            return; // Nao achou
        }

        // Retira o elemento
        if (p == null) {
            // Nao achou mantem primeiro
        }

        // Retira o elemento
        if (anterior == null) {
            prim = p.getProx(); // Retira elemento inicio
        } else {
            anterior.setProx(p.getProx()); // Retira do meio da lista
        }
    }

    public void limparLista() {
        while (prim != null) {
            Nodo temp = prim.getProx();
            prim = null;
            prim = temp;
        }
    }


    // Imprimir lista
    public void exibir() {
        for (Nodo n = prim; n != null; n = n.getProx()) {
            System.out.println("Elemento: " + n.getInfo());
        }
        if (listaVazia() == true) {
            System.out.println("Lista está Vazia");
        }
    }

}



