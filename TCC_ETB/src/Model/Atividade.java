package Model;

public class Atividade {
    
	private String idAtividade;
	private String atividade;
    private String descricao;
    private Prontuario[] prontuarios;

    //Getters e Setters 

    public String getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(String idAtividade) {
		this.idAtividade = idAtividade;
	}
	
	public String getAtividade() {
        return atividade;
    }
	
	public void setAtividade(String atividade) {
        this.atividade = atividade;
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
