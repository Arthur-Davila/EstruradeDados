package ListaEncadeadas.ListaDuplamenteEncadeada;

public class LDEInt {
    private LDENode primeiro;
    private LDENode ultimo;
    private int quant;

    public boolean isEmpty(){
        return this.primeiro == null && this.ultimo == null && this.quant == 0;
    }
    public void inserirNoFinal(int valor){
        LDENode novo,aux = this.primeiro;
        novo = new LDENode(valor);
        if(this.isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.quant++;
        }
        else{
            while(aux!=null){
                if(aux.getProx()==null){
                    novo.setAnt(aux);
                    aux.setProx(novo);
                    this.ultimo = novo;
                    quant++;
                    break;
                }
                else{
                    aux = aux.getProx();
                }
            }
        }

    }

}
