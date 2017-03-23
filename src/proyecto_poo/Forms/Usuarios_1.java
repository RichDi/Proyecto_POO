/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo.Forms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author drdr_
 */
@Entity
@Table(name = "usuarios", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuarios_1.findAll", query = "SELECT u FROM Usuarios_1 u"),
    @NamedQuery(name = "Usuarios_1.findByIdUsuarios", query = "SELECT u FROM Usuarios_1 u WHERE u.idUsuarios = :idUsuarios"),
    @NamedQuery(name = "Usuarios_1.findByNombre", query = "SELECT u FROM Usuarios_1 u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios_1.findByPassword", query = "SELECT u FROM Usuarios_1 u WHERE u.password = :password"),
    @NamedQuery(name = "Usuarios_1.findByFecha", query = "SELECT u FROM Usuarios_1 u WHERE u.fecha = :fecha"),
    @NamedQuery(name = "Usuarios_1.findByStatus", query = "SELECT u FROM Usuarios_1 u WHERE u.status = :status")})
public class Usuarios_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usuarios")
    private Integer idUsuarios;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "password")
    private String password;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "status")
    private String status;

    public Usuarios_1() {
    }

    public Usuarios_1(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public Integer getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Integer idUsuarios) {
        Integer oldIdUsuarios = this.idUsuarios;
        this.idUsuarios = idUsuarios;
        changeSupport.firePropertyChange("idUsuarios", oldIdUsuarios, idUsuarios);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarios != null ? idUsuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios_1)) {
            return false;
        }
        Usuarios_1 other = (Usuarios_1) object;
        if ((this.idUsuarios == null && other.idUsuarios != null) || (this.idUsuarios != null && !this.idUsuarios.equals(other.idUsuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Usuarios_1[ idUsuarios=" + idUsuarios + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
