/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderestacionamento;

/**
 *
 * @author 20131BSI0084
 */
public class EstacionamentoDiretor {
    private Estacionamento estacionamento;
    private Vaga vaga;
    private Funcionario funcionario;

    public EstacionamentoDiretor(Estacionamento estacionamento, Vaga vaga, Funcionario funcionario) {
        this.estacionamento = estacionamento;
        this.vaga = vaga;
        this.funcionario = funcionario;
    }
    
    public void buildEndereco(String logradouro, String cep, String bairro, String cidade, String estado){
        Endereco endereco = new Endereco();
        endereco.setLogagradouro(logradouro);
        endereco.setCep(cep);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
    }
    
    public void Build
}
