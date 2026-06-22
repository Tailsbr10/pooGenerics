public class ListaUtil {

    public static <T extends Comparable<T>> T max(Lista<? extends T> lista) {
        T max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(max) > 0) {
                max = lista.get(i);
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T min(Lista<? extends T> lista) {
        T min = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(min) < 0) {
                min = lista.get(i);
            }
        }
        return min;
    }

    public static int count(Lista<?> lista) {
        return lista.size();
    }
}