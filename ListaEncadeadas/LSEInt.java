package ListaEncadeadas;

public class LSEInt {
    private LSENode primeiro;

    public void inserirNoInicio(Integer valor){
        LSENode novo;
        novo = new LSENode(valor);
        if(this.primeiro==null){
        this.primeiro  = novo;
    }
    else{
        novo.setProx(this.primeiro);
        this.primeiro = novo;
    }
    }
}
