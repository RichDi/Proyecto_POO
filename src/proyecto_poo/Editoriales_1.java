/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

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
@Table(name = "editoriales", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Editoriales_1.findAll", query = "SELECT e FROM Editoriales_1 e"),
    @NamedQuery(name = "Editoriales_1.findByIdEditoriales", query = "SELECT e FROM Editoriales_1 e WHERE e.idEditoriales = :idEditoriales"),
    @NamedQuery(name = "Editoriales_1.findByNombre", query = "SELECT e FROM Editoriales_1 e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Editoriales_1.findByDireccion", query = "SELECT e FROM Editoriales_1 e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Editoriales_1.findByEmail", query = "SELECT e FROM Editoriales_1 e WHERE e.email = :email"),
    @NamedQuery(name = "Editoriales_1.findByTelefonos", query = "SELECT e FROM Editoriales_1 e WHERE e.telefonos = :telefonos"),
    @NamedQuery(name = "Editoriales_1.findByContacto", query = "SELECT e FROM Editoriales_1 e WHERE e.contacto = :contacto")})
public class Editoriales_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_editoriales")
    private Integer idEditoriales;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "email")
    private String email;
    @Column(name = "telefonos")
    private String telefonos;
    @Column(name = "contacto")
    private String contacto;

    public Editoriales_1() {
    }

    public Editoriales_1(Integer idEditoriales) {
        this.idEditoriales = idEditoriales;
    }

    public Integer getIdEditoriales() {
        return idEditoriales;
    }

    public void setIdEditoriales(Integer idEditoriales) {
        Integer oldIdEditoriales = this.idEditoriales;
        this.idEditoriales = idEditoriales;
        changeSupport.firePropertyChange("idEditoriales", oldIdEditoriales, idEditoriales);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        String oldTelefonos = this.telefonos;
        this.telefonos = telefonos;
        changeSupport.firePropertyChange("telefonos", oldTelefonos, telefonos);
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        String oldContacto = this.contacto;
        this.contacto = contacto;
        changeSupport.firePropertyChange("contacto", oldContacto, contacto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEditoriales != null ? idEditoriales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editoriales_1)) {
            return false;
        }
        Editoriales_1 other = (Editoriales_1) object;
        if ((this.idEditoriales == null && other.idEditoriales != null) || (this.idEditoriales != null && !this.idEditoriales.equals(other.idEditoriales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Editoriales_1[ idEditoriales=" + idEditoriales + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
