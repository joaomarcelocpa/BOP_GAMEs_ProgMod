package ComponentsTest;

import Components.Competicao;
import Components.Ciclista;
import Components.Data;
import Components.Hora;
import Components.Duracao;
import Components.Etapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompeticaoTest {

    @Test
    public void testConstrutor() {
        Competicao competicao = new Competicao(21);
        assertEquals(21, competicao.getNumeroDeEtapas());
    }

    @Test
    public void testSetNumeroDeEtapas() {
        Competicao competicao = new Competicao(21);
        competicao.setNumeroDeEtapas(15);
        assertEquals(15, competicao.getNumeroDeEtapas());
    }

    @Test
    public void testQuemTerminouNaFrenteEntreCiclistaEOutroCiclista() {
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo");
        Ciclista ciclista2 = new Ciclista(2, "Maria", "Rio de Janeiro");

        Hora horaInicial = new Hora(8, 0, 0);
        Data data = new Data(10, 5, 2023);
        Duracao duracao1 = new Duracao(horaInicial, 3600);
        Duracao duracao2 = new Duracao(horaInicial, 4000);

        Etapa etapa1 = new Etapa(1, data, horaInicial, duracao1);
        Etapa etapa2 = new Etapa(1, data, horaInicial, duracao2);

        ciclista1.adicionarEtapa(etapa1);
        ciclista2.adicionarEtapa(etapa2);

        Competicao competicao = new Competicao(21);
        assertEquals(ciclista1, competicao.quemTerminouNaFrenteEntreCiclistaEOutroCiclista(ciclista1, ciclista2));
    }

    @Test
    public void testDiferencaDeTempoDoisCiclistas() {
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo");
        Ciclista ciclista2 = new Ciclista(2, "Maria", "Rio de Janeiro");

        Hora horaInicial = new Hora(8, 0, 0);
        Data data = new Data(10, 5, 2023);
        Duracao duracao1 = new Duracao(horaInicial, 3600);
        Duracao duracao2 = new Duracao(horaInicial, 4000);

        Etapa etapa1 = new Etapa(1, data, horaInicial, duracao1);
        Etapa etapa2 = new Etapa(1, data, horaInicial, duracao2);

        ciclista1.adicionarEtapa(etapa1);
        ciclista2.adicionarEtapa(etapa2);

        Competicao competicao = new Competicao(21);
        assertEquals(400, competicao.diferencaDeTempoDoisCiclistas(ciclista1, ciclista2));
    }
}
