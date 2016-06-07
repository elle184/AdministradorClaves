/**
 * 
 */
package com.administradorclaves.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 * @author lucka
 *
 */
@ManagedBean(name = Login.MANAGED_BEAN_NAME)
@ViewScoped
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
	 * - No es valido utilizar la anotacíon si se están administrando los managed 
	 * bean en el archivo faces-config.xml
	 */
	@ManagedProperty(value = "Bienvenido al administrador de claves")
	private String saludo;
	private String nomUsuario;
	private String clave;
	
	/**
	 * En SessionScoped solo se hace una vez el llamado a este método.
	 * En ViewScoped hace el llamado cada vez que se solicita el Managed Bean
	 */
	@PostConstruct
	public void inicializacionManagedBean() {
		System.out.println("iniciando el managed bean Login");
	}
	
	/**
	 * El Pre Destroy solo es llamado cuando se piensa destruir por completo 
	 * la instancia del objeto.
	 */
	@PreDestroy
	public void limpiezaManagedBean() {
		System.out.println("limpieza del managed bean Login");
	}
	
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
