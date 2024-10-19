package ComponentsTest;

import Components.Ciclista;
import Components.Etapa;
import Components.Data;
import Components.Hora;
import Components.Duracao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CiclistaTest {

    @Test
    public void testConstrutor() {
        Ciclista ciclista = new Ciclista(1, "João", "São Paulo");
        assertEquals(1, ciclista.getNumero());
        assertEquals("João", ciclista.getNome());
        assertEquals("São Paulo", ciclista.getCidadeDeOrigem());
        assertTrue(ciclista.getEtapas().isEmpty());
    }

    @Test
    public void testAdicionarEtapa() {
        Ciclista ciclista = new Ciclista(1, "João", "São Paulo");
        Etapa etapa = new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100));
        ciclista.adicionarEtapa(etapa);
        assertEquals(1, ciclista.getEtapas().size());
        assertEquals(etapa, ciclista.getEtapas().get(0));
    }

    @Test
    public void testAdicionarEtapaLimite() {
        Ciclista ciclista = new Ciclista(1, "João", "São Paulo");
        for (int i = 0; i < 21; i++) {
            ciclista.adicionarEtapa(new Etapa(i, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        }
        assertThrows(IllegalArgumentException.class, () -> ciclista.adicionarEtapa(new Etapa(22, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100))));
    }

    @Test
    public void testGetTempoTotal() {
        Ciclista ciclista = new Ciclista(1, "João", "São Paulo");
        ciclista.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        ciclista.adicionarEtapa(new Etapa(2, new Data(11, 5, 2023), new Hora(9, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        assertEquals(200, ciclista.getTempoTotal());
    }

    @Test
    public void testCompararCiclistas() {
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo");
        Ciclista ciclista2 = new Ciclista(2, "Maria", "Rio de Janeiro");
        ciclista1.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        ciclista2.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        assertTrue(ciclista1.compararCiclistas(ciclista2) == 0);
        assertTrue(ciclista2.compararCiclistas(ciclista1) == 0);
    }

    @Test
    public void testCompararEtapa() {
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo");
        Ciclista ciclista2 = new Ciclista(2, "Maria", "Rio de Janeiro");
        ciclista1.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        ciclista2.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        assertEquals(0, ciclista1.compararEtapa(0, ciclista2));
    }

    @Test
    public void testDiferencaTempo() {
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo");
        Ciclista ciclista2 = new Ciclista(2, "Maria", "Rio de Janeiro");
        ciclista1.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        ciclista2.adicionarEtapa(new Etapa(1, new Data(10, 5, 2023), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 100)));
        assertEquals(0, ciclista1.diferencaTempo(ciclista2));
    }
}
