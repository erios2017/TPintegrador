package DaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Dao.LocalidadDao;

public class LocalidadDaoImpl implements LocalidadDao{


	
	public ResultSet LeerLocalidades(int IdPro) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conexion = Conexion.getConexion().getSQLConexion();
		
		Statement st;
		
	try {
		st = conexion.createStatement();
		ResultSet result = st.executeQuery("SELECT * FROM LOCALIDADES WHERE IdProvincia_Loc ="  + IdPro);
		return result;		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
	
}
