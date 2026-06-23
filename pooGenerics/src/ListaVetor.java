@SuppressWarnings("unchecked")
public class ListaVetor<T> implements Lista<T> {
    private T[] itens;
    private int size;

    public ListaVetor() {
        itens = (T[]) new Object[10];
        size = 0;
    }

    private void ensureCapacity() {
        if (size == itens.length) {
            T[] novo = (T[]) new Object[itens.length * 2];
            for (int i = 0; i < itens.length; i++) {
                novo[i] = itens[i];
            }
            itens = novo;
        }
    }

    public void add(T valor, int pos) {
        ensureCapacity();
        for (int i = size; i > pos; i--) {
            itens[i] = itens[i - 1];
        }
        itens[pos] = valor;
        size++;
    }

    public void add(T valor) {
        add(valor, size);
    }

    public T get(int pos) {
        return itens[pos];
    }

    public T remove(int pos) {
        T removed = itens[pos];
        for (int i = pos; i < size - 1; i++) {
            itens[i] = itens[i + 1];
        }
        size--;
        return removed;
    }

    public boolean remove(T valor) {
        for (int i = 0; i < size; i++) {
            if (itens[i].equals(valor)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }
}