package GerenciamentoDeTarefas.ex10.Repository;

import GerenciamentoDeTarefas.ex10.Model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}
