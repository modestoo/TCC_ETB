package Model;


public class AgendaDoPaciente {

    private String atividadeDiaria; 
    private String atividadeSemanal;
    private String dataConsulta;
    private PacienteInternado pacienteInternado;

    //Getters e Setters
    
    public String getAtividadeDiaria() {
        return atividadeDiaria;
    }

    public void setAtividadeDiaria(String atividadeDiaria) {
        this.atividadeDiaria = atividadeDiaria;
    }

    public String getAtividadeSemanal() {
        return atividadeSemanal;
    }

    public void setAtividadeSemanal(String atividadeSemanal) {
        this.atividadeSemanal = atividadeSemanal;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

	public PacienteInternado getPacienteInternado() {
		return pacienteInternado;
	}

	public void setPacienteInternado(PacienteInternado pacienteInternado) {
		this.pacienteInternado = pacienteInternado;
	}

}
