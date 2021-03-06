package com.mycompany.projetoltp;
// Generated 07/05/2019 11:24:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Professor generated by hbm2java
 */
@Entity
@Table(name="professor"
    ,catalog="projecao"
)
public class Professor  implements java.io.Serializable {


     private int idProfessor;
     private Pessoa pessoa;
     private Double salario;
     private Set<Turma> turmas = new HashSet<Turma>(0);

    public Professor() {
    }

	
    public Professor(int idProfessor, Pessoa pessoa) {
        this.idProfessor = idProfessor;
        this.pessoa = pessoa;
    }
    public Professor(int idProfessor, Pessoa pessoa, Double salario, Set<Turma> turmas) {
       this.idProfessor = idProfessor;
       this.pessoa = pessoa;
       this.salario = salario;
       this.turmas = turmas;
    }
   
     @Id 

    
    @Column(name="idProfessor", unique=true, nullable=false)
    public int getIdProfessor() {
        return this.idProfessor;
    }
    
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPessoa", nullable=false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    @Column(name="salario", precision=22, scale=0)
    public Double getSalario() {
        return this.salario;
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="professor")
    public Set<Turma> getTurmas() {
        return this.turmas;
    }
    
    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }




}


