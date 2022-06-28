import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Jogador {
    private String nome;
    private String dataNascimento;
    private int idade;
    private String posicao;
    private int habilidade;
    private int gols;
    private int numeroCamisa;

    public Jogador(String posicao) {
        this.posicao = posicao;
        this.idade = 0;
        this.habilidade = 0;
        this.gols = 0;
        this.numeroCamisa = 0;
    }

    public void setNome(String nome) {
       if(Validacao.validaNome(nome)) {
           this.nome = nome;
       }
    }

    public void setDataNascimento(String dataNascimento) {
        if(Validacao.validaData(dataNascimento)){
            this.dataNascimento = dataNascimento;
        }
        this.idade = calculaIdade(dataNascimento);
    }

    public void setNumeroCamisa(int numeroCamisa) {
        if(Validacao.validaNumeroCamisa(numeroCamisa)){
            this.numeroCamisa = numeroCamisa;
        }
    }

    public int calculaIdade(String dataNascimento){
        Integer dia = Integer.parseInt(dataNascimento.substring(0,2));
        Integer mes = Integer.parseInt(dataNascimento.substring(3,5));
        Integer ano = Integer.parseInt(dataNascimento.substring(6,10));

        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);

        idade = anoAtual - ano;
        if (dia >= diaAtual && mes >= mesAtual)
        {
            idade--;
        }
        return idade;
    }

    public String getNome() { return nome; }

    public String getPosicao() { return posicao;  }

    public int getNumeroCamisa() { return numeroCamisa; }

    public int getHabilidade( ) {
        return habilidade;
    }

    public int getGols() {   return gols; }

    public int getIdade() {
        return idade;
    }

    public void setGols(int gol) {  gols = gols + gol;  }

    @Override
    public String toString() {
        return "Jogador{" +
                "posição='" + getPosicao() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", numeroCamisa=" + getNumeroCamisa() +
                ", habilidade=" + getHabilidade() +
                ", gols=" + getGols() +
                ", idade=" + getIdade() +
                '}';
    }

}

