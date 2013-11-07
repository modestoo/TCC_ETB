package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Recepcionista;

public class RecepcionistaDAO extends DataBaseDAO{

	public RecepcionistaDAO() throws Exception {
	}

	public void inserir(Recepcionista r) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO recepcionista (codMatricula, nome, dn, cpf, endereco," +
        		"cidade, email, ramal) VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, r.getCodigoMatricula());
        pst.setString(2, r.getNome());
        pst.setString(3, r.getDataNascimento());
        pst.setString(4, r.getCpf());
        pst.setString(5, r.getEndereco());
        pst.setString(6, r.getCidade());
        pst.setString(7, r.getEmail());
        pst.setString(8, r.getRamal());
        pst.execute();
    }
    
    public void alterar(Recepcionista r) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE recepcionista SET nome=?, dn=?, cpf=?, endereco=?," +
        		"cidade=?, email=?, ramal=? WHERE codMatricula=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, r.getNome());
        pst.setString(2, r.getDataNascimento());
        pst.setString(3, r.getCpf());
        pst.setString(4, r.getEndereco());
        pst.setString(5, r.getCidade());
        pst.setString(6, r.getEmail());
        pst.setString(7, r.getRamal());
        pst.setString(8, r.getCodigoMatricula());
        pst.execute();
    }

    public void excluir(Recepcionista r) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM recepcionista WHERE codMatricula=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, r.getCodigoMatricula());
        pst.execute();
    }
    
    public ArrayList<Recepcionista> listar() throws Exception {
        ArrayList<Recepcionista> lista = new ArrayList<Recepcionista>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM recepcionista";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Recepcionista r = new Recepcionista();
            r.setCodigoMatricula(rs.getString("codMatricula"));
            r.setNome(rs.getString("nome"));
            r.setDataNascimento(rs.getString("dn"));
            r.setCpf(rs.getString("cpf"));
            r.setEndereco(rs.getString("endereco"));
            r.setCidade(rs.getString("cidade"));
            r.setEmail(rs.getString("email"));
            r.setRamal(rs.getString("ramal"));
            lista.add(r);
        }

        return lista;
    }

}