package Pilhas.ListaDeExercicios1.Questão2;

public class StackChar {
   
        private char[] stack;
        private int quant;
       


        public StackChar(int tam){
          this.stack = new char[tam];
          
        }
        public int pop(){
          //retorna o topo(ultimo)
          char valor = this.stack[this.quant-1];
          this.stack[this.quant-1] = 0;
          this.quant--;
          return valor;
        
           }
        
        public void push(char n){
          //colocar o elemento no topo
            this.stack[this.quant] = n;
            quant++;
            
          }
        
        public int top(){
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
