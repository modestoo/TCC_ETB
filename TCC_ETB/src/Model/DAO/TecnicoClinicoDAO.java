package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.TecnicoClinico;

public class TecnicoClinicoDAO extends DataBaseDAO{

	public TecnicoClinicoDAO() throws Exception {
	}

	public void inserir(TecnicoClinico tc) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO tecnico_clinico (codMatricula, nome, dn, cpf, endereco," +
        		"cidade, email, gradeAtendimento) VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, tc.getCodigoMatricula());
        pst.setString(2, tc.getNome());
        pst.setString(3, tc.getDataNascimento());
        pst.setString(4, tc.getCpf());
        pst.setString(5, tc.getEndereco());
        pst.setString(6, tc.getCidade());
        pst.setString(7, tc.getEmail());
        pst.setString(8, tc.getGradeAtendimento());
        pst.execute();
    }
    
    public void alterar(TecnicoClinico tc) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE tecnico_clinico SET nome=?, dn=?, cpf=?, endereco=?," +
        		"cidade=?, email=?, gradeAtendimento=? WHERE codMatricula=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, tc.getNome());
        pst.setString(2, tc.getDataNascimento());
        pst.setString(3, tc.getCpf());
        pst.setString(4, tc.getEndereco());
        pst.setString(5, tc.getCidade());
        pst.setString(6, tc.getEmail());
        pst.setString(7, tc.getGradeAtendimento());
        pst.setString(8, tc.getCodigoMatricula());
        pst.execute();
    }

    public void excluir(TecnicoClinico tc) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM tecnico_clinico WHERE codMatricula=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, tc.getCodigoMatricula());
        pst.execute();
    }
    
    public ArrayList<TecnicoClinico> listar() throws Exception {
        ArrayList<TecnicoClinico> lista = new ArrayList<TecnicoClinico>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM tecnico_clinico";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	TecnicoClinico tc = new TecnicoClinico();
            tc.setCodigoMatricula(rs.getString("codMatricula"));
            tc.setNome(rs.getString("nome"));
            tc.setDataNascimento(rs.getString("dn"));
            tc.setCpf(rs.getString("cpf"));
            tc.setEndereco(rs.getString("endereco"));
            tc.setCidade(rs.getString("cidade"));
            tc.setEmail(rs.getString("email"));
            tc.setGradeAtendimento(rs.getString("gradeAtendimento"));
            lista.add(tc);
        }

        return lista;
    }

}