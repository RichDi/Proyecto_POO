/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo.Tables;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @NamedQuery(name = "Autores.findAll", query = "SELECT a FROM Autores a")
    , @NamedQuery(name = "Autores.findByIdAutor", query = "SELECT a FROM Autores a WHERE a.idAutor = :idAutor")
    , @NamedQuery(name = "Autores.findByNombre", query = "SELECT a FROM Autores a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Autores.findByIdNacionalidad", query = "SELECT a FROM Autores a WHERE a.idNacionalidad = :idNacionalidad")
    , @NamedQuery(name = "Autores.findByEmail", query = "SELECT a FROM Autores a WHERE a.email = :email")})
public class Autores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_autor")
    private Integer idAutor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    @Column(name = "email")
    private String email;

    public Autores() {
    }

    public Autores(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        Integer oldIdAutor = this.idAutor;
        this.idAutor = idAutor;
        changeSupport.firePropertyChange("idAutor", oldIdAutor, idAutor);
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
        hash += (idAutor != null ? idAutor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autores)) {
            return false;
        }
        Autores other = (Autores) object;
        if ((this.idAutor == null && other.idAutor != null) || (this.idAutor != null && !this.idAutor.equals(other.idAutor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Tables.Autores[ idAutor=" + idAutor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
