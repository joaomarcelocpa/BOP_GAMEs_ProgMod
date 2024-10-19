package ComponentsTest;

import Components.Duracao;
import Components.Hora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuracaoTest {

    @Test
    public void testConstrutor() {
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        assertEquals(horaInicial, duracao.getHoraInicial());
        assertEquals(3600, duracao.getDuracaoTotal());
    }

    @Test
    public void testSetHoraInicial() {
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Hora novaHoraInicial = new Hora(9, 0, 0);
        duracao.setHoraInicial(novaHoraInicial);
        assertEquals(novaHoraInicial, duracao.getHoraInicial());
    }

    @Test
    public void testSetDuracaoTotal() {
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        duracao.setDuracaoTotal(7200);
        assertEquals(7200, duracao.getDuracaoTotal());
    }

    @Test
    public void testMaiorQue() {
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao1 = new Duracao(horaInicial, 3600);
        Duracao duracao2 = new Duracao(horaInicial, 1800);
        assertTrue(duracao1.MaiorQue(duracao2));
        assertFalse(duracao2.MaiorQue(duracao1));
    }

    @Test
    public void testDuracaoEmSegundos() {
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        assertEquals(3600, duracao.duracaoEmSegundos());
    }

    @Test
    public void testRelatorio() {
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        String esperado = "Hora Inicial: " + horaInicial.toString() + ", Duracao Total: 3600 segundos";
        assertEquals(esperado, duracao.relatorio());
    }
}
