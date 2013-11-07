package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Medicamento;

public class MedicamentoDAO extends DataBaseDAO{

	public MedicamentoDAO() throws Exception {
	}

	public void inserir(Medicamento m) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO medicamento (idMedicamento, nome, descricao) VALUES(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, m.getCodigoMedicamento());
        pst.setString(2, m.getNome());
        pst.setString(3, m.getDescricao());
        pst.execute();
    }
    
    public void alterar(Medicamento m) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE medicamento SET nome=?, descricao=? WHERE idMedicamento=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, m.getNome());
        pst.setString(2, m.getDescricao());
        pst.setString(3, m.getCodigoMedicamento());
        pst.execute();
    }

    public void excluir(Medicamento m) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM medicamento WHERE idMedicamento=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, m.getCodigoMedicamento());
        pst.execute();
    }
    
    public ArrayList<Medicamento> listar() throws Exception {
        ArrayList<Medicamento> lista = new ArrayList<Medicamento>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM medicamento";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Medicamento m = new Medicamento();
        	m.setCodigoMedicamento(rs.getString("idMedicamento"));
        	m.setNome(rs.getString("nome"));
            m.setDescricao(rs.getString("descricao"));
            
            lista.add(m);
        }

        return lista;
    }

}
