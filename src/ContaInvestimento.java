import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(int agencia, int numeroConta, Cliente cliente) {
        super(agencia, numeroConta, cliente);
    }

    @Override
    public void investirValor (BigDecimal valor) {
        if ( getCliente() instanceof ClientePJ ) {
            BigDecimal valorADepositar = BigDecimal.ZERO;
            super.depositaValor(valorADepositar = valor.multiply(BigDecimal.valueOf(1.02)));
        } else {
            super.depositaValor(valor);
        }

    }
}
