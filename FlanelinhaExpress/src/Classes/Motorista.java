package Classes;

public class Motorista extends PessoaF{
    String cnh;
    String cartaoCredito;
    int codSeguranca;
    String titular;
    String validade;
    Boolean adimplente;
    
    public Motorista(){}
    
    public Motorista(String nome, String telefone, String email, String login, String senha, Boolean ativo, String cpf, String cnh, String cartaoCredito, int codSeguranca, String titular, String validade, Boolean adimplente){
        super(nome, telefone, email, login, senha, ativo, cpf);
        this.cnh = cnh;
        this.cartaoCredito = cartaoCredito;
        this.codSeguranca = codSeguranca;
        this.titular = titular;
        this.validade = validade;
        this.adimplente = adimplente;
    }
}