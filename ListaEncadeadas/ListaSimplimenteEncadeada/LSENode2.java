package ListaEncadeadas.ListaSimplimenteEncadeada;

public class LSENode2 {
    private Aluno info;
    private LSENode2 prox;
    public LSENode2(Aluno valoInteger) {
        this.info = valoInteger;
    }
    public void setInfo(Aluno novoValor) {
        this.info = novoValor;
    }
    public void setProx(LSENode2 novoProx) {
        this.prox = novoProx;
    }
    public Aluno getInfo() {
        return info;
    }
    public LSENode2 getProx() {
        return prox;
    }
  
    
}

