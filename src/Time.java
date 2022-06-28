import java.util.ArrayList;
import java.util.Comparator;

public class Time implements Comparable<Time> {

    private String nome;
    private ArrayList<Jogador> jogadores;
    private int contadorJogadores;
    private int contGoleiro;
    private int contDefensor;
    private int contAtacante;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontuacao;
    private int gols;
    private int habilidadeTime;

    public Time(String nome) {
        if(Validacao.validaNome(nome)){
            this.nome = nome;
        }
        jogadores = new ArrayList<>();
        this.contadorJogadores= 0;
        this.contGoleiro = 0;
        this.contDefensor = 0;
        this.contAtacante = 0;
        this.pontuacao = 0;
        this.gols = 0;
        this.habilidadeTime = 0;
    }

    public String getNome() { return nome;  }

    public int calculaHabilidade(){
        for(int i = 0 ; i < jogadores.size() ; i++){
            habilidadeTime = habilidadeTime + jogadores.get(i).getHabilidade();
        }
        return habilidadeTime/getQuantidadeJogadores();
    }

    public int getHabilidade(){
        if(habilidadeTime == 0){
            return habilidadeTime = calculaHabilidade();
        }else{
            return habilidadeTime;
        }
    }

    public void mostraJogadores() {
        System.out.println("\n***Mostrando jogadores do time***");
        for (Jogador jogador : jogadores){ //percorre
            System.out.print(jogador);
            System.out.println("");
        }
        System.out.println("\n");
    }


    public void setPontuacao(int points) {
        pontuacao = pontuacao + points;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void somaVitorias() {
        vitorias++;
    }

    public void somaDerrotas() {
        derrotas++;
    }

    public void somaEmpates() {
        empates++;
    }

    public int getGols() {
        return gols;
    }

    public void somaGols(int goals) {
        gols = gols + goals;
    }

    public boolean existeNumeroCamisaRepetida(int numeroCamisa){
        for(int i = 0 ; i < jogadores.size() ; i++){
            if(numeroCamisa == jogadores.get(i).getNumeroCamisa()){
                return true;
            }
        }
        return false;
    }

    public int getQuantidadeJogadores() {
        return contadorJogadores;
    }

    public int getContGoleiro() {
        return contGoleiro;
    }

    public int getContDefensor() {
        return contDefensor;
    }

    public int getContAtacante() {
        return contAtacante;
    }

    public  void insereJogador(Jogador jogador) {
        boolean jogadorValido = false;
        if(!existeNumeroCamisaRepetida(jogador.getNumeroCamisa())) {
            if (contadorJogadores < 5) {
                if (jogador.getPosicao().equals("Goleiro")) {
                    if (contGoleiro == 0) {
                        contGoleiro++;
                        jogadorValido = true;
                    } else {
                        System.out.println("Número de goleiro excedido!");
                    }
                } else if (jogador.getPosicao().equals("Defensor")) {
                    if (contDefensor < 2) {
                        contDefensor++;
                        jogadorValido = true;
                    } else {
                        System.out.println("Número de defensores excedidos!");
                    }
                } else if (jogador.getPosicao().equals("Atacante")) {
                    if (contAtacante < 2) {
                        contAtacante++;
                        jogadorValido = true;
                    } else {
                        System.out.println("Número de atacantes excedidos!");
                    }
                }
                if (jogadorValido) {
                    this.jogadores.add(jogador);
                    System.out.println("Jogador "+ jogador.getPosicao() +  " foi adicionado no time com sucesso!");
                }
                contadorJogadores++;
            } else if (contadorJogadores >= 5) {
                System.out.println("Erro ao adicionar jogador, número máximo de jogadores excedido no time!");
            }
        }else{
            System.out.println("Já existe jogador com mesmo número de camisa!");
        }
    }
    
    public boolean existeJogador(String nome){
        for(int i = 0; i < jogadores.size() ;i++) {
            if (jogadores.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void removerJogador(String nome){
        if(existeJogador(nome)){
            for(int i = 0; i < jogadores.size() ;i++) {
                if (jogadores.get(i).getNome().equals(nome)) {
                    if (jogadores.get(i).getPosicao().equals("Goleiro")) {
                        contGoleiro--;
                    } else if (jogadores.get(i).getPosicao().equals("Defensor")) {
                        contDefensor--;
                    } else {      //atacante
                        contAtacante--;
                    }
                    System.out.println("Removendo o " + jogadores.get(i).getPosicao() + " " + jogadores.get(i).getNome() + " do time...");
                    jogadores.remove(i);
                    contadorJogadores--;
                }
            }
        }else{
            System.out.println("Jogador informado não encontrado!");
        }
    }

    public ArrayList<Jogador> getJogadores(){
        return jogadores;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", vitorias=" + vitorias +
                ", empates=" + empates +
                ", derrotas=" + derrotas +
                ", pontuacao=" + pontuacao +
                '}';
    }

    @Override
    public int compareTo(Time pTime) {
        return (pTime.getHabilidade() - this.habilidadeTime);
    }
}
