package ListaEncadeadas.ListaSimplimenteEncadeada;

import ListaEncadeadas.ListaDuplamenteEncadeada.LDEInteirosSemRepetidos;

public class TESTE{
    public static void main(String[] args) {
     LDEInteirosSemRepetidos p = new LDEInteirosSemRepetidos();
     p.exibirTodos();
     p.inserirNoFinal(10);
     p.inserirNoInicio(11);
     p.inserirNoFinal(12);
     p.inserirNoInicio(9);
     p.inserirNoFinal(10);
     p.inserirNoInicio(10);
    p.exibirTodos();
    p.removerNoComeco();
    System.out.println();
    p.exibirTodos();
    
    p.remover(12);
    p.exibirTodos();
    p.remover(22);
    p.remover(10);
    p.exibirTodos();
    }
}