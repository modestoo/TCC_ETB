package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Telefone;

public class TelefoneDAO extends DataBaseDAO{

	public TelefoneDAO() throws Exception {
	}

	public void inserir(Telefone t) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO telefone (codTelefone, codArea, numero, tipo) VALUES(?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, t.getCodigoTelefone());
        pst.setString(2, t.getCodigoArea());
        pst.setString(3, t.getNumero());
        pst.setString(4, t.getTipo());
        pst.execute();
    }
    
    public void alterar(Telefone t) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE telefone SET codArea=?, numero=?, tipo=? WHERE codTelefone=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, t.getCodigoArea());
        pst.setString(2, t.getNumero());
        pst.setString(3, t.getTipo());
        pst.setString(4, t.getCodigoTelefone());
        pst.execute();
    }

    public void excluir(Telefone t) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM telefone WHERE codTelefone=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, t.getCodigoTelefone());
        pst.execute();
    }
    
    public ArrayList<Telefone> listar() throws Exception {
        ArrayList<Telefone> lista = new ArrayList<Telefone>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM telefone";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Telefone t = new Telefone();
            t.setCodigoTelefone(rs.getString("codTelefone"));
            t.setCodigoArea(rs.getString("codArea"));
            t.setNumero(rs.getString("numero"));
            t.setTipo(rs.getString("tipo"));
            lista.add(t);
        }

        return lista;
    }


}
