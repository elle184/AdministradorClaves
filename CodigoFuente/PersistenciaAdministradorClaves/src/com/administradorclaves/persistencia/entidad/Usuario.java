/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorclaves.persistencia.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author abecerra
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @TableGenerator(
        name = "sec_usuarios", 
        table = "secuencias",
        pkColumnName = "nombre_secuencia",
        valueColumnName = "valor_secuencia", 
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "sec_usuarios")
    @Column(name = "id_usuario")
    private Long idUsuario;
    
    @Column(name = "nom_usuario")
    private String nomUsuario;
    
    @Column(name = "clave")
    private String clave;
    
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(optional = true)
    private Date fechaActualizacion;

    public Usuario() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
