package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Atendimento;

public class AtendimentoDAO extends DataBaseDAO {

	public AtendimentoDAO() throws Exception {
	}

	public void inserir(Atendimento a) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO atendimento (codAtendimento, nome, telefone, dataAtendimento, horario) VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, a.getCodigoAtendimento());
        pst.setString(2, a.getNome());
        pst.setString(3, a.getTelefone());
        pst.setString(4, a.getDataAtendimento());
        pst.setString(5, a.getHorario());
        pst.execute();
    }
    
    public void alterar(Atendimento a) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE atendimento SET nome=?, telefone=?, dataAtendimento=?, horario=? WHERE codAtendimento=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, a.getNome());
        pst.setString(2, a.getTelefone());
        pst.setString(3, a.getDataAtendimento());
        pst.setString(4, a.getHorario());
        pst.setString(5, a.getCodigoAtendimento());
        pst.execute();
    }

    public void excluir(Atendimento a) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM atendimento WHERE codAtendimento=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, a.getCodigoAtendimento());
        pst.execute();
    }
    
    public ArrayList<Atendimento> listar() throws Exception {
        ArrayList<Atendimento> lista = new ArrayList<Atendimento>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM atendimento";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Atendimento a = new Atendimento();
            a.setCodigoAtendimento(rs.getString("codAtendimento"));
            a.setNome(rs.getString("nome"));
            a.setTelefone(rs.getString("telefone"));
            a.setDataAtendimento(rs.getString("dataAtendimento"));
            a.setHorario(rs.getString("horario"));
            
            lista.add(a);
        }

        return lista;
    }


}
