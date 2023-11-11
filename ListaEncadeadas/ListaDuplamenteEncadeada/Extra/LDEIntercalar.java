package ListaEncadeadas.ListaDuplamenteEncadeada.Extra;

public class LDEIntercalar {
    private int qtd;
    private LDENode primeiro;
    private LDENode ultimo;

    public void exibirTodos() {
        LDENode aux = this.primeiro;
        if (this.isEmpty()) {
            System.out.println("Não há valor na lista para exibir");
        } else {
            while (aux != null) {
                System.out.println("Valor: " + aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public boolean isEmpty() {
        return this.primeiro == null && this.ultimo == null && this.qtd == 0;
    }

    public void InserirDecrescente(Integer valor) {
        LDENode novo, aux = this.primeiro;
        novo = new LDENode(valor);
        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (this.primeiro == this.ultimo && qtd == 1) {
            if (this.primeiro.getInfo() < valor) {
                this.primeiro.setAnt(novo);
                novo.setProx(this.primeiro);
                this.ultimo = this.primeiro;
                this.primeiro = novo;
                qtd++;
            } else if (this.ultimo.getInfo() > valor) {
                this.primeiro.setProx(novo);
                novo.setAnt(this.primeiro);
                this.ultimo = novo;
                qtd++;
            }

        } else if (this.primeiro.getInfo() < valor) {
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            qtd++;
        } else if (this.ultimo.getInfo() > valor) {
            novo.setAnt(this.ultimo);
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            qtd++;
        }

        else {
            while (aux != null) {
                if (aux.getInfo() < valor) {
                    novo.setProx(aux);
                    aux.setAnt(novo);
                    qtd++;
                    break;
                } else if (aux.getInfo() == valor) {
                    System.out.println("Valor igual");
                    return;
                }

                aux = aux.getProx();

            }
        }

    }

    public void inserirIntercalar(LDEIntercalar l1, LDEIntercalar l2) {
        LDENode aux2 = l2.primeiro, aux1 = l1.primeiro, aux3 = this.primeiro;
        if (l1.isEmpty() && l2.isEmpty()) {
            System.out.println("Lista vazia");
        } else if (l1.isEmpty()) {
            while (aux2 != null) {
                this.InserirDecrescente(aux2.getInfo());
                aux2 = aux2.getProx();
                this.qtd++;
            }
        }

        else if (l2.isEmpty()) {
            while (aux1 != null) {
                this.InserirDecrescente(aux1.getInfo());
                aux1 = aux1.getProx();
                this.qtd++;
            }
        } else {
            while (true) {
                if (aux1 == null && aux2 != null) {

                    while (aux2 != null) {
                        this.InserirDecrescente(aux2.getInfo());
                        aux2 = aux2.getProx();
                        this.qtd++;
                    }
                }

                else if (aux2 == null && aux1 != null) {
                    while (aux1 != null) {
                        this.InserirDecrescente(aux1.getInfo());
                        aux1 = aux1.getProx();
                        this.qtd++;
                    }
                }

                else if (aux3 == null && aux2.getInfo() > aux1.getInfo()) {
                    this.InserirDecrescente(aux1.getInfo());
                    this.qtd = this.qtd + 1;
                    aux1 = aux1.getProx();
                } else if (aux3 == null && aux2.getInfo() < aux1.getInfo()) {
                    this.InserirDecrescente(aux2.getInfo());
                    this.qtd++;
                    aux2 = aux2.getProx();
                }

                if (aux1 == null && aux2 == null) {
                    return;
                }
            }
        }

    }
}