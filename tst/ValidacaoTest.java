import org.junit.Test;

import static org.junit.Assert.*;

public class ValidacaoTest {

    @Test
    public void validaHabilidadeJogador() {
        int habilidade = 80;
        Validacao.validaHabilidadeJogador(habilidade);
        assertEquals(true,Validacao.validaHabilidadeJogador(habilidade));

        //habilidade = 101;
        //assertEquals(true,Validacao.validaHabilidadeJogador(habilidade));

        //habilidade = -5;
        //assertEquals(true,Validacao.validaHabilidadeJogador(habilidade));
    }

    @Test
    public void validaAlturaGoleiro(){

        int altura = 160;
        assertEquals(true,Validacao.validaAlturaGoleiro(altura));

        //altura = 220;
        //assertEquals(true,Validacao.validaAlturaGoleiro(altura));

        //altura = -5;
        //assertEquals(true,Validacao.validaAlturaGoleiro(altura));
    }


    @Test
    public void validaDataNascimento() {
        String data = "05/12/2020";
        assertEquals(true, Validacao.validaData(data));

        //data = "32/12/2020";
        //assertEquals(true, Validacao.validaDataNascimento(data));

        //data = "25/13/2020";
        //assertEquals(true, Validacao.validaDataNascimento(data));

        //data = "05/12/1700";
        //assertEquals(true, Validacao.validaDataNascimento(data));

    }

    @Test
    public void validaNome() {
        String nome = "Jhonatan";
        assertEquals(true, Validacao.validaNome(nome));

        //nome = "";
        //assertEquals(true, Validacao.validaNome(nome));
    }

    @Test
    public void validaNumeroCamisa() {
        int numeroCamisa = 10;

        assertEquals(true, Validacao.validaNumeroCamisa(numeroCamisa));

        //numeroCamisa = -1;
        //assertEquals(true, Validacao.validaNumeroCamisa(numeroCamisa));

        //numeroCamisa = 101;
        //assertEquals(true, Validacao.validaNumeroCamisa(numeroCamisa));
    }
}