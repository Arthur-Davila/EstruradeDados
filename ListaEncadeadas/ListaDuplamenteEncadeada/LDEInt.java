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
    public void remover(int valor){
        LDENode aux = this.primeiro;
        if(this.isEmpty()){
            System.out.println("Lista vazia");
        }
        else{
            while(aux!=null){
                if(valor == aux.getInfo()){
                    if(this.primeiro==this.ultimo){
                        this.primeiro = null;
                        this.ultimo = null;
                        this.quant--;
    
                }
            }}
            
        }

}
}
