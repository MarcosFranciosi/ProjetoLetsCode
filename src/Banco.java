import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void abrirCC(Conta conta) {
        if (conta.getCliente() instanceof ClientePF) {
            this.contas.add(conta);
            System.out.println("ContaCorrente PF Aberta com Sucesso!");
        } else if (conta.getCliente() instanceof ClientePJ) {
            this.contas.add(conta);
            System.out.println("ContaCorrente PJ Aberta com Sucesso!");
        }
    }

    public void abrirCP(Conta conta) {
        if (conta.getCliente() instanceof ClientePF) {
            this.contas.add(conta);
            System.out.println("ContaPoupança PF Aberta com Sucesso!");
        } else if (conta.getCliente() instanceof ClientePJ) {
            System.out.println("Está Conta não pode ser aberta para Pessoa Juridica!");
        }
    }

    public void abrirInv(Conta conta) {
        if (conta.getCliente() instanceof ClientePF) {
            this.contas.add(conta);
            System.out.println("ContaInvestimento PF Aberta com Sucesso!");
        } else if (conta.getCliente() instanceof ClientePJ) {
            this.contas.add(conta);
            System.out.println("ContaInvestimento PJ Aberta com Sucesso!");
        }
    }

}
