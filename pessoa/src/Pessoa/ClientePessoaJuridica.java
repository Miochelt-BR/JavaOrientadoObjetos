package Pessoa;

public class ClientePessoaJuridica extends Cliente{
    private int cnpj;
    public ClientePessoaJuridica(String nome, String corFavorita, String robe, float cpf, int idade,int cnpj) {
        super(nome, corFavorita, robe, cpf, idade);
        this.cnpj=cnpj;
    }





    public int getcnpj() {
        return cnpj;
    }

    public void setRg(int cnpj) {
        this.cnpj = cnpj;

    }
    public void visualizar(){
        super.visualizar();
        System.out.println("CNPJ é "+getcnpj());
    }
}

