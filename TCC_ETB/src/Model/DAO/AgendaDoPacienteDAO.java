package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.AgendaDoPaciente;

public class AgendaDoPacienteDAO extends DataBaseDAO {

	public AgendaDoPacienteDAO() throws Exception {
    }
	
    public void inserir(AgendaDoPaciente ap) throws Exception {
        PreparedStatement pst;
        String sql = "INSERT INTO agenda_paciente (atividadeDiaria, atividadeSemanal, dataConsulta) VALUES(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ap.getAtividadeDiaria());
        pst.setString(2, ap.getAtividadeSemanal());
        pst.setString(3, ap.getDataConsulta());
        pst.execute();
    }
    
    public void alterar(AgendaDoPaciente ap) throws Exception {
        PreparedStatement pst;
        String sql = "UPDATE agenda_paciente SET atividadeDiaria=?, atividadeSemanal=?, dataConsulta=? WHERE idPacienteInternado=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ap.getAtividadeDiaria());
        pst.setString(2, ap.getAtividadeSemanal());
        pst.setString(3, ap.getDataConsulta());
        pst.setString(4, ap.getPacienteInternado().getCodigoIdenticador());
        pst.execute();
    }

    public void excluir(AgendaDoPaciente ap) throws Exception {
        PreparedStatement pst;
        String sql = "DELETE FROM agenda_paciente WHERE idPacienteInternado=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, ap.getPacienteInternado().getCodigoIdenticador());
        pst.execute();
    }
    
    public ArrayList<AgendaDoPaciente> listar() throws Exception {
        ArrayList<AgendaDoPaciente> lista = new ArrayList<AgendaDoPaciente>();
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM agenda_paciente";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
        	AgendaDoPaciente ap = new AgendaDoPaciente();
            ap.setAtividadeDiaria(rs.getString("atividadeDiaria"));
            ap.setAtividadeSemanal(rs.getString("atividadeSemanal"));
            ap.setDataConsulta(rs.getString("dataConsulta"));
            ap.getPacienteInternado().setCodigoIdenticador(rs.getString("idPacienteInternado"));
            
            lista.add(ap);
        }

        return lista;
    }
}
