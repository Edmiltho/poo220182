package Classes;

public class PessoaJ extends Pessoa{
    String cnpj;
    
    public PessoaJ(){}
    
    public PessoaJ(String nome, String telefone, String email, String login, String senha, Boolean ativo, String cnpj) {
        super(nome, telefone, email, login, senha, ativo);
        this.cnpj = cnpj;
    }
}