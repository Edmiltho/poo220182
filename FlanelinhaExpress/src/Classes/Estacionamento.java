package Classes;

public class Estacionamento {
    String nome;
    int qntVagas;
    Double valorHora;
    
    public Estacionamento(){}
    
    public Estacionamento(String nome, int qntVagas, Double valorHora) {
        this.nome = nome;
        this.qntVagas = qntVagas;
        this.valorHora = valorHora;
    }
}
