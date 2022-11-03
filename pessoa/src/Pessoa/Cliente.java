package Pessoa;

public class Cliente {

        private String nome , corFavorita, robe;
        private float cpf;
        private int idade;

    public Cliente(String nome, String corFavorita, String robe, float cpf, int idade) {
        this.nome = nome;
        this.corFavorita = corFavorita;
        this.robe = robe;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }



    public String getRobe() {
        return robe;
    }

    public void setRobe(String robe) {
        this.robe = robe;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void visualizar() {
        System.out.println("\n**********");
        System.out.println("Thiago TECN");
        System.out.println("****************");
        System.out.println("** Dados pessoais **");
        System.out.println("**********");
        System.out.println("\nnome do cliente: " + getNome());
        System.out.println("\ncor favorita: " + getCorFavorita());
        System.out.println("\nTipo de robe " + getRobe());
        System.out.println("\nTitular do cpf : " + getCpf());
        System.out.println("\nsua idade  " + getIdade());

    }
}

