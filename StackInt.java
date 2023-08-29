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
    int i;
    for(i = this.stack.length-1; i>0;i--){
      if()
    }
  }
  public void push(int n){
      int i;
      for(i = 0;i<this.stack.length;i++){
      if(this.stack[i] == 0){
        this.stack[i] = n;
        break;
      }

      
    }
  }
  public int pop(){
    return 1;
  }
  public boolean isEmpty() {
    if (this.quant == 0) {
        return true;
    } else {
        return false;
    }
}
public boolean isFull() {
    if (this.quant == this.stack.length) {
        return true;
    } else {
        return false;
    }
}
}