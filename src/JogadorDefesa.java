public class JogadorDefesa extends Jogador {

    private int cobertura;
    private int desarme;

    public JogadorDefesa(){
        super("Defensor");
        this.cobertura = 0;
        this.desarme = 0;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        super.setDataNascimento(dataNascimento);
    }

    @Override
    public void setNumeroCamisa(int numeroCamisa) {
        super.setNumeroCamisa(numeroCamisa);
    }

    public void setCobertura(int cobertura) {
        Validacao.validaHabilidadeJogador(cobertura);
        this.cobertura = cobertura;
    }

    public void setDesarme(int desarme) {
        Validacao.validaHabilidadeJogador(desarme);
        this.desarme = desarme;
    }

    @Override
    public int calculaIdade(String dataNascimento) {
        return super.calculaIdade(dataNascimento);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public int getHabilidade() {  return (cobertura * 6 + desarme * 4)/10;  }

    @Override
    public String getPosicao() {
        return super.getPosicao();
    }

    @Override
    public int getNumeroCamisa() {
        return super.getNumeroCamisa();
    }
}
