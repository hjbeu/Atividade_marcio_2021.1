package prova.provamarcio.DTO;

public class FuncionarioDTO {//POJO
    private long id;
    private String matricula;
    private String nome;
    private String email;
    private String dataDeCadastro;
    
    public FuncionarioDTO(){

    }
    public FuncionarioDTO(long id, String matricula, String nome, String email, String dataDeCadastro){
        super();
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
