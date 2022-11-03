package Pessoa;

public class Funcionario {
    private String nome, cargo,area;
            private int id, carteira;

    public Funcionario(String nome, String cargo, String area, int id, int carteira) {
        this.nome = nome;
        this.cargo = cargo;
        this.area = area;
        this.id = id;
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarteira() {
        return carteira;
    }

    public void setCarteira(int carteira) {
        this.carteira = carteira;
    }
    public void visualizar() {
        System.out.println("\n**********");
        System.out.println("Thiago TECN");
        System.out.println("****************");
        System.out.println("** Dados pessoais **");
        System.out.println("**********");
        System.out.println("\nnome do funcionario: " + getNome());
        System.out.println("\n qual o cargo " + getCargo());
        System.out.println("\nTipo de area " + getArea());
        System.out.println("\nTitular do id: " + getId());
        System.out.println("\n nomero de carteira  " + getCarteira());

    }
}



