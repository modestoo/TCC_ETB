package Model;

public class Prontuario {
    
	private String codigoProntuario;
	private String diagnostico;
    private String tratamento;
    private String recomendacao;
    private String observacao;
    private Paciente paciente;
    private Medicamento[] medicamentos;

    //Getters e Setters

    public String getCodigoProntuario() {
        return codigoProntuario;
    }

    public void setCodigoProntuario(String codigoProntuario) {
        this.codigoProntuario = codigoProntuario;
    }

    public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medicamento[] getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Medicamento[] medicamentos) {
		this.medicamentos = medicamentos;
	}

}
