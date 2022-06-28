import java.math.BigDecimal;
import java.math.RoundingMode;

public class JogadorGoleiro extends Jogador {

    private int reflexos;
    private int altura;
    private int notaAltura;

    public JogadorGoleiro(){
        super("Goleiro");
        this.altura = 0;
        this.notaAltura = 0;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        super.setDataNascimento(dataNascimento);
        calculaIdade(dataNascimento);
    }

    @Override
    public void setNumeroCamisa(int numeroCamisa) {
        super.setNumeroCamisa(numeroCamisa);
    }

    public void setReflexos(int reflexos) {
        if(Validacao.validaHabilidadeJogador(reflexos)){
            this.reflexos = reflexos;
        }
    }

    public void setAltura(int altura) {
        if(Validacao.validaHabilidadeJogador(altura)){
            this.altura = altura;
            this.notaAltura = calculaNotaAltura(altura);
        }
    }
    private void setNotaAltura(int notaAltura) {
        this.notaAltura = notaAltura;
    }

    public int calculaNotaAltura(int altura){
        BigDecimal calc = new BigDecimal((altura*100/210));
        calc.setScale(0, RoundingMode.HALF_EVEN);
        int notaAltura = calc.intValue();
        setNotaAltura(notaAltura);
        return notaAltura;
    }

    @Override
    public void setGols(int gol) {
        super.setGols(gol);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getGols() {
        return super.getGols();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    public int getNotaAltura() {
        return notaAltura;
    }

    @Override
    public int getHabilidade() {   return (notaAltura * 4 + reflexos * 6)/10;  }

    @Override
    public String getPosicao() {
        return super.getPosicao();
    }

    @Override
    public int getNumeroCamisa() {
        return super.getNumeroCamisa();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}