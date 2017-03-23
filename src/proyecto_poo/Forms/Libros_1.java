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
@Table(name = "libros", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Libros_1.findAll", query = "SELECT l FROM Libros_1 l"),
    @NamedQuery(name = "Libros_1.findByIdLibros", query = "SELECT l FROM Libros_1 l WHERE l.idLibros = :idLibros"),
    @NamedQuery(name = "Libros_1.findByTitulo", query = "SELECT l FROM Libros_1 l WHERE l.titulo = :titulo"),
    @NamedQuery(name = "Libros_1.findByIdEditorial", query = "SELECT l FROM Libros_1 l WHERE l.idEditorial = :idEditorial"),
    @NamedQuery(name = "Libros_1.findByIdAutor", query = "SELECT l FROM Libros_1 l WHERE l.idAutor = :idAutor"),
    @NamedQuery(name = "Libros_1.findByNoPaginas", query = "SELECT l FROM Libros_1 l WHERE l.noPaginas = :noPaginas"),
    @NamedQuery(name = "Libros_1.findByIdNacionalidad", query = "SELECT l FROM Libros_1 l WHERE l.idNacionalidad = :idNacionalidad")})
public class Libros_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_libros")
    private Integer idLibros;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "id_editorial")
    private Integer idEditorial;
    @Column(name = "id_autor")
    private Integer idAutor;
    @Column(name = "no_paginas")
    private Integer noPaginas;
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;

    public Libros_1() {
    }

    public Libros_1(Integer idLibros) {
        this.idLibros = idLibros;
    }

    public Integer getIdLibros() {
        return idLibros;
    }

    public void setIdLibros(Integer idLibros) {
        Integer oldIdLibros = this.idLibros;
        this.idLibros = idLibros;
        changeSupport.firePropertyChange("idLibros", oldIdLibros, idLibros);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        String oldTitulo = this.titulo;
        this.titulo = titulo;
        changeSupport.firePropertyChange("titulo", oldTitulo, titulo);
    }

    public Integer getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Integer idEditorial) {
        Integer oldIdEditorial = this.idEditorial;
        this.idEditorial = idEditorial;
        changeSupport.firePropertyChange("idEditorial", oldIdEditorial, idEditorial);
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        Integer oldIdAutor = this.idAutor;
        this.idAutor = idAutor;
        changeSupport.firePropertyChange("idAutor", oldIdAutor, idAutor);
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        Integer oldNoPaginas = this.noPaginas;
        this.noPaginas = noPaginas;
        changeSupport.firePropertyChange("noPaginas", oldNoPaginas, noPaginas);
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        Integer oldIdNacionalidad = this.idNacionalidad;
        this.idNacionalidad = idNacionalidad;
        changeSupport.firePropertyChange("idNacionalidad", oldIdNacionalidad, idNacionalidad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibros != null ? idLibros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros_1)) {
            return false;
        }
        Libros_1 other = (Libros_1) object;
        if ((this.idLibros == null && other.idLibros != null) || (this.idLibros != null && !this.idLibros.equals(other.idLibros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Libros_1[ idLibros=" + idLibros + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
