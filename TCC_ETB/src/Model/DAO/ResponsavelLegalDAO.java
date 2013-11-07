package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.ResponsavelLegal;

public class ResponsavelLegalDAO extends DataBaseDAO{

	public ResponsavelLegalDAO() throws Exception {
	}

	public void inserir(ResponsavelLegal rl) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO responsavel_legal (codIdentificador, nome, dn, cpf, endereco," +
        		"cidade, email, descricao) VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, rl.getCodigoIdentificador());
        pst.setString(2, rl.getNome());
        pst.setString(3, rl.getDataNascimento());
        pst.setString(4, rl.getCpf());
        pst.setString(5, rl.getEndereco());
        pst.setString(6, rl.getCidade());
        pst.setString(7, rl.getEmail());
        pst.setString(8, rl.getDescricao());
        pst.execute();
    }
    
    public void alterar(ResponsavelLegal rl) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE responsavel_legal SET nome=?, dn=?, cpf=?, endereco=?," +
        		"cidade=?, email=?, descricao=? WHERE codIdentificador=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, rl.getNome());
        pst.setString(2, rl.getDataNascimento());
        pst.setString(3, rl.getCpf());
        pst.setString(4, rl.getEndereco());
        pst.setString(5, rl.getCidade());
        pst.setString(6, rl.getEmail());
        pst.setString(7, rl.getDescricao());
        pst.setString(8, rl.getCodigoIdentificador());
        pst.execute();
    }

    public void excluir(ResponsavelLegal rl) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM responsavel_legal WHERE codIdentificador=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, rl.getCodigoIdentificador());
        pst.execute();
    }
    
    public ArrayList<ResponsavelLegal> listar() throws Exception {
        ArrayList<ResponsavelLegal> lista = new ArrayList<ResponsavelLegal>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM responsavel_legal";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	ResponsavelLegal rl = new ResponsavelLegal();
            rl.setCodigoIdentificador(rs.getString("codIdentificador"));
            rl.setNome(rs.getString("nome"));
            rl.setDataNascimento(rs.getString("dn"));
            rl.setCpf(rs.getString("cpf"));
            rl.setEndereco(rs.getString("endereco"));
            rl.setCidade(rs.getString("cidade"));
            rl.setEmail(rs.getString("email"));
            rl.setDescricao(rs.getString("descricao"));
            lista.add(rl);
        }

        return lista;
    }

}
