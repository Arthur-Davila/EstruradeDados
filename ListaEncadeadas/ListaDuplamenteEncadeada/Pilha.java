package ListaEncadeadas.ListaDuplamenteEncadeada;

public class Pilha {
    private LDEInteirosSemRepetidos pilhas;
    
    public void enQueue(int valor){
        pilhas.inserirNoInicio(valor);
    }
    public int deQueue(){
        LDENode temp = pilhas.getPrimeiro();
        pilhas.removerNoComeco();
        return temp.getInfo();
    }
    public int head(){
        return pilhas.getPrimeiro().getInfo();
    }
    public boolean isEmpty(){
        if(pilhas.getPrimeiro()==null&&pilhas.getQuant()==0&&pilhas.getUltimo()==null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        return false;
    }


}
