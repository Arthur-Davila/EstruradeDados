package ListaEncadeadas.ListaSimplimenteEncadeada;

public class TESTE{
    public static void main(String[] args) {
        LSEInteirosSemRepetidos L = new LSEInteirosSemRepetidos();
        L.colocarNoFinal(10);
        L.colocarNoFinal(11);
        L.colocarNoFinal(10);
        L.colocarNoFinal(13);
        L.exibirTodos();
        L.removerDoFinal();
        System.out.println();
        L.exibirTodos();
        System.out.println();
        L.removerDoFinal();
        L.exibirTodos();
    }
}