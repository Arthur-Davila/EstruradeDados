package ListaEncadeadas.ListaDuplamenteEncadeada.Questão5;

public class Questao2 {
    private LDENode primeiro;
    private LDENode ultimo;
    private int quant;
    public void exibirTodos(){
        LDENode aux = this.primeiro;
        if(this.isEmpty()){
            System.out.println("Não há valor na lista para exibir");
        }
        else{
            while(aux!=null){
                System.out.println("Valor: "+aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
    public boolean isEmpty(){
        return this.primeiro==null&&this.ultimo==null&&this.quant==0;
    }
    public void inserirCrescente(int valor){
        LDENode novo,aux = this.primeiro;
        novo = new LDENode(valor);

        if(isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.quant++;

        }
        else{
            if(this.primeiro.getInfo()<valor){
                novo.setProx(this.primeiro);
                this.primeiro.setAnt(novo);
                this.primeiro = novo;
                this.quant++;
            }
            else if(this.ultimo.getInfo()>valor){
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo = novo;
                this.quant++;
            }
            else{
                while(aux!=null){
                    if(aux.getInfo()<valor){
                        aux.getAnt().setProx(novo);
                        novo.setAnt(aux.getAnt());
                        novo.setProx(aux);
                        aux.setAnt(novo);
                        quant++;
                        break;
                    }else if(aux.getInfo()==valor){
                        break;
                    }
                    aux = aux.getProx();
                }
            }
        }
    }

    public void buscar(int valor){
        LDENode aux = this.primeiro;
        int i = 0;
        if(this.isEmpty()){
            System.out.println("0 TAREFAS A SER EXECUTADAS");
        }
        else{
            while(aux!=null){
                if(aux.getInfo()==valor){
                    i++;
                    System.out.println(i-1+" TAREFAS A SER EXECUTADAS" );
                    return;
                }
                aux = aux.getProx();
            }
            if(i==quant){
                System.out.println("Não existe a tareafa a ser executada");
            }
        }

    }
}
