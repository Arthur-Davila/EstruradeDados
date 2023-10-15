package ListaEncadeadas.ListaSimplimenteEncadeada;

public class Aluno implements Comparable<Aluno>{
    private String matricula;
    private String nome;
    private double media;
    private int faltas;
    public Aluno(String matricula, String nome, double media, int faltas) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
        this.faltas = faltas;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getMedia() {
        return media;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public String toString(){
        return "Matricula"+matricula+"\nNome: "+nome+"\nMedia: "+media+"\nFaltas: "+faltas+'\n';
    }
    public int compareTo(Aluno al){
        if(this.matricula.compareTo(al.matricula)==0){
            return 0;
        }
        else if(this.matricula.compareTo(al.matricula)>0){
            return 1;
        }
        else{
            return -1;
        }
    }

}
