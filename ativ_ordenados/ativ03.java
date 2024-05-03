import java.util.Map;
import java.util.TreeMap;
 
public class Mapas {
 
    public static void main(String[] args) {
        
        /* 1 - Cria o mapa */
        Map<Integer, Aluno> turma = new TreeMap<>();
 
        /* 2 - Insira 5 alunos na turma */
        turma.put(1001, new Aluno(1001, "Maria Silva", "Banco de dados", 9.5));
        turma.put(2002, new Aluno(2002, "Joao Santos", "Linguagem programacao 1", 8.0));
        turma.put(3003, new Aluno(3003, "Ana Oliveira", "Linguagem programacao 2", 7.5));
        turma.put(4004, new Aluno(4004, "Pedro Souza", "Desenvolvimento de software", 6.0));
        turma.put(5005, new Aluno(5005, "Julia Costa", "Algoritmos de programacao", 8.5));
        
        /* 3 - Liste os alunos cadastrados */
        mostrarTurma(turma);
        
        /* 4 - Altere a nota de um aluno */
        turma.get(3003).setNota(9.5);
       
        /* 5 - Exclua um aluno */ 
        turma.remove(4004);
        
        /* 6 - Esvazie o mapa */
        turma.clear();
    }
 
    public static void mostrarTurma(Map<Integer, Aluno> turma){
        System.out.println("Alunos cadastrados:\n");
        if(turma.isEmpty()){
            System.out.println("Nao existem alunos cadastrados.");
        }
        else{
            for (Map.Entry<Integer, Aluno> aluno : turma.entrySet()) {
                aluno.getValue().mostrarAlunos();
                System.out.println();
            }
        }
    }
}
 
class Aluno {
    private int matricula;
    private String nome;
    private String disciplina;
    private double nota;
 
    public Aluno(int matricula, String nome, String disciplina, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
    }
 
    public int getMatricula() {
        return matricula;
    }
 
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
 
    public String getDisciplina() {
        return disciplina;
    }
 
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
 
    public double getNota() {
        return nota;
    }
 
    public void setNota(double nota) {
        this.nota = nota;
    }
 
    public void mostrarAlunos(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Nota: " + this.nota);
    }
}