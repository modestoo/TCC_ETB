package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.EspecialistaClinico;

public class EspecialistaClinicoDAO extends DataBaseDAO{

	public EspecialistaClinicoDAO() throws Exception {
	}

	public void inserir(EspecialistaClinico ec) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO especialista_clinico (codMatricula, nome, dn, cpf, endereco," +
        		"cidade, email, especializacao, salaAtendimento, area) VALUES(?,?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ec.getCodigoMatricula());
        pst.setString(2, ec.getNome());
        pst.setString(3, ec.getDataNascimento());
        pst.setString(4, ec.getCpf());
        pst.setString(5, ec.getEndereco());
        pst.setString(6, ec.getCidade());
        pst.setString(7, ec.getEmail());
        pst.setString(8, ec.getEspecializacao());
        pst.setString(9, ec.getSalaAtendimento());
        pst.setString(10, ec.getArea());
        pst.execute();
    }
    
    public void alterar(EspecialistaClinico ec) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE especialista_clinico SET nome=?, dn=?, cpf=?, endereco=?," +
        		"cidade=?, email=?, especializacao=?, salaAtendimento=?, area=? WHERE codMatricula=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ec.getNome());
        pst.setString(2, ec.getDataNascimento());
        pst.setString(3, ec.getCpf());
        pst.setString(4, ec.getEndereco());
        pst.setString(5, ec.getCidade());
        pst.setString(6, ec.getEmail());
        pst.setString(7, ec.getEspecializacao());
        pst.setString(8, ec.getSalaAtendimento());
        pst.setString(9, ec.getArea());
        pst.setString(10, ec.getCodigoMatricula());
        pst.execute();
    }

    public void excluir(EspecialistaClinico ec) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM especialista_clinico WHERE codMatricula=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ec.getCodigoMatricula());
        pst.execute();
    }
    
    public ArrayList<EspecialistaClinico> listar() throws Exception {
        ArrayList<EspecialistaClinico> lista = new ArrayList<EspecialistaClinico>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM especialista_clinico";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	EspecialistaClinico ec = new EspecialistaClinico();
            ec.setCodigoMatricula(rs.getString("codMatricula"));
            ec.setNome(rs.getString("nome"));
            ec.setDataNascimento(rs.getString("dn"));
            ec.setCpf(rs.getString("cpf"));
            ec.setEndereco(rs.getString("endereco"));
            ec.setCidade(rs.getString("cidade"));
            ec.setEmail(rs.getString("email"));
            ec.setEspecializacao(rs.getString("especializacao"));
            ec.setSalaAtendimento(rs.getString("salaAtendimento"));
            ec.setArea(rs.getString("idAtividade"));

            lista.add(ec);
        }

        return lista;
    }
}
