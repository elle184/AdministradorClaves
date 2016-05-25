/**
 * 
 */
package com.administradorclaves.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;

import com.administradorclaves.dummy.entidad.Usuario;

/**
 * @author lucka
 *
 */
public class UsuarioMb {
	private Usuario usuario;
	private String saludo;
	
	@ManagedProperty(value = "Escriba su nombre completo")
	private String nombre;
	
	public UsuarioMb() {}

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
	}
	
	public String registrarUsuario() {
		return null;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
