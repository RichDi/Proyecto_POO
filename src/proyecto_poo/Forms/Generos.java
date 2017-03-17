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
@Table(name = "generos", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Generos.findAll", query = "SELECT g FROM Generos g"),
    @NamedQuery(name = "Generos.findByIdGeneros", query = "SELECT g FROM Generos g WHERE g.idGeneros = :idGeneros"),
    @NamedQuery(name = "Generos.findByDescripcion", query = "SELECT g FROM Generos g WHERE g.descripcion = :descripcion")})
public class Generos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_generos")
    private Integer idGeneros;
    @Column(name = "descripcion")
    private String descripcion;

    public Generos() {
    }

    public Generos(Integer idGeneros) {
        this.idGeneros = idGeneros;
    }

    public Integer getIdGeneros() {
        return idGeneros;
    }

    public void setIdGeneros(Integer idGeneros) {
        Integer oldIdGeneros = this.idGeneros;
        this.idGeneros = idGeneros;
        changeSupport.firePropertyChange("idGeneros", oldIdGeneros, idGeneros);
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
        hash += (idGeneros != null ? idGeneros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Generos)) {
            return false;
        }
        Generos other = (Generos) object;
        if ((this.idGeneros == null && other.idGeneros != null) || (this.idGeneros != null && !this.idGeneros.equals(other.idGeneros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Generos[ idGeneros=" + idGeneros + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
