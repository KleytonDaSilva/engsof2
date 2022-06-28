public class JogadorAtacante extends Jogador {

    private int velocidade;
    private int tecnica;

    public JogadorAtacante() {
        super("Atacante");
        this.velocidade = 0;
        this.tecnica = 0;
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

    public void setVelocidade(int velocidade) {
        if(Validacao.validaHabilidadeJogador(velocidade)){
            this.velocidade = velocidade;
        }
    }

    public void setTecnica(int tecnica) {
        if(Validacao.validaHabilidadeJogador(tecnica)){
            this.tecnica = tecnica;
        }
    }

    @Override
    public int calculaIdade(String dataNascimento) {
        return super.calculaIdade(dataNascimento);
    }

    @Override
    public String getPosicao() {  return super.getPosicao();  }

    @Override
    public String getNome() {  return super.getNome();  }

    @Override
    public int getNumeroCamisa() {  return super.getNumeroCamisa();  }

    @Override
    public int getHabilidade() {  return (velocidade * 4 + tecnica * 6)/10;  }

    @Override
    public int getGols() {  return super.getGols();  }

    @Override
    public int getIdade() {  return super.getIdade();  }

    @Override
    public String toString() {  return super.toString();  }

}

