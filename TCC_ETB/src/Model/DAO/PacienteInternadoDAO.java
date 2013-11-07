package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.PacienteInternado;

public class PacienteInternadoDAO extends DataBaseDAO {

	public PacienteInternadoDAO() throws Exception {
	}

	public void inserir(PacienteInternado pi) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO paciente_internado (idPacienteInternado, nome, dn, cpf, endereco," +
        		"cidade, email, urlFoto, quarto, dataInternacao) VALUES(?,?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, pi.getCodigoIdenticador());
        pst.setString(2, pi.getNome());
        pst.setString(3, pi.getDataNascimento());
        pst.setString(4, pi.getCpf());
        pst.setString(5, pi.getEndereco());
        pst.setString(6, pi.getCidade());
        pst.setString(7, pi.getEmail());
        pst.setString(8, pi.getUrlFoto());
        pst.setString(9, pi.getQuarto());
        pst.setString(10, pi.getDataDeInternacao());
        pst.execute();
    }
    
    public void alterar(PacienteInternado pi) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE paciente_internado SET nome=?, dn=?, cpf=?, endereco=?," +
        		"cidade=?, email=?, urlFoto=?, quarto=?, dataInternacao=? WHERE idPacienteInternado=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, pi.getNome());
        pst.setString(2, pi.getDataNascimento());
        pst.setString(3, pi.getCpf());
        pst.setString(4, pi.getEndereco());
        pst.setString(5, pi.getCidade());
        pst.setString(6, pi.getEmail());
        pst.setString(7, pi.getUrlFoto());
        pst.setString(8, pi.getQuarto());
        pst.setString(9, pi.getDataDeInternacao());
        pst.setString(10, pi.getCodigoIdenticador());
        pst.execute();
    }

    public void excluir(PacienteInternado pi) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM paciente_internado WHERE idPacienteInternado=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, pi.getCodigoIdenticador());
        pst.execute();
    }
    
    public ArrayList<PacienteInternado> listar() throws Exception {
        ArrayList<PacienteInternado> lista = new ArrayList<PacienteInternado>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM paciente_internado";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	PacienteInternado pi = new PacienteInternado();
            pi.setCodigoIdenticador(rs.getString("idPacienteInternado"));
            pi.setNome(rs.getString("nome"));
            pi.setDataNascimento(rs.getString("dn"));
            pi.setCpf(rs.getString("cpf"));
            pi.setEndereco(rs.getString("endereco"));
            pi.setCidade(rs.getString("cidade"));
            pi.setEmail(rs.getString("email"));
            pi.setUrlFoto(rs.getString("urlFoto"));
            pi.setQuarto(rs.getString("quarto"));
            pi.setDataDeInternacao(rs.getString("dataInternacao"));
            lista.add(pi);
        }

        return lista;
    }

}
