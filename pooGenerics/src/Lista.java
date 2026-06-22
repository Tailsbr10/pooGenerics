public interface Lista<T> {
    void add(T valor, int pos);
    void add(T valor);
    T get(int pos);
    T remove(int pos);
    boolean remove(T valor);
    int size();
}