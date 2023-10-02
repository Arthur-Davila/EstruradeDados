package ListaEncadeadas.ListaSimplimenteEncadeada;

public class TESTE{
    public static void main(String[] args) {
        LSEInt L = new LSEInt();
        LSEInt Y = new LSEInt();
        LSEInt soma = new LSEInt();
      L.colocarNoFinal(10);
      L.colocarNoFinal(11);
      L.colocarNoFinal(12);
      Y = L.copiar();
      L.removerComeco();
      L.exibirTodos();

      System.out.println();

      Y.exibirTodos();
      System.out.println();
      soma.somar(L, Y);
      soma.exibirTodos();
    }
}