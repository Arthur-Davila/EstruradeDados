package Pilhas.StackInt;
public class UsoPilhas {
   public static void main(String[] args) {
    int n;
    StackInt pilha = new StackInt(5);
    if(pilha.isFull()==false){
     pilha.push(25);}
    if(pilha.isFull()==false){
      pilha.push(10);}
    if(pilha.isFull()==false){
      pilha.push(11);}
    if(pilha.isFull()==false){
      pilha.push(20);}
    if(pilha.isFull()==false){
      pilha.push(32);}
    if(pilha.isFull()==false){
      pilha.push(7);}
    while(pilha.empty()==false){
      n = (int)pilha.pop();
      System.out.println("Valor desempilhado: "+ n);
      
    }
   } 
}
