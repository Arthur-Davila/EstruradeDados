public class StackInt {
  private int[] stack;
  private int quant;
 

  public StackInt(int tam){
    this.stack = new int[tam];
    
  }
  public StackInt(){
    this.stack = new int[10];
    
  }
  public int top(){
    //retorna o topo(ultimo)
    int valor = this.stack[this.quant-1];
    this.stack[this.quant-1] = 0;
    this.quant--;
    return valor;
  
     }
  
  public void push(int n){
    //colocar o elemento no topo
      this.stack[this.quant] = n;
      quant++;
      
    }
  
  public int pop(){
    //retirar um elemento do topo
    return this.stack[this.quant-1];
     
  }
  public boolean empty() {
    //testa se o vetor está vazio
    if (this.quant == 0) {
        return true;
    } else {
        return false;
    }
}
public boolean isFull() {
  //testa se o vetor está cheio
    if (this.quant == this.stack.length) {
        return true;
    } else {
        return false;
    }
}

}