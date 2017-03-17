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
@Table(name = "nacionalidades", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nacionalidades_1.findAll", query = "SELECT n FROM Nacionalidades_1 n"),
    @NamedQuery(name = "Nacionalidades_1.findByIdNacionalidades", query = "SELECT n FROM Nacionalidades_1 n WHERE n.idNacionalidades = :idNacionalidades"),
    @NamedQuery(name = "Nacionalidades_1.findByDescripcion", query = "SELECT n FROM Nacionalidades_1 n WHERE n.descripcion = :descripcion")})
public class Nacionalidades_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_nacionalidades")
    private Integer idNacionalidades;
    @Column(name = "descripcion")
    private String descripcion;

    public Nacionalidades_1() {
    }

    public Nacionalidades_1(Integer idNacionalidades) {
        this.idNacionalidades = idNacionalidades;
    }

    public Integer getIdNacionalidades() {
        return idNacionalidades;
    }

    public void setIdNacionalidades(Integer idNacionalidades) {
        Integer oldIdNacionalidades = this.idNacionalidades;
        this.idNacionalidades = idNacionalidades;
        changeSupport.firePropertyChange("idNacionalidades", oldIdNacionalidades, idNacionalidades);
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
        hash += (idNacionalidades != null ? idNacionalidades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nacionalidades_1)) {
            return false;
        }
        Nacionalidades_1 other = (Nacionalidades_1) object;
        if ((this.idNacionalidades == null && other.idNacionalidades != null) || (this.idNacionalidades != null && !this.idNacionalidades.equals(other.idNacionalidades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Nacionalidades_1[ idNacionalidades=" + idNacionalidades + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
