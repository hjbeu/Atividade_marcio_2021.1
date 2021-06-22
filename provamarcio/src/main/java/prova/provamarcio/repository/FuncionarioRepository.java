package prova.provamarcio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import prova.provamarcio.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByNomeContainsIgnoreCase(String nome);

}
