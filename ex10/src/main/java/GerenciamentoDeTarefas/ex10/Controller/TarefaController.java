package GerenciamentoDeTarefas.ex10.Controller;

import GerenciamentoDeTarefas.ex10.Model.TarefaModel;
import GerenciamentoDeTarefas.ex10.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<TarefaModel> criar(@RequestBody TarefaModel tarefaModel) {
        TarefaModel salvo = tarefaService.salvar(tarefaModel);
        return ResponseEntity.status(201).body(salvo);
    }

    @GetMapping
    public ResponseEntity<List<TarefaModel>> findAll() {
        return ResponseEntity.ok(tarefaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaModel> findById(@PathVariable Long id) {
        return tarefaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        tarefaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
