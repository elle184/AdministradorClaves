/**
 * 
 */
package com.administradorclaves.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.administradorclaves.dummy.entidad.Usuario;

/**
 * @author lucka
 *
 */
@ManagedBean
@ViewScoped
public class UsuarioMb {
	private Usuario usuario;
	
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
}
