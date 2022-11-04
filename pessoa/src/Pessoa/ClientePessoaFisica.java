package Pessoa;

public class ClientePessoaFisica extends Cliente{
    private int rg;
    public ClientePessoaFisica(String nome, String corFavorita, String robe, float cpf, int idade,int rg) {
        super(nome, corFavorita, robe, cpf, idade);

        this.rg=rg;


    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;

    }
    public void visualizar(){
        super.visualizar();
        System.out.println("RG é "+getRg());
    }
}
