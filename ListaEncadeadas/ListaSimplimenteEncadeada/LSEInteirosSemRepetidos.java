package ListaEncadeadas.ListaSimplimenteEncadeada;


public class LSEInteirosSemRepetidos {
    private LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }
    public void exibirTodos() {
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
}
}
}
public void inserirNoInicioSemRepeticao(Integer valor) {
    LSENode novo, retorno;
    novo = new LSENode(valor);
    if (this.isEmpty() == true) {
        this.primeiro = novo;
        System.out.println("Inserção efetuada.");
    } else {retorno = this.procurar(valor);
        if (retorno == null) {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            System.out.println("Inserção efetuada!");
        } else {
            System.out.println("Valor repetido. Inserção não efetuada!");
        }
    }       
}
private LSENode procurar(int valor) {
    LSENode auxNode = this.primeiro;
    while (auxNode != null) {
        if (auxNode.getInfo() == valor) {
            return auxNode;
        }
        auxNode = auxNode.getProx();
    }return null;
}
public void removerInicio() {
    if (this.isEmpty() == true) {
        System.out.println("Lista vazia!");
    } else {
        this.primeiro = this.primeiro.getProx();
        System.out.println("Remoção efetuada!");
    }
}
public void colocarNoFinal(Integer valor){
    LSENode novo,aux = this.primeiro;
    novo = new LSENode(valor);
    if(this.isEmpty()){
        this.primeiro = novo;
    }   
    else{
        while (aux != null) {
            if (aux.getInfo() == valor) {
                break;
            }
            else if(aux.getProx() == null){
                aux.setProx(novo);
                break;
            }
            aux = aux.getProx();
        }

    } 
    }  public void remover(int valor){
        LSENode atual, anterior;
        
        if(this.isEmpty()){
            System.out.println("Lista está vazia");
        }
        else if (this.primeiro.getProx()== null){
            if(this.primeiro.getInfo()==valor){
                this.primeiro = null;
                System.out.println("Remoção efetuada!");
            }
            else{
                System.out.println("Valor não encontrado.");
            }
        }
        else{
            
            if(this.primeiro.getInfo()==valor){
                this.primeiro = null;
            }
            else{
                atual  = this.primeiro.getProx();
                anterior = this.primeiro;
                while(atual!=null){
                    
                    if(atual.getInfo()==valor){
                        atual = null;
                        anterior.setProx(atual.getProx());
                        System.out.println("Remoção efetuada!");
                        return;
                    }
                    anterior = atual;   
                    atual = atual.getProx();
                }System.out.println("Valor não encontrado");
            }
          
    }
    
}




    public void removerDoFinal(){
        LSENode aux;
        aux = this.primeiro;
        while(aux != null){
            if(aux.getProx()!=null&& aux.getProx().getProx() == null){
                aux.setProx(null);
                break;
            }else if(aux.getProx()==null){
                this.primeiro =null;
                break;
            }
            else {
            aux = aux.getProx();
            }
        }
      
        }
    public LSENode getPrimeiro(){
        return this.primeiro;
    }
    }
        
    
    
