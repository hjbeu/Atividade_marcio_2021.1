package prova.provamarcio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import prova.provamarcio.DTO.FuncionarioDTO;
import prova.provamarcio.Services.FuncionarioService;
import prova.provamarcio.models.Funcionario;

@RestController

public class FuncionarioController {
    @Autowired
    private FuncionarioService fs;

    @GetMapping("/funcionarios")
    public ResponseEntity imprimirFuncionarios() {
        try {
            return ResponseEntity.status(201).body(fs.listar());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(404).body("Não foi possivel localizar!");
        }
    }

    @GetMapping("/funcionarios/{nome}")
    public ResponseEntity imprimirFun(@PathVariable("nome") String nome) {
        try {
            return ResponseEntity.status(200).body(fs.procuraNome(nome));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Erro ao procurar o nome " + nome);
        }
    }

    @PostMapping("/funcionarios")
    public ResponseEntity enviarFuncionario(@RequestBody FuncionarioDTO funcionario) {
        try {
            Funcionario f = fs.criar(funcionario);
            System.out.println("O funcionario enviado foi: " + funcionario.toString());
            return ResponseEntity.ok(f);
        } catch (Exception e) {
            return ResponseEntity.status(404).body("O funcionario não foi encontrado");
        }
    }

    @PutMapping("/funcionarios/{id}")
    public ResponseEntity atualizarFuncionario(@PathVariable("id") Long id,
            @RequestBody FuncionarioDTO funcionario) {
        try {
            Funcionario f = fs.atualizar(id, funcionario);
            System.out.println("O funcionario atualizado foi: " + funcionario.toString());
            return ResponseEntity.status(200).body(f);
        } catch (Exception e) {
            return ResponseEntity.status(404).body("O funcionario não foi encontrado");
        }
    }

    @DeleteMapping("/funcionarios/{id}")
    public ResponseEntity<String> deleteFuncionario(@PathVariable("id") Long id) {
        try {
            fs.delete(id);
            System.out.println("O funcionario foi removido");
            return ResponseEntity.status(200).body("O funcionario foi removido");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("O funcionario não foi encontrado");
        }
    }

}
