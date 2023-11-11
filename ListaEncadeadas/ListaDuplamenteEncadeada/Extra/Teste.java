package ListaEncadeadas.ListaDuplamenteEncadeada.Extra;

public class Teste {
    public static void main(String[] args) {
        LDEIntercalar L = new LDEIntercalar();
        LDEIntercalar todos = new LDEIntercalar();
        L.InserirDecrescente(13);
        L.InserirDecrescente(33);
        L.InserirDecrescente(13);
        L.InserirDecrescente(27);
        L.InserirDecrescente(77);
        L.InserirDecrescente(55);
        L.InserirDecrescente(79);
        L.InserirDecrescente(39);
        L.InserirDecrescente(67);
        LDEIntercalar Y = new LDEIntercalar();
        Y.InserirDecrescente(6);
        Y.InserirDecrescente(12);
        Y.InserirDecrescente(20);
        Y.InserirDecrescente(1922);
        Y.InserirDecrescente(60);
        Y.InserirDecrescente(68);
        Y.InserirDecrescente(98);
        Y.InserirDecrescente(2);
        Y.InserirDecrescente(2);
        todos.inserirIntercalar(L, Y);
        todos.exibirTodos();
    }
     
}