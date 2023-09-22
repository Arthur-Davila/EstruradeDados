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

    public int procurarValor(int valor) {
        int cont =0;
        LSENode aux ;
        if(this.isEmpty()){
            return 0;

        }
        else{
            aux = this.primeiro;
            while(aux!=null){
                if(aux.getInfo().compareTo(valor)==0){
                    cont++;
                }
                aux = aux.getProx();
            }
        }
        return cont;
    }

    public void removerComeco() {
        this.primeiro = this.primeiro.getProx();
    }
    public LSENode procurar(int valor){
       
        LSENode aux ;
        LSENode temp = null;
        if(this.isEmpty()){
            return null;

        }
        else{
            aux = this.primeiro;
            while(aux!=null){
                if(aux.getInfo() == valor){
                    temp = aux;
                }
                aux = aux.getProx();
            }
            return temp;
        }
       
       
    }
    public void inserirNoInicioSemRepeticao(Integer valor){
            LSENode novo,retorno;
            novo = new LSENode(valor);
            if(this.isEmpty()==true){
            this.primeiro  = novo;
        }
        else{
            //Está inserindo novo node no inicio da lista
            retorno = this.procurar(valor);
            if(retorno == null){
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            System.out.println("Operação inserida");
        }
        else{
            System.out.println("Valor repetido, inserção não funcinou.");
        }
        }
        }
    }
    

    


