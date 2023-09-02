package Pilhas.ListaDeExercicios1.Questão2;
import java.util.Scanner;
public class StringPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a frase para saber se é um palindromo:");
        String frase = sc.nextLine();
        int tam = frase.length();
        int quant = 0;
        int i,comp=0,menos=0;
        //Contar o tamanho da frase sem espaços
        for(i=0;i<tam;i++){
         if(Character.isLetterOrDigit(frase.charAt(i))){
                quant++;
        }
    
    }//Colocar em um vetor e na pilha
    StackChar ch = new StackChar(quant);
     char[] palindromo = new char[quant];
    for(i=0;i<tam;i++){
        if(Character.isLetterOrDigit(frase.charAt(i))){
            
            if(ch.isFull()==false){
                ch.push(frase.toLowerCase().charAt(i));
                palindromo[i-menos] = frase.toLowerCase().charAt(i);
            }
        }
        else{
            menos++;
        }
    }//Comparar
    for(i=0;i<quant;i++){
        if(ch.empty()==false){
        if(palindromo[i]==ch.pop()){
            comp++;
        }

    }
    }
    if(comp==quant){
        System.out.println("É um palindrômo");
    }
    else{
        System.out.println("Não é um palindrômo");
    }

    
}
}