import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CampeonatoRepositorioTest {

    private Time time1;
    private Time time2;
    private Partida partida1;
    private Partida partida2;

    @Before
    public void setUp() throws Exception {
        time1 = new Time("A");
        time2 = new Time("B");

        LocalDate dataPartida1 = LocalDate.of(2015, 5, 1);
        partida1 = new Partida(dataPartida1,time1, time2);

        LocalDate dataPartida2 = LocalDate.of(2015, 5, 2);
        partida1 = new Partida(dataPartida2, time2, time1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insereTime() {
        CampeonatoRepositorio.insereTime(time1);
        assertEquals(1 , CampeonatoRepositorio.qtdePartidasCampeonato());
    }

    @Test
    public void inserePartida() {
        CampeonatoRepositorio.inserePartida(partida1);
        assertEquals(1, CampeonatoRepositorio.qtdePartidasCampeonato());
    }

}


