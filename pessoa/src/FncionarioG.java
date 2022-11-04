import Pessoa.Funcionario;

public class FncionarioG extends Funcionario {
    private String gestor;
    public FncionarioG(String nome, String cargo, String area, int id, int carteira) {
        super(nome, cargo, area, id, carteira);
        this.gestor=gestor;


    }

    public int getgestor() {
        return getgestor();
    }

    public void setRg(String gestor) {
        this.gestor = gestor;

    }
    public void visualizar(){
        super.visualizar();
        System.out.println(" novo cargo é "+gestor);
    }
}




