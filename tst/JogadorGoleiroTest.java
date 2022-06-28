import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class JogadorGoleiroTest {

    private JogadorGoleiro goleiro1;

    @BeforeEach
    void setUp() {
        goleiro1 = new JogadorGoleiro();
        goleiro1.setNome("Diego");
        goleiro1.setDataNascimento("09/12/2000");
        goleiro1.setNumeroCamisa(1);
        goleiro1.setAltura(175);
        goleiro1.setReflexos(89);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void calculaNotaAltura() {

        int altura = 105;
        goleiro1.setAltura(altura);
        assertEquals(50, goleiro1.calculaNotaAltura(altura));

        //int altura = -5;
        //assertEquals(90, goleiro1.calculaNotaAltura(altura));
    }

    @Test
    public void calculaHabilidade() {
        goleiro1.setAltura(180);
        goleiro1.setReflexos(89);

        // nota altura * 4 + reflexos * 6 = 53
        assertEquals(53, goleiro1.getHabilidade());

        /*
         goleiro1.setAltura(0);
        goleiro1.setReflexos(89);

        // nota altura * 4 + reflexos * 6 = 534
        assertEquals(534, goleiro1.getHabilidade());
        */
    }

}