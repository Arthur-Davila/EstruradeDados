package ListaEncadeadas.ListaSimplimenteEncadeada;

public class LSEInt {
    private LSENode primeiro;

    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void inserirNoInicio(Integer valor){
        LSENode novo;
        novo = new LSENode(valor);
        if(this.isEmpty()==true){
        this.primeiro  = novo;
    }
    else{
        //Está inserindo novo node no inicio da lista

        novo.setProx(this.primeiro);
        this.primeiro = novo;
    }
    }
    public void exibirTodos(){
        LSENode aux;
        if(this.isEmpty()==true){
            System.out.println("Lista vazia!");
        }
        else{
            aux = this.primeiro;
            while(aux.getProx()!=null){
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}
