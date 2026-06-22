public class Main {
    public static void main(String[] args) {

        Lista<String> lista = new ListaVetor<>();

        lista.add("Senhor dos aneis: a sociedade do anel");
        lista.add("Senhor dos aneis: as duas torres");
        lista.add("Senhor dos aneis: o retorno do rei");
        lista.add("O Hobbit");

        lista.remove("O Hobbit");
        lista.add("Smaug");

        System.out.println("Max: " + ListaUtil.max(lista));
        System.out.println("Min: " + ListaUtil.min(lista));
        System.out.println("Count: " + ListaUtil.count(lista));
    }
}