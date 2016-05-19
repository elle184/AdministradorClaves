/**
 * 
 */
package com.administradorclaves.dummy.entidad;

import java.io.Serializable;

/**
 * @author lucka
 *
 */
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idUsuario;
	private String nombre;
	private String correoElectronico;
	private String nomUsuario;
	private String preguntaSeguridad;
	private String respuestaPregunta;
	
	public Usuario() {}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getNomUsuario() {
		return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	public String getPreguntaSeguridad() {
		return preguntaSeguridad;
	}
	public void setPreguntaSeguridad(String preguntaSeguridad) {
		this.preguntaSeguridad = preguntaSeguridad;
	}
	public String getRespuestaPregunta() {
		return respuestaPregunta;
	}
	public void setRespuestaPregunta(String respuestaPregunta) {
		this.respuestaPregunta = respuestaPregunta;
	}
}
