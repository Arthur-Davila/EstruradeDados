package ListaEncadeadas.ListaDuplamenteEncadeada.Extra;

public class Teste {
    public static void main(String[] args) {
        LDEIntercalar L = new LDEIntercalar();
        LDEIntercalar todos = new LDEIntercalar();
        L.InserirDecrescente(1);
        L.InserirDecrescente(2);
        L.InserirDecrescente(3);
        L.InserirDecrescente(4);
        L.InserirDecrescente(2);
        L.InserirDecrescente(55);
        L.InserirDecrescente(1);
        L.InserirDecrescente(3);
        L.InserirDecrescente(10);
        LDEIntercalar Y = new LDEIntercalar();
        Y.InserirDecrescente(10);
        Y.InserirDecrescente(4);
        Y.InserirDecrescente(3);
        Y.InserirDecrescente(100);
        Y.InserirDecrescente(11);
        Y.InserirDecrescente(68);
        Y.InserirDecrescente(7);
        Y.InserirDecrescente(2);
        Y.InserirDecrescente(2);
        todos.inserirIntercalar(L, Y);
        todos.exibirTodos();
    }
     
}