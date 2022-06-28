import java.util.ArrayList;

public abstract class CampeonatoRepositorio {

    private static ArrayList<Time> times = new ArrayList<>();
    private static ArrayList<Partida> partidas = new ArrayList<>();

    public static void insereTime(Time time) {
        times.add(time);
    }

    public static void inserePartida(Partida partida){ partidas.add(partida); }

    public static int qtdePartidasCampeonato(){ return partidas.size(); }

    public static int qtdeTimesCampeonato(){
        return times.size();
    }

    public static void mostraTimesCadastrados(){
        System.out.println("Mostrando times cadastrados no campeonato...");
        for(Time time:times){
            System.out.println(time.toString());
        }
    }

    public static void mostraTabela() {
        System.out.println("\n***Mostrando a tabela do Campeonato***");
        //Collections.sort(times);
        for (int i = 0; i < times.size(); i++) {
            System.out.print("Time: " + times.get(i).getNome() + " | ");
            System.out.print("Pontuação: " + times.get(i).getPontuacao() + " | ");
            System.out.print("Vitorias: " + times.get(i).getVitorias() + " | ");
            System.out.print("Empates: " + times.get(i).getEmpates() + " | ");
            System.out.print("Derrotas: " + times.get(i).getDerrotas() + " | ");
            System.out.print("Gols: " + times.get(i).getGols() + " | ");
            System.out.print("Habilidade: "+ times.get(i).getHabilidade());
            System.out.println("");
        }
    }
}
