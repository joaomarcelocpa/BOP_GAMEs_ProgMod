package ComponentsTest;

import Components.Data;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataTest {

    @Test
    public void testConstrutor() {
        Data data = new Data(10, 5, 2023);
        assertEquals(10, data.getDia());
        assertEquals(5, data.getMes());
        assertEquals(2023, data.getAno());
    }

    @Test
    public void testGettersESetters() {
        Data data = new Data(1, 1, 2000);
        data.setDia(15);
        data.setMes(8);
        data.setAno(2024);
        assertEquals(15, data.getDia());
        assertEquals(8, data.getMes());
        assertEquals(2024, data.getAno());
    }

    @Test
    public void testToString() {
        Data data = new Data(5, 9, 2024);
        assertEquals("5/9/2024", data.toString());

        Data dataFormatada = new Data(1, 1, 2001);
        assertEquals("1/1/2001", dataFormatada.toString());
    }
}
