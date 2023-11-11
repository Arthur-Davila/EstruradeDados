package ListaEncadeadas.ListaDuplamenteEncadeada.Atividade3.Questão1;

public class LDEIntComRepetidos {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() {
        return this.primeiro == null && this.ultimo == null && this.qtd == 0;
    }

    public void inserirNoInicio(int valor) {
        LDENode novo;
        novo = new LDENode(valor);
        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            qtd++;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            qtd++;

            

        }
    }
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
    public  int remover(int valor){
        LDENode aux = this.primeiro;
        int i = 0;
        if(this.isEmpty()==true){
            System.out.println("Lista vazia");
            return 0;  
        }
        else{while(aux!=null){
            if(this.primeiro == this.ultimo && this.qtd == 1 && this.primeiro.getInfo() == valor){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
                i++;
       
        }
        else if(this.primeiro.getInfo() == valor){
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnt(null);
            this.qtd--;
            i++;
        }
        else if(this.ultimo.getInfo()==valor){
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.setProx(null);
            this.qtd--;
            i++;
        }
        else{
            if(aux.getInfo()==valor){
                aux.getProx().setAnt(aux.getAnt());
                aux.getAnt().setProx(aux.getProx());
                this.qtd--;
                i++;
            }
        }
        
             aux = aux.getProx();
    }
    return i;
    }


}
}
