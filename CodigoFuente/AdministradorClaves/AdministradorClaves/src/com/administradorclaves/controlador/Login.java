/**
 * 
 */
package com.administradorclaves.controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * @author lucka
 *
 */
@ManagedBean(name = Login.MANAGED_BEAN_NAME)
@SessionScoped
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MANAGED_BEAN_NAME = "login";
	
	/**
	 * Declaración de los atributos y asignación de datos desde la anotación 
	 * @ManagedProperty.
	 * 
	 * Consideraciones: 
	 * - No es valido utilizar la anotacíon si se están administrando los mamaged 
	 * bean en el archivo faces-config.xml
	 */
	@ManagedProperty(value = "Bienvenido al administrador de claves")
	private String saludo;
	private String nomUsuario;
	private String clave;
	
	public String iniciarSesion() {
		return null;
	}
	
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	public String getSaludo() {
		return this.saludo;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
