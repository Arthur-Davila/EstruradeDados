package ListaEncadeadas.ListaDuplamenteEncadeada.Atividade3.Questão1;

public class Teste {
    public static void main(String[] args) {
        LDEIntComRepetidos L = new LDEIntComRepetidos();
        L.inserirNoInicio(11);
        L.exibirTodos();
        System.out.println(L.remover(11));
        L.exibirTodos();

    }
}
