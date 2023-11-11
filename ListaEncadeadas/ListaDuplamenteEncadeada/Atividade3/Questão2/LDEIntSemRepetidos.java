package ListaEncadeadas.ListaDuplamenteEncadeada.Atividade3.Questão2;

public class LDEIntSemRepetidos {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty(){
        return this.primeiro == null && this.ultimo==null &&this.qtd == 0;
    }
    public void exibirTodos(){
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
    
    public void inserirNoInicio(int valor){
        LDENode novo,aux = this.primeiro;
        novo = new LDENode(valor);
        if(this.isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else{
            while(aux!=null){
                if(aux.getInfo() == valor){
                  System.out.println("Valor igual");
                    break;
                }
                else if(aux.getProx()==null){
                    novo.setProx(this.primeiro);
                    this.primeiro.setAnt(novo);
                    this.primeiro  = novo;
                    this.qtd++;
                    break;
                }
                else{
                    aux = aux.getProx();
                }
            }
        }
    }

    public void inserirNoFinal(int valor){
        LDENode novo,aux = this.primeiro;
        novo = new LDENode(valor);
        if(this.isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else{
            while(aux!=null){
                if(aux.getInfo() == valor){
                  System.out.println("Valor igual");
                   
                    break;
                }
                else if(aux.getProx()==null){
                    novo.setAnt(aux);
                    aux.setProx(novo);
                    this.ultimo = novo;
                    this.qtd++;
                    break;
                }
                else{
                    aux = aux.getProx();
                }
            }
        }

    }


public LDEIntSemRepetidos inserirIntersecao(LDEIntSemRepetidos B){
    LDENode aux2 = this.primeiro,aux3 = B.primeiro;
    LDEIntSemRepetidos novo = new LDEIntSemRepetidos();
    if(this.isEmpty()||B.isEmpty()){
        System.out.println("Listas sem interseções");
        return null;
    }
    else{while(aux3!=null){
        while(aux2!=null){
        if(aux2.getInfo() == aux3.getInfo()){
            novo.inserirNoFinal(aux2.getInfo());
            
        }
        
            aux2 = aux2.getProx();
        
    }
    aux2 = this.primeiro;
    aux3 = aux3.getProx();
}
return novo;
}
}
public LDEIntSemRepetidos inserirUniao(LDEIntSemRepetidos B){
     LDENode aux2 = this.primeiro;
      LDEIntSemRepetidos novo = new LDEIntSemRepetidos();
    if(this.isEmpty()&&B.isEmpty()){
        System.out.println("Lista vazia");
        return null;
    }else if(this.isEmpty()){
        while(aux2!=null){
            novo.inserirNoFinal(aux2.getInfo());
            aux2 = aux2.getProx();
        }
        return novo;
    }
    else if(B.isEmpty()){
        aux2 = B.primeiro;
     while(aux2!=null){
        novo.inserirNoFinal(aux2.getInfo());
        aux2 = aux2.getProx();
    }   
    return novo;
    }
    else{
        while(aux2!=null){
            novo.inserirNoFinal(aux2.getInfo());
            aux2 = aux2.getProx();
        }
        aux2 = B.primeiro;
        while(aux2!=null){
            novo.inserirNoFinal(aux2.getInfo());
            aux2 = aux2.getProx();
        }
        return novo;
        }
    }
    public LDEIntSemRepetidos inserirDiferenca(LDEIntSemRepetidos B){
            LDENode aux1 = B.primeiro,aux2 = this.primeiro;
            LDEIntSemRepetidos novo = new LDEIntSemRepetidos();
            if(this.isEmpty()&&B.isEmpty()){
                System.out.println("listas vazias");
                return null;
            }
            else if(this.isEmpty()){
               while(aux2 !=null){
                novo.inserirNoFinal(aux2.getInfo());
                aux2 = aux2.getProx();
            }return novo;
            }
            else if(B.isEmpty()){
                while(aux1!=null){
                    novo.inserirNoFinal(aux1.getInfo());
                    aux1 = aux1.getProx();
                }return novo;
            }
            else{
                while(aux1!=null){
        while(aux2!=null){
        if(aux2.getInfo() == aux1.getInfo()){
            this.remover(aux2.getInfo());
            B.remover(aux2.getInfo());
            
        }
        
            aux2 = aux2.getProx();
        
    }
    aux2 = this.primeiro;
    aux1 = aux1.getProx();
}

            }
          novo = this.inserirUniao(B);
            return novo;
    }
    

    public  void remover(int valor){
        LDENode aux = this.primeiro;
        
        if(this.isEmpty()==true){
            System.out.println("Lista vazia");
            
        }
        else{while(aux!=null){
            if(this.primeiro == this.ultimo && this.qtd == 1 && this.primeiro.getInfo() == valor){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
               
       
        }
        else if(this.primeiro.getInfo() == valor){
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnt(null);
            this.qtd--;
      
        }
        else if(this.ultimo.getInfo()==valor){
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.setProx(null);
            this.qtd--;
      
        }
        else{
            if(aux.getInfo()==valor){
                aux.getProx().setAnt(aux.getAnt());
                aux.getAnt().setProx(aux.getProx());
                this.qtd--;
              
            }
        }
        
             aux = aux.getProx();
    }
    
    }


}
}

