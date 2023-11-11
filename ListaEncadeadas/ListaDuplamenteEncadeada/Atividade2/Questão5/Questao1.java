package ListaEncadeadas.ListaDuplamenteEncadeada.Atividade2.Questão5;

public class Questao1 {
    private LDENode primeiro;
    private LDENode ultimo;
    private int quant;

    public void inserirCrescente(int valor){
        LDENode novo,aux=this.primeiro;
        novo = new LDENode(valor);

        if(isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.quant++;
        }
        else{
            if(this.primeiro.getInfo() >= valor){
                    novo.setProx(this.primeiro);
                    this.primeiro.setAnt(novo);
                    this.primeiro = novo;
                    quant++;
                }
                else if(this.ultimo.getInfo()<valor){
                    novo.setAnt(this.ultimo);
                    this.ultimo.setProx(novo);
                    this.ultimo = novo;
                    quant++;
                }
                else{
                    while(aux!=null){
                        if(aux.getInfo()>=valor){
                            aux.getAnt().setProx(novo);
                            novo.setAnt(aux.getAnt());
                            novo.setProx(aux);
                            aux.setAnt(novo);
                            quant++;
                            break;
                        }
                        aux = aux.getProx();
                    }
                }
        }


    }  public void exibirTodos(){
        LDENode aux = this.primeiro;
        if(this.isEmpty()){
            System.out.println("Não há valor na lista para exibir");
        }
        else{
            while(aux!=null){
                System.out.println("Valor: "+aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
    public boolean isEmpty(){
        return this.primeiro==null&&this.ultimo==null && this.quant==0;
    }
}
