import Pessoa.Cliente;

public class TesteCliente {
    public static void main(String[] args){

        Cliente cli1 = new Cliente("Thiago ","azul","guitarra",229923934,31);
        Cliente cli2 = new Cliente("Gabriel","preto","pedalar",283838484,31);
        cli1.visualizar();
        cli2.visualizar();

    }




}