import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

public class HelloWorldMockito {

    @Test
    void hello() {
   //Mockito, cria um mock da classe leilão(Uma cópia da classe leilão será criada para que o teste seja feito)
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);

        /*O codigo abaixo, tem como objetivo testar a lógica do código que
         depende de LeilaoDao em um ambiente de teste controlado,
          sem precisar acessar um banco de dados real. Nesse caso,
           o mock foi configurado para que o método "buscarTodos()"
            retorne uma lista vazia de leilões.*/
        List<Leilao> todos = mock.buscarTodos();

        /* A linha de código abaixo é usada para verificar se
         a lista de leilões retornada por um objeto mock está vazia e
         garantir que a lógica de busca esteja funcionando corretamente.*/
        Assert.assertTrue(todos.isEmpty());
    }

}
