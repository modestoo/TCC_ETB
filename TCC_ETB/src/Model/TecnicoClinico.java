package Model;

public class TecnicoClinico extends Funcionario{

    private String gradeAtendimento;
    private PacienteInternado[] pacientesInternados;
    private RelatorioDeAtividade[] relatoriosDeAtividades;

    //Getters e Setters

    public String getGradeAtendimento() {
        return gradeAtendimento;
    }

    public void setGradeAtendimento(String gradeAtendimento) {
        this.gradeAtendimento = gradeAtendimento;
    }

	public PacienteInternado[] getPacientesInternados() {
		return pacientesInternados;
	}

	public void setPacientesInternados(PacienteInternado[] pacientesInternados) {
		this.pacientesInternados = pacientesInternados;
	}

	public RelatorioDeAtividade[] getRelatoriosDeAtividades() {
		return relatoriosDeAtividades;
	}

	public void setRelatoriosDeAtividades(
			RelatorioDeAtividade[] relatoriosDeAtividades) {
		this.relatoriosDeAtividades = relatoriosDeAtividades;
	}
    
    
}
