package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.RelatorioDeAtividade;

public class RelatorioDeAtividadeDAO extends DataBaseDAO{

	public RelatorioDeAtividadeDAO() throws Exception {
	}

	public void inserir(RelatorioDeAtividade ra) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO relatorio_atividade (codRelatorio, relatorio) VALUES(?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ra.getCodigoRelatorio());
        pst.setString(2, ra.getRelatorio());
        pst.execute();
    }
    
    public void alterar(RelatorioDeAtividade ra) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE relatorio_atividade SET relatorio=? WHERE codRelatorio=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ra.getRelatorio());
        pst.setString(2, ra.getCodigoRelatorio());
        pst.execute();
    }

    public void excluir(RelatorioDeAtividade ra) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM relatorio_atividade WHERE codRelatorio=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ra.getCodigoRelatorio());
        pst.execute();
    }
    
    public ArrayList<RelatorioDeAtividade> listar() throws Exception {
        ArrayList<RelatorioDeAtividade> lista = new ArrayList<RelatorioDeAtividade>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM relatorio_atividade";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	RelatorioDeAtividade ra = new RelatorioDeAtividade();
            ra.setCodigoRelatorio(rs.getString("codRelatorio"));
            ra.setRelatorio(rs.getString("relatorio"));
            lista.add(ra);
        }

        return lista;
    }

}