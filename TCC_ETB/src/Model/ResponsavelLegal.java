package Model;

public class ResponsavelLegal extends Pessoa{
    
	private String codigoIdentificador;
    private String descricao;
    private PacienteInternado pacienteInternado;


    //Getters e Setters

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public PacienteInternado getPacienteInternado() {
		return pacienteInternado;
	}

	public void setPacienteInternado(PacienteInternado pacienteInternado) {
		this.pacienteInternado = pacienteInternado;
	}
    
    

}
