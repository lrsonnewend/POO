package engine;

import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import modelo.Professor;

public class Agenda {
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private List<Professor> professores = new ArrayList<Professor>();
    java.util.Scanner reader = new java.util.Scanner(System.in);

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    
    
    public void addAluno(){
        Aluno a1 = new Aluno();
        
        System.out.print("Nome: ");
        a1.setNome(reader.next());
        
        System.out.print("Telefone: ");
        a1.setTelefone(reader.next());
        
        System.out.print("Email: ");
        a1.setEmail(reader.next());
        
        System.out.print("RA: ");
        a1.setRa(reader.next());
    
        alunos.add(a1);
    }
    
    public void addProf() {
    	Professor p1 = new Professor();
    	 
    	System.out.print("Nome: ");
        p1.setNome(reader.next());
         
        System.out.print("Telefone: ");
        p1.setTelefone(reader.next());
         
        System.out.print("Email: ");
        p1.setEmail(reader.next());
         
        System.out.print("Registro: ");
        p1.setNumeroRegistro(reader.next());
        
        System.out.print("Quantidade de horas/aula: ");
        p1.setQuantHA(reader.next());
        
        professores.add(p1);
    }
    
    
    public void listarTodos(){
        System.out.println("Lista de contatos dos alunos\n");
        
        System.out.println("**********ALUNOS**********");
        for (Aluno aluno:alunos){
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("Telefone: "+aluno.getTelefone());
            System.out.println("Email: "+aluno.getEmail());
            System.out.println("Número de matrícula: "+aluno.getRa());
        }
    
        System.out.println("**********PROFESSORES**********");
        for (Professor professor:professores){
            System.out.println("Nome: "+professor.getNome());
            System.out.println("Telefone: "+professor.getTelefone());
            System.out.println("Email: "+professor.getEmail());
            System.out.println("Registro: "+professor.getNumeroRegistro());
            System.out.println("Quantidade Hora: "+professor.getQuantHA());
            
            
        }
    }
    
}
