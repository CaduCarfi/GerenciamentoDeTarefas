package GerenciamentoDeTarefas.ex10.Service;

import GerenciamentoDeTarefas.ex10.Model.TarefaModel;
import GerenciamentoDeTarefas.ex10.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<TarefaModel> findAll() {
        return tarefaRepository.findAll();
    }

    public TarefaModel salvar(TarefaModel tarefaModel) {
        return tarefaRepository.save(tarefaModel);
    }

    public void deletar(Long id) {
        tarefaRepository.deleteById(id);
    }

    public Optional<TarefaModel> findById(Long id) {
        return tarefaRepository.findById(id);
    }
}
