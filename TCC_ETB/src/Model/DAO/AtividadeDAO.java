package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Atividade;

public class AtividadeDAO extends DataBaseDAO {

	public AtividadeDAO() throws Exception {
	}
	
	public void inserir(Atividade a) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO atividade (idAtividade, atividade, descricao) VALUES(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, a.getIdAtividade());
        pst.setString(2, a.getAtividade());
        pst.setString(3, a.getDescricao());
        pst.execute();
    }
    
    public void alterar(Atividade a) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE atividade SET atividade=?, descricao=? WHERE idAtividade=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, a.getAtividade());
        pst.setString(2, a.getDescricao());
        pst.setString(3, a.getIdAtividade());
        pst.execute();
    }

    public void excluir(Atividade a) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM atividade WHERE idAtividade=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, a.getIdAtividade());
        pst.execute();
    }
    
    public ArrayList<Atividade> listar() throws Exception {
        ArrayList<Atividade> lista = new ArrayList<Atividade>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM atividade";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Atividade a = new Atividade();
            a.setIdAtividade(rs.getString("idAtividade"));
            a.setAtividade(rs.getString("atividade"));
            a.setDescricao(rs.getString("descricao"));
            
            lista.add(a);
        }

        return lista;
    }

}
