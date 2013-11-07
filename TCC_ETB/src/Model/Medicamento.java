package Model;

public class Medicamento {
    
	private String codigoMedicamento;
    private String nome;
    private String descricao;
    private Prontuario[] prontuarios;

    //Getters e Setters

    public String getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(String codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Prontuario[] getProntuarios() {
		return prontuarios;
	}

	public void setProntuarios(Prontuario[] prontuarios) {
		this.prontuarios = prontuarios;
	}
    

}
