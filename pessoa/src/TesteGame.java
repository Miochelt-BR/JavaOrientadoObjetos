import Pessoa.LojaGame;

public class TesteGame {
    public static void main(String[] args) {
        LojaGame game1= new LojaGame("diablo","rpg","controle", "ps4",2);

        LojaGame game2= new LojaGame("fifa","futebol,","controle", "ps4",2);
        game1.visualizar();
        game2.visualizar();
    }
}
