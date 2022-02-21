import java.math.BigDecimal;

public abstract class Conta {
    private int agencia;
    private int numeroConta;
    private Cliente cliente;
    private BigDecimal saldoConta = BigDecimal.ZERO;

    public Conta(int agencia, int numeroConta, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public boolean sacarValor(BigDecimal valor) {
        if (this.saldoConta.compareTo(valor) > 0) {
            this.saldoConta = this.saldoConta.subtract(valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente!!!");
            return false;
        }
    }

    public void depositaValor(BigDecimal valor) {
        this.saldoConta = this.saldoConta.add(valor);
    }

    public boolean transfereValor(BigDecimal valor, Conta destino) {
        if (this.sacarValor(valor)) {
            destino.depositaValor(valor);
            return true;
        }
        return false;
    }

    public void investirValor(BigDecimal valor) {
        this.depositaValor(valor);
    }

    public BigDecimal consultarSaldo() {
        BigDecimal saldo = BigDecimal.ZERO;
        return saldo.add(getSaldoConta());

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getSaldoConta() {
        return saldoConta;
    }

}
