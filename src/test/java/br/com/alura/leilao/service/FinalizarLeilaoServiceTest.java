package br.com.alura.leilao.service;

import br.com.alura.leilao.dao.LeilaoDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class FinalizarLeilaoServiceTest {

    private FinalizarLeilaoService service;

    @Mock
    private LeilaoDao leilaoDao;

    @BeforeEach
    public  void beforeEach() {
        MockitoAnnotations.initMocks(this);
        this.service = new FinalizarLeilaoService(leilaoDao);
    }
    @Test
    void deveriaFinalizarUmLeilao() {

       /* Essa simulação abaixo permite que você crie um objeto que se comporte
        de uma determinada maneira, sem precisar realmente
         implementar todos os métodos da classe original */
        LeilaoDao dao = Mockito.mock(LeilaoDao.class);

        /* abaixo temosuma instância do objeto FinalizarLeilaoService,
         passando o objeto simulado LeilaoDao como parâmetro.
          Essa é a classe que será testada e agora ela tem
          acesso ao objeto simulado LeilaoDao.*/
        service = new FinalizarLeilaoService(dao);
    }
}