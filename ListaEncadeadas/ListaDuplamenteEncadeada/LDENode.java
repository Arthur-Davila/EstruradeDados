package ListaEncadeadas.ListaDuplamenteEncadeada;

public class LDENode{
    private Integer info;
    private LDENode prox;
    public LDENode(Integer valoInteger) {
        this.info = valoInteger;
    }
    public void setInfo(Integer novoValor) {
        this.info = novoValor;
    }
    public void setProx(LDENode novoProx) {
        this.prox = novoProx;
    }
    public Integer getInfo() {
        return info;
    }
    public LDENode getProx() {
        return prox;
    }
  
}