import java.text.SimpleDateFormat;
import java.util.Date;

public class Validacao {

    public static boolean validaHabilidadeJogador(int habilidade) {
        try {
           if(habilidade >= 0 && habilidade <=100){
               return true;
           }
        } catch (Exception e) {
            throw new IllegalArgumentException("Habilidade fora do padrao (0-100): " + habilidade);
        }

        return false;
    }

    public static boolean validaAlturaGoleiro(int altura) {
        try {
            if(altura > 0 && altura <=210){
                return true;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Altura fora do padrao (1-210): " + altura);
        }

        return false;
    }

    public static boolean validaData(String dataNascimento){
        Date data = null;
        String dataTexto = dataNascimento;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            format.setLenient(false);
            data = format.parse(dataTexto);

        } catch (Exception e) {
            throw new IllegalArgumentException("Data de nascimento deve ser no padrão \"dd/MM/yyyy\" + " + dataNascimento);
        }
        return true;
    }

    public static boolean validaNome(String nome) {
       if(!nome.equals("")){
           return true;
        }else{
            throw new IllegalArgumentException("Nome informado é vazio!" + nome);
        }
    }

    public static boolean validaNumeroCamisa(int numeroCamisa){
        if(numeroCamisa >=1 && numeroCamisa <100){
            return true;
        }else{
            throw new IllegalArgumentException("Número da camisa está fora do intervalo (1-99): " + numeroCamisa);
        }

    }


    /*
    public static void validaJogadoresParaPartida(Time time){
        if(time.getQuantidadeJogadores() < 5){
            System.out.println("Partida não liberada, pois o Time "+ time.getNome() + " possui menos de 5 jogadores!");
            System.exit(0);
        }
    }
     */

}