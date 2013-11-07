package Model;

public class Paciente extends Pessoa{
    
	private String codigoIdenticador;
    private String urlFoto;
    private Atendimento atendimento;
    private Prontuario prontuario;

    //Getters e Setters

    public String getCodigoIdenticador() {
        return codigoIdenticador;
    }

    public void setCodigoIdenticador(String codigoIdenticador) {
        this.codigoIdenticador = codigoIdenticador;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}

}
