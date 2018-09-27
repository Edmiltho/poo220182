package Classes;

public class Endereco {
    String logradouro;
    String cep;
    String bairro;
    String cidade;
    String estado;
    
    public Endereco(){}
    
    public Endereco(String logradouro, String cep, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
