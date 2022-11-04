package Pessoa;

public class FuncionarioA extends Funcionario{
    private String ponto;

    public FuncionarioA(String nome, String cargo, String area, int id, int carteira,String ponto) {
        super(nome, cargo, area, id, carteira);
        this.ponto =ponto;


    }

    public String ponto() {
        return ponto;
    }

    public void setRg(String gestor) {
        this.ponto = ponto;

    }
    }

