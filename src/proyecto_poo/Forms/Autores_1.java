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
@Table(name = "autores", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Autores_1.findAll", query = "SELECT a FROM Autores_1 a"),
    @NamedQuery(name = "Autores_1.findByIdAutores", query = "SELECT a FROM Autores_1 a WHERE a.idAutores = :idAutores"),
    @NamedQuery(name = "Autores_1.findByNombre", query = "SELECT a FROM Autores_1 a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Autores_1.findByIdNacionalidad", query = "SELECT a FROM Autores_1 a WHERE a.idNacionalidad = :idNacionalidad"),
    @NamedQuery(name = "Autores_1.findByEmail", query = "SELECT a FROM Autores_1 a WHERE a.email = :email")})
public class Autores_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_autores")
    private Integer idAutores;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    @Column(name = "email")
    private String email;

    public Autores_1() {
    }

    public Autores_1(Integer idAutores) {
        this.idAutores = idAutores;
    }

    public Integer getIdAutores() {
        return idAutores;
    }

    public void setIdAutores(Integer idAutores) {
        Integer oldIdAutores = this.idAutores;
        this.idAutores = idAutores;
        changeSupport.firePropertyChange("idAutores", oldIdAutores, idAutores);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        Integer oldIdNacionalidad = this.idNacionalidad;
        this.idNacionalidad = idNacionalidad;
        changeSupport.firePropertyChange("idNacionalidad", oldIdNacionalidad, idNacionalidad);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutores != null ? idAutores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autores_1)) {
            return false;
        }
        Autores_1 other = (Autores_1) object;
        if ((this.idAutores == null && other.idAutores != null) || (this.idAutores != null && !this.idAutores.equals(other.idAutores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Autores_1[ idAutores=" + idAutores + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
