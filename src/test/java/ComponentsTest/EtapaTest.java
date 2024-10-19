package ComponentsTest;

import Components.Etapa;
import Components.Data;
import Components.Hora;
import Components.Duracao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EtapaTest {

    @Test
    public void testConstrutor() {
        Data data = new Data(10, 5, 2023);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Etapa etapa = new Etapa(1, data, horaInicial, duracao);
        assertEquals(1, etapa.getNumeroEtapa());
        assertEquals(data, etapa.getData());
        assertEquals(horaInicial, etapa.getHoraInicial());
        assertEquals(duracao, etapa.getDuracao());
    }

    @Test
    public void testGetTempo() {
        Data data = new Data(10, 5, 2023);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Etapa etapa = new Etapa(1, data, horaInicial, duracao);
        assertEquals(3600, etapa.getTempo());
    }

    @Test
    public void testSetNumeroEtapa() {
        Data data = new Data(10, 5, 2023);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Etapa etapa = new Etapa(1, data, horaInicial, duracao);
        etapa.setNumeroEtapa(2);
        assertEquals(2, etapa.getNumeroEtapa());
    }

    @Test
    public void testSetData() {
        Data data = new Data(10, 5, 2023);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Etapa etapa = new Etapa(1, data, horaInicial, duracao);
        Data novaData = new Data(11, 5, 2023);
        etapa.setData(novaData);
        assertEquals(novaData, etapa.getData());
    }

    @Test
    public void testSetHoraInicial() {
        Data data = new Data(10, 5, 2023);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Etapa etapa = new Etapa(1, data, horaInicial, duracao);
        Hora novaHoraInicial = new Hora(9, 0, 0);
        etapa.setHoraInicial(novaHoraInicial);
        assertEquals(novaHoraInicial, etapa.getHoraInicial());
    }

    @Test
    public void testSetDuracao() {
        Data data = new Data(10, 5, 2023);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 3600);
        Etapa etapa = new Etapa(1, data, horaInicial, duracao);
        Duracao novaDuracao = new Duracao(horaInicial, 7200);
        etapa.setDuracao(novaDuracao);
        assertEquals(novaDuracao, etapa.getDuracao());
    }
}
