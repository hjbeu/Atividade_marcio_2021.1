package prova.provamarcio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")

public class Funcionario {//POJO
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String matricula;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String dataDeCadastro;
    
    public Funcionario(){

    }
    public Funcionario(long id, String matricula, String nome, String email, String dataDeCadastro){
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.dataDeCadastro = dataDeCadastro;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataDeCadastro() {
        return dataDeCadastro;
    }
    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id +", nome= "+ nome + "matricula= " + matricula +  "email= " + email+", Data de Cadastro= " + dataDeCadastro+"]";
    }
}
