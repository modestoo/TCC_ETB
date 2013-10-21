package Model;

public class Paciente {
    private String codigoIdenticador;
    private int idade;
    private String urlFoto;

    //Getters e Setters

    public String getCodigoIdenticador() {
        return codigoIdenticador;
    }

    public void setCodigoIdenticador(String codigoIdenticador) {
        this.codigoIdenticador = codigoIdenticador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

}
