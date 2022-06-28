import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    private JogadorGoleiro goleiro1;
    private JogadorDefesa defensor1;
    private JogadorDefesa defensor2;
    private JogadorAtacante atacante1;
    private JogadorAtacante atacante2;
    private Time time1;

    @BeforeEach
    void setUp() {
        time1 = new Time("A");

        goleiro1 = new JogadorGoleiro() ;
        goleiro1.setNome("Rafael");
        goleiro1.setDataNascimento("29/07/1999");
        goleiro1.setNumeroCamisa(1);
        goleiro1.setAltura(169);
        goleiro1.setReflexos(90);

        defensor1 = new JogadorDefesa() ;
        defensor1.setNome("Abreu");
        defensor1.setDataNascimento("01/01/1998");
        defensor1.setNumeroCamisa(3);
        defensor1.setDesarme(90);
        defensor1.setDesarme(99);

        defensor2 = new JogadorDefesa();
        defensor2.setNome("João");
        defensor2.setDataNascimento("01/07/1990");
        defensor2.setNumeroCamisa(4);
        defensor2.setDesarme(91);
        defensor2.setDesarme(85);

        atacante1 = new JogadorAtacante();
        atacante1.setNome("José");
        atacante1.setDataNascimento("21/10/2000");
        atacante1.setNumeroCamisa(11);
        atacante1.setTecnica(58);
        atacante1.setVelocidade(87);

        atacante2 = new JogadorAtacante();
        atacante2.setNome("Carlos");
        atacante2.setDataNascimento("28/11/1993");
        atacante2.setNumeroCamisa(10);
        atacante2.setTecnica(93);
        atacante2.setVelocidade(75);

        time1.insereJogador(goleiro1);
        time1.insereJogador(defensor1);
        time1.insereJogador(defensor2);
        time1.insereJogador(atacante1);
        time1.insereJogador(atacante2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testeCadastraJogadores(){

        assertEquals(5, time1.getQuantidadeJogadores());
        assertEquals(1, time1.getContGoleiro());
        assertEquals(2, time1.getContDefensor());
        assertEquals(2, time1.getContAtacante());
    }

    @Test
    void removerJogador() {

        time1.removerJogador("Abreu");      //Jogador defensor

        assertEquals(1, time1.getContDefensor());
        assertEquals(4, time1.getQuantidadeJogadores());
    }

    @Test
    void existeJogador() {

        assertEquals(true, time1.existeJogador("Rafael"));

        //assertEquals(true, time1.existeJogador("Renato"));    //Não existe
    }
    @Test
    void setPontuacao() {
        time1.setPontuacao(0);
        time1.setPontuacao(3);
        assertEquals(3, time1.getPontuacao());
    }

    @Test
    void somaVitorias() {
        time1.somaVitorias();
        assertEquals(1, time1.getVitorias());
    }

    @Test
    void somaDerrotas() {
        time1.somaDerrotas();
        assertEquals(1, time1.getDerrotas());
    }

    @Test
    void somaEmpates() {
        time1.somaEmpates();
        assertEquals(1, time1.getEmpates());
    }

    @Test
    void somaGols() {
        time1.somaGols(10);
        time1.somaGols(2);
        assertEquals(12, time1.getGols());
    }

    @Test
    void existeNumeroCamisaRepetida(){

        time1.insereJogador(goleiro1);
        assertEquals(true, time1.existeNumeroCamisaRepetida(1));

    }


    @Test
    void calculaHabilidadeTime() {

        assertEquals(56, time1.calculaHabilidade());

    }

}