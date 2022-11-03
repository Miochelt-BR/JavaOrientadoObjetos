package Pessoa;

public class LojaGame {

    private String nome ,gategoria , pelifericos , marca;
    private int quantidade;

    public LojaGame(String nome, String gategoria, String pelifericos, String marca, int quantidade) {
        this.nome = nome;
        this.gategoria = gategoria;
        this.pelifericos = pelifericos;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGategoria() {
        return gategoria;
    }

    public void setGategoria(String gategoria) {
        this.gategoria = gategoria;
    }

    public String getPelifericos() {
        return pelifericos;
    }

    public void setPelifericos(String pelifericos) {
        this.pelifericos = pelifericos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void visualizar() {
        System.out.println("\n**********");
        System.out.println("Thiago TECN Games ");
        System.out.println("****************");
        System.out.println("** Dados pessoais **");
        System.out.println("**********");
        System.out.println("\nnome do JOGO: " + getNome());
        System.out.println("\n qual o cargo " + getMarca());
        System.out.println("\nTipo de area " + getPelifericos());
        System.out.println("\nTitular do id: " + getQuantidade());
        System.out.println("\n nomero de carteira  " + getGategoria());

    }
}

