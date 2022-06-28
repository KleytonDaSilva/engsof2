import java.time.LocalDate;
import java.util.Random;

public class Partida {

    private LocalDate data;
    private Time timeCasa;
    private Time timeVisitante;
    private int golsTimeCasa;
    private int golsTimeVisitante;
    private String golsJogadoresTimeCasa = "Gols time Casa: ";
    private String golsJogadoresTimeVisitante = "Gols time Visitante: " ;

    public Partida(LocalDate data, Time timeCasa, Time timeVisitante) {
        //Validacao.validaJogadoresParaPartida(timeCasa);
        //Validacao.validaJogadoresParaPartida(timeVisitante);
        this.data = data;
        this. timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsTimeCasa = 0;
        this.golsTimeVisitante = 0;
    }

    private void golTimeCasa() {
        Random geraGolsCasa = new Random();
        golsTimeCasa = geraGolsCasa.nextInt(10);       //número de gols - 0 a 10
        timeCasa.somaGols(golsTimeCasa);
    }

    private void golTimeVisitante() {
        Random geraGolsVisitante = new Random();
        golsTimeVisitante = geraGolsVisitante.nextInt(10);       //número de gols - 0 a 10
        timeVisitante.somaGols(golsTimeVisitante);
    }

    public void geraPlacarPartida(){
        golTimeCasa();
        golTimeVisitante();
        geraGolsJogadoresTimeCasa();
        geraGolsJogadoresTimeVisitante();
        resultadoPartida();
    }

    private void resultadoPartida(){
        if(golsTimeCasa > golsTimeVisitante){
            timeCasa.somaVitorias();
            timeCasa.setPontuacao(3);
            timeVisitante.somaDerrotas();
        }else if(golsTimeCasa < golsTimeVisitante){
            timeVisitante.somaVitorias();
            timeVisitante.setPontuacao(3);
            timeCasa.somaDerrotas();
        }else{ //EMPATE
            timeCasa.somaEmpates();
            timeCasa.setPontuacao(1);
            timeVisitante.somaEmpates();
            timeVisitante.setPontuacao(1);
        }
    }

    private void geraGolsJogadoresTimeCasa(){

        int quantidadeGolsTimeCasa = golsTimeCasa;
        int quantidadeGolsJogador = 0;
        int indiceJogadorEscolhido = 0;
        while(quantidadeGolsTimeCasa > 0){
            Random escolheJogadorAleatorioTime = new Random();

            indiceJogadorEscolhido = escolheJogadorAleatorioTime.nextInt(timeCasa.getQuantidadeJogadores());

            Random geraGolsJogadores = new Random();

            quantidadeGolsJogador = 1 + geraGolsJogadores.nextInt(quantidadeGolsTimeCasa);

            timeCasa.getJogadores().get(indiceJogadorEscolhido).setGols(quantidadeGolsJogador);

            quantidadeGolsTimeCasa = quantidadeGolsTimeCasa - quantidadeGolsJogador;

            golsJogadoresTimeCasa = golsJogadoresTimeCasa.concat( timeCasa.getJogadores().get(indiceJogadorEscolhido).getNome() + " Fez " +
                    quantidadeGolsJogador + " | ");
        }
    }


    private void geraGolsJogadoresTimeVisitante(){

        int quantidadeGolsTimeVisitante = golsTimeVisitante;
        int quantidadeGolsJogador = 0;
        int indiceJogadorEscolhido = 0;
        //gera os gols dos jogadores do time da casa
        while(quantidadeGolsTimeVisitante > 0){
            Random escolheJogadorAleatorioTime = new Random();

            indiceJogadorEscolhido = escolheJogadorAleatorioTime.nextInt(timeVisitante.getQuantidadeJogadores());

            Random geraGolsJogadores = new Random();

            quantidadeGolsJogador = 1 + geraGolsJogadores.nextInt(quantidadeGolsTimeVisitante);

            timeVisitante.getJogadores().get(indiceJogadorEscolhido).setGols(quantidadeGolsJogador);

            quantidadeGolsTimeVisitante = quantidadeGolsTimeVisitante - quantidadeGolsJogador;

            golsJogadoresTimeVisitante = golsJogadoresTimeVisitante.concat( timeVisitante.getJogadores().get(indiceJogadorEscolhido).getNome() + " Fez " +
                    quantidadeGolsJogador + " | ");
        }

    }

    public String getGolsJogadoresTimeCasa() {
        return golsJogadoresTimeCasa;
    }

    public String getGolsJogadoresTimeVisitante() {
        return golsJogadoresTimeVisitante;
    }

    public String getPlacar() {
        return "\nTime Casa : " + timeCasa.getNome() + " |" + golsTimeCasa +
                " x " + golsTimeVisitante + "| " + "Time Visitante : " + timeVisitante.getNome()
                + "\n" + golsJogadoresTimeCasa + "\n" + golsJogadoresTimeVisitante;

    }



}
