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
@Table(name = "nacionalidades", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nacionalidades.findAll", query = "SELECT n FROM Nacionalidades n")
    , @NamedQuery(name = "Nacionalidades.findByIdNacionalidad", query = "SELECT n FROM Nacionalidades n WHERE n.idNacionalidad = :idNacionalidad")
    , @NamedQuery(name = "Nacionalidades.findByDescripcion", query = "SELECT n FROM Nacionalidades n WHERE n.descripcion = :descripcion")})
public class Nacionalidades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    @Column(name = "descripcion")
    private String descripcion;

    public Nacionalidades() {
    }

    public Nacionalidades(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        Integer oldIdNacionalidad = this.idNacionalidad;
        this.idNacionalidad = idNacionalidad;
        changeSupport.firePropertyChange("idNacionalidad", oldIdNacionalidad, idNacionalidad);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNacionalidad != null ? idNacionalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nacionalidades)) {
            return false;
        }
        Nacionalidades other = (Nacionalidades) object;
        if ((this.idNacionalidad == null && other.idNacionalidad != null) || (this.idNacionalidad != null && !this.idNacionalidad.equals(other.idNacionalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Tables.Nacionalidades[ idNacionalidad=" + idNacionalidad + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
