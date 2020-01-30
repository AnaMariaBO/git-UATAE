package app.modelo;

import java.io.Serializable;

public class Contacto implements Serializable{
private int id;
private String nombre;
private String email;
private String telefono;

//constructores

public Contacto() {
	
}

public Contacto(int id, String nombre, String email, String telefono) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.email = email;
	this.telefono = telefono;
}
//getter y setter
/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the telefono
 */
public String getTelefono() {
	return telefono;
}

/**
 * @param telefono the telefono to set
 */
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
//toString

@Override
public String toString() {
	return "Contacto [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
}










}
