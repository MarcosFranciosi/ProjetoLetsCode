public class ClientePF  extends Cliente{

    private String cpf;

    public ClientePF(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    @Override
    public String getCpfCnpj() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
