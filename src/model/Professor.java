
package model;

public class Professor extends Funcionario {
    
    private String disciplina;
    private String turno;

    public Professor() {
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + ", turno=" + turno + "matricula= "+super.getMatricula()+'}';
    }
    
    

    
}
