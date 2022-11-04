import Pessoa.Console;
import Pessoa.LojaGame;
import Pessoa.Portatil;

public class TesteGame {
    public static void main(String[] args) {
        LojaGame game1= new LojaGame("diablo","rpg","controle", "ps4",2);

        LojaGame game2= new LojaGame("fifa","futebol,","controle", "ps4",2);
        Console con1 = new Console("fifa","futebol,","controle", "ps4",2,"box");
        Portatil por1 = new Portatil("fifa","futebol,","controle", "ps4",2,"ädvance");


        game1.visualizar();
        game2.visualizar();
        con1.visualizar();
        por1.visualizar();
    }
}
