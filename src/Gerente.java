public class Gerente extends Funcionario implements Autenticavel {

    private Validacao autenticador;

    public Gerente() {
        this.autenticador = new Validacao();
    }

    public double getBonificacao()
    {
        return super.getSalario();

    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }


}





