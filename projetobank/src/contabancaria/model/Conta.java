package contabancaria.model;

public class Conta {
    private int numeroConta;
    private int agencia;
    private int tipoConta;
    private String titular;
    private float saldo;

    public Conta(int numeroConta, int agencia, int tipoConta, String titular, float saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.titular = titular;
        this.saldo = saldo;
    }
// primeiro vem os atributos:
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean sacar(float valor ){
        if (this.getSaldo() < valor){
            System.out.println("saldo in suficiente ");
            return false;


        }
        setSaldo(this.getSaldo()-valor);
        return true;

    }
    public void visualizar() {
        System.out.println("\n**********");
        System.out.println("** Dados da Conta **");
        System.out.println("**********");
        System.out.println("\nNúmero da Conta: " + getNumeroConta());
        System.out.println("\nNúmero da Agência: " + getAgencia());
        System.out.println("\nTipo da Conta: " + getTipoConta());
        System.out.println("\nTitular da Conta: " + getTitular());
        System.out.println("\nSaldo da Conta: " + getSaldo());

    }
}

