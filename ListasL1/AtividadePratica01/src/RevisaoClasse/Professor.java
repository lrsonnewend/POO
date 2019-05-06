
package RevisaoClasse;


public class Professor extends Pessoa{
    public int numeroMatricula;
    public String turmas[];

    public Professor(int numeroMatricula, String[] turmas, String nome) {
        super(nome);
        this.numeroMatricula = numeroMatricula;
        this.turmas = turmas;
    }
    
    public void setDisciplinas(String turmas[]){
        this.turmas = turmas;
    }
}
