public class ListaEncadeada<T> implements Lista<T> {

    private No<T> inicio;
    private int tamanho;

    @Override
    public void add(T valor) {
        add(valor, tamanho);
    }

    @Override
    public void add(T valor, int pos) {

        No<T> novo = new No<>(valor);

        if (pos == 0) {
            novo.proximo = inicio;
            inicio = novo;
        } else {

            No<T> atual = inicio;

            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }

            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }

        tamanho++;
    }

    @Override
    public T get(int pos) {

        No<T> atual = inicio;

        for (int i = 0; i < pos; i++) {
            atual = atual.proximo;
        }

        return atual.valor;
    }

    @Override
    public T remove(int pos) {

        T valor;

        if (pos == 0) {
            valor = inicio.valor;
            inicio = inicio.proximo;
        } else {

            No<T> atual = inicio;

            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }

            valor = atual.proximo.valor;
            atual.proximo = atual.proximo.proximo;
        }

        tamanho--;

        return valor;
    }

    @Override
    public boolean remove(T valor) {

        if (inicio == null)
            return false;

        if (inicio.valor.equals(valor)) {
            inicio = inicio.proximo;
            tamanho--;
            return true;
        }

        No<T> atual = inicio;

        while (atual.proximo != null) {

            if (atual.proximo.valor.equals(valor)) {

                atual.proximo = atual.proximo.proximo;
                tamanho--;

                return true;
            }

            atual = atual.proximo;
        }

        return false;
    }

    @Override
    public int size() {
        return tamanho;
    }
}