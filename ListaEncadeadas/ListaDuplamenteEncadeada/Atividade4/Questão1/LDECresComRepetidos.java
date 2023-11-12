package ListaEncadeadas.ListaDuplamenteEncadeada.Atividade4.Questão1;

public class LDECresComRepetidos {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty(){
        return this.primeiro == null && this.ultimo == null && this.qtd == 0;
    }
    public void inserirCrescente(int valor){
        LDENode novo, aux = this.primeiro;
        novo = new LDENode(valor);
        int cont =0 ;
        if(this.isEmpty()==true){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else{
            if(this.ultimo == this.primeiro && this.qtd == 1){
                if(this.primeiro.getInfo()>=valor){
                    this.primeiro.setAnt(novo);
                    novo.setProx(this.primeiro);
                    this.primeiro = novo;
                    qtd++;
                }
                else{
                    this.primeiro.setProx(novo);
                    novo.setAnt(this.primeiro);
                    this.ultimo = novo;
                    this.qtd++;
                }

            }
            else{
                while(aux!=null){
                   if(this.primeiro.getInfo()>=valor){
                    this.primeiro.setAnt(novo);
                    novo.setProx(this.primeiro);
                    this.primeiro = novo;
                    qtd++;
                    return;
                }
                else if(this.ultimo.getInfo()<valor){
                    this.ultimo.setProx(novo);
                    novo.setAnt(this.ultimo);
                    this.ultimo = novo;
                    this.qtd++;
                    return;
                }
                
                
                else if(aux.getInfo()<valor&&valor<=aux.getProx().getInfo()&&aux.getProx()!=null){
                    aux.getProx().setAnt(novo);
                    novo.setProx(aux.getProx());
                    aux.setProx(novo);
                    novo.setAnt(aux);
                   cont++;
                    qtd++;
                    return;
                    
            }    aux = aux.getProx();
                }if(this.ultimo.getInfo()==valor&& cont ==0) {
                    this.ultimo.getAnt().setProx(novo);
                    novo.setAnt(this.ultimo.getAnt());
                    this.ultimo.setAnt(novo);
                    novo.setProx(this.ultimo);
                    this.qtd++;
                    
                }
                }
            }
        }

    }

