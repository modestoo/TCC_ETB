package Model;

public class EspecialistaClinico extends Funcionario{

    private String salaAtendimento;
    private String area;
    private Atendimento[] atendimentos;

    //Getters e Setters

    public String getSalaAtendimento() {
        return salaAtendimento;
    }

    public void setSalaAtendimento(String salaAtendimento) {
        this.salaAtendimento = salaAtendimento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

	public Atendimento[] getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Atendimento[] atendimentos) {
		this.atendimentos = atendimentos;
	}

 
     
   
}
