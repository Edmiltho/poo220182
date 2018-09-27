package Classes;

public class PessoaF extends Pessoa{
    String cpf;
    
    public PessoaF(){}
    
    public PessoaF(String nome, String telefone, String email, String login, String senha, Boolean ativo, String cpf) {
        super(nome, telefone, email, login, senha, ativo);
        this.cpf = cpf;
    }
}