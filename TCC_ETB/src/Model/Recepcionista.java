package Model;

public class Recepcionista extends Funcionario{

    private String ramal;
    private Atendimento[] atendimentos;

    //Getters e Setters

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

	public Atendimento[] getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Atendimento[] atendimentos) {
		this.atendimentos = atendimentos;
	}

}
