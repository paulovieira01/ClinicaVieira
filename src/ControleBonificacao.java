public class ControleBonificacao {

    private double soma;


    public void registra(Gerente gerente){
        double bonificacao = gerente.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public void registra(Recepcionista recepcionista){
        double bonificacao = recepcionista.getBonificacao();
       this.soma = this.soma + bonificacao;
   }


    public double getSoma() {
        return soma;
    }
}



//  METODO GENERICO QUE SERVE PARA TODOS OBJETOS E QUANDO PASSA PELA PORTA ELE REFERENCIA AO METODO CRIADO
//    EM SUA CLASSE ESPECIFICA