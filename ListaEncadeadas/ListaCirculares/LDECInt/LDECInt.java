package ListaEncadeadas.ListaCirculares.LDECInt;

public class LDECInt {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() {

        return this.primeiro == null && this.ultimo == null && this.qtd == 0;
    }
    public void inserirInicio(int valor){
        LDENode novo;
        novo = new LDENode(valor);
        if(this.isEmpty()==true){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else{
            novo.setProx((this.primeiro));
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        }
            this.primeiro.setAnt(this.ultimo);
            this.ultimo.setProx(this.primeiro);
    }

}
