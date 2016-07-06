package model;

public class Aluno extends Pessoa  {
    private int matricula;
    private String responsavel;

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    
    public void salvar(Object obj) {
        
    }
    
    
}
