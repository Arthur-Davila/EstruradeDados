package ListaEncadeadas.ListaSimplimenteEncadeada;
import java.util.Scanner;
public class ListasDeInteiros {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LSEInt numeros;numeros = new LSEInt();
        int op, num,qtd;
        do {exibirOpcoes();
            op = in.nextInt();
            switch (op) {
                case 1: System.out.print("Informe o valor a ser inserido: ");
                num = in.nextInt();
                numeros.inserirNoInicio(num);
                break;
                case 2: 
                numeros.exibirTodos();
                break;
                case 3:
                numeros.removerComeco();
                break;
                case 4:
                System.out.println("Coloque o valor a ser procurado:");
                int valor = in.nextInt();
                qtd = numeros.procurarValor(valor);
                System.out.println("O valor "+valor+" apareceu "+qtd+" vezes");
                break;
                case 0: System.out.println("Bye bye");
                break;
                default: System.out.println("Opção inválida!");
            }
           } while (op != 0);
        }
            public static void exibirOpcoes() {
                System.out.println("Opções");
            System.out.println("1 -Inserir novo valor no início da lista");
            System.out.println("2 -Exibir valores na lista");
            System.out.println("3 -Remover o primeiro valor da lista");
            System.out.println("4 -Procurar um valor");
            System.out.println("0 -Encerrar programa");
            System.out.print("Digite a opção desejada: ");
        }
    }