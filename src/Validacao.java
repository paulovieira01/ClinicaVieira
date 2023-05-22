public class Validacao {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica (int senha){
        if(this.senha == senha){
        return true;
    }else{
        return false;
    }
}
}

// NADA MAIS É DO QUE UMA LÓGICA DA MINHA AUTENTICACAO FORA DA INTERFACE! DA SE O NOME DE CLASSE COMPOSTA
