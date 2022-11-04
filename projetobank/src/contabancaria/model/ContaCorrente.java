package contabancaria.model;

public class ContaCorrente extends Conta{// primeiro criar a extends = extencao do principal class para sub class ,criar //
    //criar atributo e a inclusao com metodo construtor
    private float limite;


    public ContaCorrente(int numeroConta, int agencia, int tipoConta, String titular, float saldo ,float limite) {
        super(numeroConta, agencia, tipoConta, titular, saldo);

        this.limite=limite;

    }
    // fazer metodos get e set

    public float getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    public void depositar(float valor){
        setSaldo(getSaldo()+valor);

    }
    public boolean sacar(float valor ){
        if (getSaldo()+getLimite() < valor){
            System.out.println("saldo in suficiente ");
            return false;


        }
        setSaldo(this.getSaldo()-valor);
        return true;

    }
    public void visualizar(){

        super.visualizar();
        System.out.println("limite de credito "+getLimite());
    }
}
