package Classes;

public class Pagamento {
    Double valor;
    String data;
    Boolean status;
    
    public Pagamento(){}
    
    public Pagamento(Double valor, String data, Boolean status) {
        this.valor = valor;
        this.data = data;
        this.status = status;
    }
}