import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class JogadorDefesaTest {

    private JogadorDefesa defensor1;
    @BeforeEach
    void setUp() {
        defensor1 = new JogadorDefesa();
        defensor1.setNome("Abreu");
        defensor1.setDataNascimento("01/01/1998");
        defensor1.setNumeroCamisa(3);
        defensor1.setDesarme(90);
        defensor1.setDesarme(99);
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void calculaHabilidade() {
        // cobertura * 6 + desarme * 4 = 396
        assertEquals(396, defensor1.getHabilidade());

        /*
        defensor1.setDesarme(0);
        defensor1.setDesarme(99);
         assertEquals(396, defensor1.getHabilidade());
        */
    }

}