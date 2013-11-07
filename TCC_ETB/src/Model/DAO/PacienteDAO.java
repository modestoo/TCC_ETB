package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Paciente;

public class PacienteDAO extends DataBaseDAO {

	public PacienteDAO() throws Exception {
	}

	public void inserir(Paciente p) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO paciente (idPaciente, nome, dn, cpf, endereco," +
        		"cidade, email, urlFoto) VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, p.getCodigoIdenticador());
        pst.setString(2, p.getNome());
        pst.setString(3, p.getDataNascimento());
        pst.setString(4, p.getCpf());
        pst.setString(5, p.getEndereco());
        pst.setString(6, p.getCidade());
        pst.setString(7, p.getEmail());
        pst.setString(8, p.getUrlFoto());
        pst.execute();
    }
    
    public void alterar(Paciente p) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE paciente SET nome=?, dn=?, cpf=?, endereco=?," +
        		"cidade=?, email=?, urlFoto=? WHERE idPaciente=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, p.getNome());
        pst.setString(2, p.getDataNascimento());
        pst.setString(3, p.getCpf());
        pst.setString(4, p.getEndereco());
        pst.setString(5, p.getCidade());
        pst.setString(6, p.getEmail());
        pst.setString(7, p.getUrlFoto());
        pst.setString(8, p.getCodigoIdenticador());
        pst.execute();
    }

    public void excluir(Paciente p) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM paciente WHERE idPaciente=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, p.getCodigoIdenticador());
        pst.execute();
    }
    
    public ArrayList<Paciente> listar() throws Exception {
        ArrayList<Paciente> lista = new ArrayList<Paciente>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM paciente";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	Paciente p = new Paciente();
            p.setCodigoIdenticador(rs.getString("idPaciente"));
            p.setNome(rs.getString("nome"));
            p.setDataNascimento(rs.getString("dn"));
            p.setCpf(rs.getString("cpf"));
            p.setEndereco(rs.getString("endereco"));
            p.setCidade(rs.getString("cidade"));
            p.setEmail(rs.getString("email"));
            p.setUrlFoto(rs.getString("urlFoto"));
            
            lista.add(p);
        }

        return lista;
    }

}
