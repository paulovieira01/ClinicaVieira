public class SistemaInterno {

    private int senha;
    public void valida(Autenticavel gerente){
       boolean autenticou = gerente.autentica(this.senha);
       if (autenticou) {
           System.out.println("Liberado");
       } else {
           System.out.println("Negado");

       }
    }
    public void valida(Validacao clinica) {
        boolean autenticou = clinica.autentica(this.senha);
        if (autenticou) {
            System.out.println("Liberado");
        } else {
            System.out.println("Negado");
        }
    }
}
