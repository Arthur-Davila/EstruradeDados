package ListaEncadeadas.ListaSimplimenteEncadeada;

public class LSENode {
    private Integer info;
    private LSENode prox;
    public LSENode(Integer valoInteger) {
        this.info = valoInteger;
    }
    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }
    public void setProx(LSENode novoProx) {
        this.prox = novoProx;
    }
    public Integer getInfo() {
        return info;
    }
    public LSENode getProx() {
        return prox;
    }
  
    
}
