package ListaDeExercicios1.Questão1;

import java.util.Scanner;

public class Binario1 {
    public static void main(String[] args) {
        PilhaBinario p = new PilhaBinario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o valor para tranformar em binário");
        int valor1 = sc.nextInt();
        int valor2;
        
        while(valor1!=0){
            valor2 = valor1%2;
            valor1 = valor1/2;
            if(p.isFull()==false){
                p.push(valor2);
            }
            }
            while(p.empty()==false){
            valor2 = p.pop();
            System.out.print(valor2);

        }  System.out.println();
 }
}
