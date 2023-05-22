public class Clinica implements Autenticavel {
    private String nome;
    private String endereco;

    private double saldo;

    private Turno turno;


    private Validacao autenticador;

    public Clinica() {
        this.autenticador = new Validacao();
    }

    public Clinica(String nome, String endereco, Turno turno) {
        this.nome = nome;
        this.endereco = endereco;
        this.turno = turno;
    }

    public enum turno{
        DIURNO("diurno"),
        NOTURNO("noturno");
        private String descricao;
        turno(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
    void paga(double valor) {
        this.saldo = this.saldo + valor;
    }
    public boolean recebe(double valor) {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
