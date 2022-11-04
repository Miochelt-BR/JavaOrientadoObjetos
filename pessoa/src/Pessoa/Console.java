package Pessoa;

public class Console extends LojaGame{
     private String mesa;
    public Console(String nome, String gategoria, String pelifericos, String marca, int quantidade,String mesa) {
        super(nome, gategoria, pelifericos, marca, quantidade);


        }

        public String mesa() {
            return mesa;
        }

        public void setMesa(String mesa) {
            this.mesa = mesa;

        }
    }



