
package RevisaoClasse;


public class Aluno extends Pessoa{
    public int numeroMatricula;
    public String turma;

    public Aluno(int numeroMatricula, String turma, String nome) {
        super(nome);
        this.numeroMatricula = numeroMatricula;
        this.turma = turma;
    }
    
    
    
    
    
}
