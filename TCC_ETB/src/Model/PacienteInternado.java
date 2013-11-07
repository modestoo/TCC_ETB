package Model;

public class PacienteInternado extends Paciente {
    private String quarto;
    private String dataDeInternacao;
    private ResponsavelLegal responsavelLegal;
    private TecnicoClinico tecnicoClinico;
    private AgendaDoPaciente agendaDoPaciente;

    //Getters e Setters

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getDataDeInternacao() {
        return dataDeInternacao;
    }

    public void setDataDeInternacao(String dataDeInternacao) {
        this.dataDeInternacao = dataDeInternacao;
    }

	public ResponsavelLegal getResponsavelLegal() {
		return responsavelLegal;
	}

	public void setResponsavelLegal(ResponsavelLegal responsavelLegal) {
		this.responsavelLegal = responsavelLegal;
	}

	public TecnicoClinico getTecnicoClinico() {
		return tecnicoClinico;
	}

	public void setTecnicoClinico(TecnicoClinico tecnicoClinico) {
		this.tecnicoClinico = tecnicoClinico;
	}

	public AgendaDoPaciente getAgendaDoPaciente() {
		return agendaDoPaciente;
	}

	public void setAgendaDoPaciente(AgendaDoPaciente agendaDoPaciente) {
		this.agendaDoPaciente = agendaDoPaciente;
	}

    
    
}
