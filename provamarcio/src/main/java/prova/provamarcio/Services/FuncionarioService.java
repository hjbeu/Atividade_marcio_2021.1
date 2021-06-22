package prova.provamarcio.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prova.provamarcio.DTO.FuncionarioDTO;
import prova.provamarcio.models.Funcionario;
import prova.provamarcio.repository.FuncionarioRepository;

@Service

public class FuncionarioService {
    @Autowired
    private FuncionarioRepository fr;  
    
    public Funcionario criar(FuncionarioDTO fdto){
        return fr.save(new Funcionario(0, fdto.getMatricula(), fdto.getNome(), fdto.getEmail(),fdto.getDataDeCadastro()));
    }
    public List<Funcionario> listar(){
        return fr.findAll();
    }
    public List<Funcionario> procuraNome(String nome){
        return fr.findByNomeContainsIgnoreCase(nome);
    }
    public Funcionario atualizar(Long id,FuncionarioDTO fdto){
        Funcionario funcionario = fr.getById(id);
        funcionario.setMatricula(fdto.getMatricula());
        funcionario.setNome(fdto.getNome());
        funcionario.setEmail(fdto.getEmail());
        funcionario.setDataDeCadastro(fdto.getDataDeCadastro());
        return fr.save(funcionario);
    }
    public void delete(Long id){
        fr.deleteById(id);
    }
}
