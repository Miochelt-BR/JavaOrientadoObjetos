package Pessoa;

public class Portatil extends LojaGame{
    private String Portatil;
    private String portatil;

    public Portatil(String nome, String gategoria, String pelifericos, String marca, int quantidade, String Portatil) {
        super(nome, gategoria, pelifericos, marca, quantidade);
    }

    public String Portatil() {
        return Portatil;
    }

    public void setPortatil(String portatil) {
        this.portatil =  portatil;
    }
}
