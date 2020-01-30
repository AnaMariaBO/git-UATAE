package app.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.modelo.Contacto;

public class AccesoContactos extends Conexion {

	 public List<Contacto> obtenerTodos() throws ClassNotFoundException, SQLException {
	        //definicion de variables
	        String sql = "Select  id, nombre, email, telefono from contactos";
	        PreparedStatement comando;
	        ResultSet rs;
	        List<Contacto> resultado = new ArrayList();
	        //abrir conexion
	        abrirConexion();
	        //obtener el comando de la conexion
	        comando = miConexion.prepareStatement(sql);
	        //ejecutar la consulta
	        rs = comando.executeQuery(); //cuando se ejecuta se guarda en rs
	        //Recorrer el resultado y añadir a coleccion
	        while (rs.next()) { //recorrer
	        	Contacto c1 = new Contacto(rs.getInt("id"),
	                    rs.getString("nombre"),
	                    rs.getString("email"), rs.getString("telefono"));
	            //añadir a la coleccion
	            resultado.add(c1);
	        }
	        //cerrar conexion
	        cerrarConexion();
	        //devolver la coleccion de clientes
	        return resultado;
	    }
///---------------------------------------------------------------------------------------------------------------
	 public Contacto obtenerUno(int id) throws ClassNotFoundException, SQLException {
	        //declarar variables
	        String sql = "Select id, nombre, email, telefono from contactos "
	                + "where id=?"; //leer id del parametro del metodo
	        PreparedStatement comando;
	        ResultSet rs;
	        Contacto c1 = null;
	        //abrir conexion
	        abrirConexion();
	        //obtener el comando de la conexion
	        comando = miConexion.prepareStatement(sql);
	        //dar valor al parametro (?)
	        comando.setInt(1, id);// posicion del parametro, valor que quieres que tenga el parametro
	        //ejecutar la consulta/comando
	        rs = comando.executeQuery();
	        if (rs.next()) {
	            c1 = new Contacto(id,
	                    rs.getString("nombre"),
	                    rs.getString("email"), rs.getString("telefono"));
	        }
	        //cerrar conexion
	        cerrarConexion();
	        //devolver el cliente
	        return c1;
	    }
	 //-----------------------------------------------------------------------------------------------------------------------------------
	 public boolean insertarUno(Contacto c) throws ClassNotFoundException, SQLException {
	        //declarar variables
	        String sql = "Insert into contactos values (?,?,?,?)";
	        PreparedStatement comando;
	        int numeroRegistrosInsertados;
	        //abrir conexion
	        abrirConexion();
	        //obtener comando de la conexion
	        comando = miConexion.prepareStatement(sql);
	        //dar valor a los parametros   
	        comando.setInt(1, c.getId());
	        comando.setString(2, c.getNombre());
	        comando.setString(3, c.getEmail());
	        comando.setString(4, c.getTelefono());
	        //ejecutar comando
	        numeroRegistrosInsertados = comando.executeUpdate();
	        //cerrar conexion
	        cerrarConexion();
	        // devolver si se han añadidos registros
	        return numeroRegistrosInsertados >= 1;

	    }

	    //-------------------------------------------------------------------------
	    //modificar
	    public boolean modificar(Contacto c) throws ClassNotFoundException, SQLException {
	        //variables
	        String sql = "Update contactos set  nombre =? , email=? , telefono=?  where id=? ";
	        PreparedStatement comando;
	        int numeroRegistrosModificados;
	        //abrir conexion
	        abrirConexion();
	        //obtener comando de conexion
	        comando = miConexion.prepareStatement(sql);
	        //dar valor a los parametros
	        comando.setString(1, c.getNombre());
	        comando.setString(2, c.getEmail());
	        comando.setString(3, c.getTelefono());
	        comando.setInt(4, c.getId());
	       
	        
	        //ejecutar comando
	        numeroRegistrosModificados = comando.executeUpdate();
	        //cerrar conexion
	        cerrarConexion();
	        // devolver si se han modificados registros
	        return numeroRegistrosModificados >= 1;
	    }

	//--------------------------------------------------------------------------------
	//eliminar
	    public boolean borrarUno(int id) throws ClassNotFoundException, SQLException {
	        //variables
	        String sql = " delete from contactos where id=?";
	        PreparedStatement comando;
	        int numeroRegistrosBorrados;
	        //abrir conxion
	        abrirConexion();
	        //obtener comando
	        comando = miConexion.prepareStatement(sql);
	        //dar valor al parametro id
	        comando.setInt(1, id);// nº=?
	        //ejecutar comando
	        numeroRegistrosBorrados = comando.executeUpdate();
	        //cerrar conexion
	        cerrarConexion();
	        // devolver si se han borrado los registros
	        return numeroRegistrosBorrados >= 1;

	    }
	 
}
