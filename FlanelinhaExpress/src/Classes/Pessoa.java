package Classes;

public class Pessoa {
    String nome;
    String telefone;
    String email;
    String login;
    String senha;
    Boolean ativo;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String telefone, String email, String login, String senha, Boolean ativo) {
       this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
    }    
}