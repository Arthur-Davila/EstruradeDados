package ListaEncadeadas.ListaSimplimenteEncadeada;

public class StackLSE {
  private LSENode stack;
 

  
  public Integer pop(){
    //retirar um elemento do topo
    LSENode aux = this.stack;
    Integer temp = 0;
    while(true){
        if(aux.getProx()!=null&&aux.getProx().getProx()==null){
            temp = aux.getProx().getInfo();
            aux.setProx(null);
            return temp;
        }else if(aux.getProx() == null){
            temp = this.stack.getInfo();         
            this.stack = null;
            return temp; 

        }else{
        aux = aux.getProx();
        }
    }
  
     }
  
  public void push(Integer n){
    //colocar o elemento no topo
    LSENode novo,aux = this.stack;
    novo = new LSENode(n);
    if(this.isEmpty()){
        this.stack = novo;
    }   
    else{
        while (aux != null) {
            if(aux.getProx() == null){
                aux.setProx(novo);
                break;
            }
            aux = aux.getProx();
        }

    } 
    }
    
  
  public Integer top(){
    //retorna o topo(ultimo)
    LSENode aux = this.stack;
    while(aux !=null){
        if(aux.getProx()==null){
            return aux.getInfo();
        
        }
        aux = aux.getProx();
    }    return null; 
  }
  public boolean isEmpty() {
    //testa se o vetor está vazio
    if ( this.stack == null) {
        return true;
    } else {
        return false;
    }
}
public boolean isFull() {
  //testa se o vetor está cheio
  return false;
}

}
