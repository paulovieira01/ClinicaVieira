public class Paciente implements Autenticavel {
    private String nome;
    private String cpf;
    private double saldo;
    private String procedimento;

    private Validacao autenticador;

    public Paciente(String nome, String cpf, double saldo, String procedimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.procedimento = procedimento;
    }

    public Paciente() {
        this.autenticador = new Validacao();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha){
       return this.autenticador.autentica(senha);
    }

    public Paciente(String nome, String cpf, String procedimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.procedimento = procedimento;

    }
    void paga(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean usa(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
