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
    public void exibirTodos() {
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
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

       public LSEInt copiar(){
            LSEInt copy = new LSEInt();
            LSENode aux = this.primeiro;
          
            
          
            if(this.isEmpty()==false){
           
            
            while(aux!=null){
                
                copy.colocarNoFinal(aux.getInfo());
                aux = aux.getProx();
                
                
    
        }
       
    }
            return copy;

            

       } 
       
public void colocarNoFinal(Integer valor){
    LSENode novo,aux = this.primeiro;
    novo = new LSENode(valor);
    if(this.isEmpty()){
        this.primeiro = novo;
    }   
    else{
        while (aux != null) {
           
            if(aux.getProx() == null){
                aux.setProx(novo);
                break;
            }
            aux = aux.getProx();
        }

    } 
    } 
    public void somar(LSEInt lista1,LSEInt lista2){
             LSENode l1 = lista1.primeiro;
             LSENode l2 = lista2.primeiro;

             while(l1!=null||l2!=null){
                if(l1==null){
                    this.colocarNoFinal(l2.getInfo());             
                }
                else if(l2==null){
                    this.colocarNoFinal(l1.getInfo());
                }
                else{
                    this.colocarNoFinal(l1.getInfo()+l2.getInfo());
                }
                if(l1 !=null){
                    l1 = l1.getProx();
                    
                }
                if(l2!=null){
                    l2 = l2.getProx();
                }
             }
    }
   
    }
    

    


