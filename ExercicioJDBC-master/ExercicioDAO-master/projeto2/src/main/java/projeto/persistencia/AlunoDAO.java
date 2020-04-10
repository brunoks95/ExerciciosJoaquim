package projeto.persistencia;

import projeto.entidades.Aluno;
import java.util.List;

public interface AlunoDAO {
    List<Aluno> read();
    List<Aluno> read1();
}
