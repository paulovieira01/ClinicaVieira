public abstract interface Autenticavel {

    public abstract void setSenha(int senha) ;
    public abstract boolean autentica(int senha);




}
//UMA INTERFACE NÃO PODE TER NADA DE CONCRETO, TUDO DEVE SER ABSTRATO
//DEFINICAÇÃO DE UM CONTRATO CHAMADO DE AUTENTICAVEL E QUEM ASSINA (OBRIGAÇÕES) PRECISA IMPLEMENTAR O METODO
// SET SENHA E AUTENTICA ex