import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JogadorAtacanteTest {

    private JogadorAtacante atacante1;
    @BeforeEach
    void setUp() {
        atacante1 = new JogadorAtacante();
        atacante1.setNome("José");
        atacante1.setDataNascimento("21/10/2000");
        atacante1.setNumeroCamisa(11);
        atacante1.setTecnica(58);
        atacante1.setVelocidade(87);
    }

    @AfterEach
    void tearDown() {  }

    @Test
    public void calculaHabilidade() {

        // velocidade * 4 + tecnica * 6 = 696
        assertEquals(696, atacante1.getHabilidade());

        /*
        atacante1.setTecnica(58);
        atacante1.setVelocidade(-19);
        assertEquals(696, atacante1.getHabilidade());
        */
    }
}
