import Pessoa.Cliente;
import Pessoa.ClientePessoaFisica;
import Pessoa.ClientePessoaJuridica;

public class TesteCliente {
    public static void main(String[] args){

        Cliente cli1 = new Cliente("Thiago ","azul","guitarra",229923934,31);
        Cliente cli2 = new Cliente("Gabriel","preto","pedalar",283838484,31);
        cli1.visualizar();
        cli2.visualizar();
        ClientePessoaFisica pf=new ClientePessoaFisica("hiago ","ázul","uitarra",2999393,334,43333333);
        ClientePessoaJuridica cnpj =new ClientePessoaJuridica("hiago ","ázul","uitarra",2999393,334,43333333);

    }




}