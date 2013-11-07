package Model;

public class Atendimento {

	private String horario;
    private String codigoAtendimento;
    private String dataAtendimento;
    private Atendimento atendimento;
    private Recepcionista recepcionista;
    private TecnicoClinico	tecnicoClinico;
    

    //Getters e Setters

    public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
    public String getCodigoAtendimento() {
        return codigoAtendimento;
    }
    
	public void setCodigoAtendimento(String codigoAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Recepcionista getRecepcionista() {
		return recepcionista;
	}

	public void setRecepcionista(Recepcionista recepcionista) {
		this.recepcionista = recepcionista;
	}

	public TecnicoClinico getTecnicoClinico() {
		return tecnicoClinico;
	}

	public void setTecnicoClinico(TecnicoClinico tecnicoClinico) {
		this.tecnicoClinico = tecnicoClinico;
	}

    

}
