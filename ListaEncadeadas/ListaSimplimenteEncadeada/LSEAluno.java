package ListaEncadeadas.ListaSimplimenteEncadeada;

public class LSEAluno{
    LSENode2 primeiro;
    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        }
        else{
            return false;
        }
    }
public void colocarNoFinal(Aluno valor){
    LSENode2 novo,aux = this.primeiro;
    novo = new LSENode2(valor);
    if(this.isEmpty()){
        this.primeiro = novo;
    }   
    else{
        while (aux != null) {
            if (aux.getInfo().compareTo(valor) ==0) {
                break;
            }
            else if(aux.getProx() == null){
                aux.setProx(novo);
                break;
            }
            aux = aux.getProx();
        }

    } 

}
public void exibirTodos() {
    LSENode2 aux;
    if (this.isEmpty() == true) {
        System.out.println("Lista vazia!");
    } else {
        aux = this.primeiro;
        while (aux != null) {
            System.out.println(aux.getInfo().toString());
            aux = aux.getProx();
}
}
}
public void alunosRepEAp(LSEAluno aprovados,LSEAluno reprovados){
        LSENode2 aux = this.primeiro;
        Aluno al;

    if(this.isEmpty()==false){
      
        while(aux!=null){
            al = aux.getInfo();
        if(aux.getInfo().getMedia()>=7){
            aprovados.colocarNoFinal(al);
          
        }
        else{
            reprovados.colocarNoFinal(al);
        }  aux = aux.getProx();
    }

    }

}

}