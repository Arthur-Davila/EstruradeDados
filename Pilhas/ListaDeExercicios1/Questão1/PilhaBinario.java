package Pilhas.ListaDeExercicios1.Questão1;

public class PilhaBinario {
   
        private int[] stack;
        private int quant;
       
      
       
        public PilhaBinario(){
          this.stack = new int[32];
          
        }
        public int pop(){
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

