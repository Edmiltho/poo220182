package Classes;

public class Funcionario extends PessoaF{
    int matricula;
    String cargo;
    
    public Funcionario(){}
    
    public Funcionario(String nome, String telefone, String email, String login, String senha, Boolean ativo, String cpf, int matricula, String cargo) {
        super(nome, telefone, email, login, senha, ativo, cpf);
        this.matricula = matricula;
        this.cargo = cargo;
    }
}