package ListaEncadeadas.ListaDuplamenteEncadeada.Atividade3.Questão2;

public class Teste {
    public static void main(String[] args) {
        LDEIntSemRepetidos l = new LDEIntSemRepetidos();
        LDEIntSemRepetidos t = new LDEIntSemRepetidos();
        LDEIntSemRepetidos e = new LDEIntSemRepetidos();
        l.inserirNoFinal(10);
        l.inserirNoFinal(11);
        l.inserirNoFinal(12);
        l.inserirNoFinal(13);
        l.inserirNoFinal(14);
        l.inserirNoFinal(15);
        l.inserirNoFinal(15);
        l.inserirNoFinal(16);
        l.inserirNoFinal(17);
        t.inserirNoFinal(17);
        t.inserirNoFinal(10);
        t.inserirNoFinal(14);
        t.inserirNoFinal(12);
        t.inserirNoFinal(113);
        t.inserirNoFinal(20);
       e = l.inserirDiferenca(t);
        e.exibirTodos();
    }
}
