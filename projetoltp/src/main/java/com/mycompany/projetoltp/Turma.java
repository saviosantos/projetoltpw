package com.mycompany.projetoltp;
// Generated 07/05/2019 11:24:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Turma generated by hbm2java
 */
@Entity
@Table(name="turma"
    ,catalog="projecao"
)
public class Turma  implements java.io.Serializable {


     private Integer idTurma;
     private Disciplina disciplina;
     private Professor professor;
     private Double nota;
     private String idAnoSemestre;
     private String nome;
     private Set<Aluno> alunos = new HashSet<Aluno>(0);

    public Turma() {
    }

	
    public Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
    }
    public Turma(Disciplina disciplina, Professor professor, Double nota, String idAnoSemestre, String nome, Set<Aluno> alunos) {
       this.disciplina = disciplina;
       this.professor = professor;
       this.nota = nota;
       this.idAnoSemestre = idAnoSemestre;
       this.nome = nome;
       this.alunos = alunos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idTurma", unique=true, nullable=false)
    public Integer getIdTurma() {
        return this.idTurma;
    }
    
    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDisciplina", nullable=false)
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idProfessor", nullable=false)
    public Professor getProfessor() {
        return this.professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    
    @Column(name="nota", precision=22, scale=0)
    public Double getNota() {
        return this.nota;
    }
    
    public void setNota(Double nota) {
        this.nota = nota;
    }

    
    @Column(name="id_ano_semestre", length=45)
    public String getIdAnoSemestre() {
        return this.idAnoSemestre;
    }
    
    public void setIdAnoSemestre(String idAnoSemestre) {
        this.idAnoSemestre = idAnoSemestre;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="turmas")
    public Set<Aluno> getAlunos() {
        return this.alunos;
    }
    
    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }




}

