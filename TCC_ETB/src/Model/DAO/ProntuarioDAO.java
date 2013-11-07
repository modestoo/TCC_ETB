package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Prontuario;

public class ProntuarioDAO extends DataBaseDAO{

	public ProntuarioDAO()  throws Exception {
	}

	public void inserir(Prontuario p) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO prontuario (idProntuario, diagnostico, tratamento, recomendacao, observacao) VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, p.getCodigoProntuario());
        pst.setString(2, p.getDiagnostico());
        pst.setString(3, p.getTratamento());
        pst.setString(4, p.getRecomendacao());
        pst.setString(5, p.getObservacao());
        pst.execute();
    }
    
    public void alterar(Prontuario p) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE prontuario SET diagnostico=?, tratamento=?, recomendacao=?, observacao=? WHERE idProntuario=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, p.getDiagnostico());
        pst.setString(2, p.getTratamento());
        pst.setString(3, p.getRecomendacao());
        pst.setString(4, p.getObservacao());
        pst.setString(5, p.getCodigoProntuario());
        pst.execute();
    }

    public void excluir(Prontuario p) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM prontuario WHERE idProntuario=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, p.getCodigoProntuario());
        pst.execute();
    }
    
    public ArrayList<Prontuario> listar() throws Exception {
        ArrayList<Prontuario> lista = new ArrayList<Prontuario>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM prontuario";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Prontuario p = new Prontuario();
            p.setCodigoProntuario(rs.getString("idProntuario"));
            p.setDiagnostico(rs.getString("diagnostico"));
            p.setTratamento(rs.getString("tratamento"));
            p.setRecomendacao(rs.getString("recomendacao"));
            p.setObservacao(rs.getString("observacao"));
            lista.add(p);
        }

        return lista;
    }

}
