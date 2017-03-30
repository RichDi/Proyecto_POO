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
@Table(name = "libros", catalog = "fpoo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Libros.findAll", query = "SELECT l FROM Libros l")
    , @NamedQuery(name = "Libros.findByIdLibro", query = "SELECT l FROM Libros l WHERE l.idLibro = :idLibro")
    , @NamedQuery(name = "Libros.findByTitulo", query = "SELECT l FROM Libros l WHERE l.titulo = :titulo")
    , @NamedQuery(name = "Libros.findByIdEditorial", query = "SELECT l FROM Libros l WHERE l.idEditorial = :idEditorial")
    , @NamedQuery(name = "Libros.findByIdAutor", query = "SELECT l FROM Libros l WHERE l.idAutor = :idAutor")
    , @NamedQuery(name = "Libros.findByNoPaginas", query = "SELECT l FROM Libros l WHERE l.noPaginas = :noPaginas")
    , @NamedQuery(name = "Libros.findByIdNacionalidad", query = "SELECT l FROM Libros l WHERE l.idNacionalidad = :idNacionalidad")})
public class Libros implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro")
    private Integer idLibro;
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

    public Libros() {
    }

    public Libros(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        Integer oldIdLibro = this.idLibro;
        this.idLibro = idLibro;
        changeSupport.firePropertyChange("idLibro", oldIdLibro, idLibro);
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
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_poo.Tables.Libros[ idLibro=" + idLibro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
