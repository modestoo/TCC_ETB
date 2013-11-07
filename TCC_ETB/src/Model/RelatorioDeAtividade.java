package Model;

public class RelatorioDeAtividade {

    private String codigoRelatorio;
    private String Relatorio;
    private TecnicoClinico tecnicoClinico;

    //Getters e Setters

    public String getCodigoRelatorio() {
        return codigoRelatorio;
    }

    public void setCodigoRelatorio(String codigoRelatorio) {
        this.codigoRelatorio = codigoRelatorio;
    }

    public String getRelatorio() {
        return Relatorio;
    }

    public void setRelatorio(String Relatorio) {
        this.Relatorio = Relatorio;
    }

	public TecnicoClinico getTecnicoClinico() {
		return tecnicoClinico;
	}

	public void setTecnicoClinico(TecnicoClinico tecnicoClinico) {
		this.tecnicoClinico = tecnicoClinico;
	}
    
    

}
