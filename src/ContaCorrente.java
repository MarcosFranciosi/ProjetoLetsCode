import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroConta, Cliente cliente) {
        super(agencia, numeroConta, cliente);
    }

    @Override
    public boolean sacarValor(BigDecimal valor) {
        if ( getCliente() instanceof ClientePJ ) {
           BigDecimal valorASacar = BigDecimal.ZERO;
           return super.sacarValor(valorASacar = valor.multiply(BigDecimal.valueOf(1.005)));
        }
        return super.sacarValor(valor);
    }

}
