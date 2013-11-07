package Model;

public class Telefone {

	private String codigoTelefone;
    private String codigoArea;
    private String numero;
    private String tipo; 
    private String Pessoa;

    //Getters e Setters
    
    public String getCodigoArea() {
        return codigoArea;
    }

    public String getCodigoTelefone() {
		return codigoTelefone;
	}

	public void setCodigoTelefone(String codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}

	public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

	public String getPessoa() {
		return Pessoa;
	}

	public void setPessoa(String pessoa) {
		Pessoa = pessoa;
	}
    
    

}