package app.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	   //atributo de conexion
    protected Connection miConexion;
//el setter lo obtenemos del metodo abrir conexion, desde el driver manager
    //Getters, sin encapsular para poder verla desde las subclases. se pone protected en atributo miConexion
    public Connection getMiConexion() {
        return miConexion;
    }
    //constructor no se hace, ya que seria un vacio
    //metodo para abrir la conexion
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                + "agenda?useUnicode"
                + "=true&useJDBCCompliantTimezoneShift"
                + "=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect"
                + "=true&useSSL"
                + "=false",
                "root", "Curso2019$");//.getConnection  con los 3 parámetros, si no hemos copiado ruta
    }
    
    //metodo para cerrar conexion
    public void cerrarConexion() throws SQLException {
        miConexion.close();//close es un metodo de la clase connection
    }
	
	
	
	
	
	
}
