import java.math.BigDecimal;
import java.util.Scanner;

public class Aplicacao {

    ClientePF pf = new ClientePF("Marcos", "Rua Chile", "marcos@email.com", "12345678900");
    ClientePJ pj = new ClientePJ("Marcos F", "Rua Chile - 1593", "marcos2@email.com", "xx.xxx.xxx/0001-xx");

    public static void main(String[] args) {

        Aplicacao aplicação = new Aplicacao();

        /** 1 - Abertura de Contas  **/
        aplicação.AberturaDeCC();
//        aplicação.AberturaCP();
//        aplicação.AberturaInvestimento();

        /** 2 - sacar */
//        aplicação.sacarContaCorrentePf();
//        aplicação.sacarContaCorrentePj();
//        aplicação.sacarContaPoupancaPf();
//        aplicação.sacarContaPoupancaPj();

        /** 3 - Depositar */
//        aplicação.depositar();

        /** 4 - Transferir */
//        aplicação.transferirPf();
//        aplicação.transferirPj();

        /** 5 - Investir */
//        aplicação.investirPf();
//        aplicação.investirPj();

        /** 6 - Consultar Saldo */
//        aplicação.consultarSaldo();
    }


    private void AberturaDeCC() {

        Banco banco = new Banco();
        var contaPf = new ContaCorrente(1234, 101010, pf );
        var contaPj = new ContaCorrente(1234, 202020, pj);
        banco.abrirCC(contaPf);
        banco.abrirCC(contaPj);

    }

    public void AberturaCP() {

        Banco banco = new Banco();
        var contaPf = new ContaPoupanca(1234, 101010, pf );
        var contaPj = new ContaPoupanca(1234, 202020, pj);
        banco.abrirCP(contaPf);
        banco.abrirCP(contaPj);
    }

    public void AberturaInvestimento() {

        Banco banco = new Banco();
        var contaPf = new ContaInvestimento(1234, 101010, pf );
        var contaPj = new ContaInvestimento(1234, 202020, pj);
        banco.abrirInv(contaPf);
        banco.abrirInv(contaPj);
    }

    public void sacarContaCorrentePf() {
        Banco banco = new Banco();
        var contaPf = new ContaCorrente(1234, 101010, pf );
        banco.abrirCC(contaPf);
        System.out.println();
        System.out.println("SACAR VALOR CONTA CORRENTE");
        System.out.println();
        BigDecimal sacar = BigDecimal.ZERO;
        contaPf.depositaValor(BigDecimal.valueOf(200));
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Sacar: ");
        sacar = ler.nextBigDecimal();

        contaPf.sacarValor(sacar);
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
    }

    public void sacarContaCorrentePj() {
        Banco banco = new Banco();
        var contaPj= new ContaCorrente(1234, 101010, pj );
        banco.abrirCC(contaPj);
        System.out.println();
        System.out.println("SACAR VALOR CONTA CORRENTE");
        System.out.println();
        BigDecimal sacar = BigDecimal.ZERO;
        contaPj.depositaValor(BigDecimal.valueOf(200));
        System.out.println("Saldo Atual: " + contaPj.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Sacar: ");
        sacar = ler.nextBigDecimal();

        contaPj.sacarValor(sacar);
        System.out.println("Saldo Atual: " + contaPj.consultarSaldo());
    }

    public void sacarContaPoupancaPf() {
        Banco banco = new Banco();
        var contaPf= new ContaPoupanca(1234, 101010, pf );
        banco.abrirCP(contaPf);
        System.out.println();
        System.out.println("SACAR VALOR POUPANÇA");
        System.out.println();
        BigDecimal sacar = BigDecimal.ZERO;
        contaPf.depositaValor(BigDecimal.valueOf(500));
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Sacar: ");
        sacar = ler.nextBigDecimal();

        contaPf.sacarValor(sacar);
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
    }

    public void sacarContaPoupancaPj() {
        Banco banco = new Banco();
        var contaPj= new ContaPoupanca(1234, 101010, pj );
        banco.abrirCP(contaPj);

    }

    public void depositar() {
        Banco banco = new Banco();
        var contaPf= new ContaCorrente(1234, 101010, pf );
        banco.abrirCC(contaPf);
        System.out.println();
        System.out.println("DEPOSITAR VALOR CONTA CORRENTE");
        System.out.println();
        BigDecimal depositar = BigDecimal.ZERO;
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Depositar: ");
        depositar = ler.nextBigDecimal();

        contaPf.depositaValor(depositar);
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
    }

    public void transferirPf() {
        Banco banco = new Banco();
        var contaPf= new ContaCorrente(1234, 101010, pf );
        var contaPf2= new ContaCorrente(1234, 202020, pf );
        banco.abrirCC(contaPf);
        banco.abrirCC(contaPf2);
        System.out.println();
        System.out.println("TRANSFERI VALOR CONTA CORRENTE");
        System.out.println();
        BigDecimal transferir = BigDecimal.ZERO;
        contaPf.depositaValor(BigDecimal.valueOf(1200));
        System.out.println("Saldo Atual Conta 1: " + contaPf.consultarSaldo());
        System.out.println("Saldo Atual Conta 2: " + contaPf2.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Transferir: ");
        transferir = ler.nextBigDecimal();

        contaPf.transfereValor(transferir, contaPf2);
        System.out.println("Saldo Atual Conta 1: " + contaPf.consultarSaldo());
        System.out.println("Saldo Atual Conta 2: " + contaPf2.consultarSaldo());
    }

    public void transferirPj() {
        Banco banco = new Banco();
        var contaPj= new ContaCorrente(1234, 101010, pj );
        var contaPj2= new ContaCorrente(1234, 202020, pj );
        banco.abrirCC(contaPj);
        banco.abrirCC(contaPj2);
        System.out.println();
        System.out.println("TRANSFERI VALOR CONTA CORRENTE");
        System.out.println();
        BigDecimal transferir = BigDecimal.ZERO;
        contaPj.depositaValor(BigDecimal.valueOf(1200));
        System.out.println("Saldo Atual Conta 1: " + contaPj.consultarSaldo());
        System.out.println("Saldo Atual Conta 2: " + contaPj2.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Transferir: ");
        transferir = ler.nextBigDecimal();

        contaPj.transfereValor(transferir, contaPj2);
        System.out.println("Saldo Atual Conta 1: " + contaPj.consultarSaldo());
        System.out.println("Saldo Atual Conta 2: " + contaPj2.consultarSaldo());
    }

    public void investirPf() {
        Banco banco = new Banco();
        var contaPf= new ContaInvestimento(1234, 101010, pf );
        banco.abrirInv(contaPf);
        System.out.println();
        System.out.println("INVESTIR VALOR CONTA INVESTIMENTO");
        System.out.println();
        BigDecimal investir = BigDecimal.ZERO;
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Investir: ");
        investir = ler.nextBigDecimal();

        contaPf.investirValor(investir);
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());
    }

    public void investirPj() {
        Banco banco = new Banco();
        var contaPj= new ContaInvestimento(1234, 101010, pj );
        banco.abrirInv(contaPj);
        System.out.println();
        System.out.println("INVESTIR VALOR CONTA INVESTIMENTO");
        System.out.println();
        BigDecimal investir = BigDecimal.ZERO;
        System.out.println("Saldo Atual: " + contaPj.consultarSaldo());
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Valor a Investir: ");
        investir = ler.nextBigDecimal();

        contaPj.investirValor(investir);
        System.out.println("Saldo Atual: " + contaPj.consultarSaldo());
    }

    public void consultarSaldo() {
        Banco banco = new Banco();
        var contaPf= new ContaCorrente(1234, 101010, pf );
        banco.abrirCC(contaPf);
        System.out.println();
        contaPf.depositaValor(BigDecimal.valueOf(200));
        System.out.println("Saldo Atual: " + contaPf.consultarSaldo());

    }
}
