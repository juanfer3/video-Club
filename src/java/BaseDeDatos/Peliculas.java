/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "peliculas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peliculas.findAll", query = "SELECT p FROM Peliculas p")
    , @NamedQuery(name = "Peliculas.findById", query = "SELECT p FROM Peliculas p WHERE p.id = :id")
    , @NamedQuery(name = "Peliculas.findByNombre", query = "SELECT p FROM Peliculas p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Peliculas.findByGenero", query = "SELECT p FROM Peliculas p WHERE p.genero = :genero")
    , @NamedQuery(name = "Peliculas.findByDuracion", query = "SELECT p FROM Peliculas p WHERE p.duracion = :duracion")
    , @NamedQuery(name = "Peliculas.findByCalificacion", query = "SELECT p FROM Peliculas p WHERE p.calificacion = :calificacion")
    , @NamedQuery(name = "Peliculas.findByEstado", query = "SELECT p FROM Peliculas p WHERE p.estado = :estado")
    , @NamedQuery(name = "Peliculas.findByEjemplares", query = "SELECT p FROM Peliculas p WHERE p.ejemplares = :ejemplares")
    , @NamedQuery(name = "Peliculas.findByImg", query = "SELECT p FROM Peliculas p WHERE p.img = :img")
    , @NamedQuery(name = "Peliculas.findByHabilitado", query = "SELECT p FROM Peliculas p WHERE p.habilitado = :habilitado")})
public class Peliculas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    @Temporal(TemporalType.TIME)
    private Date duracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "calificacion")
    private String calificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ejemplares")
    private int ejemplares;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "img")
    private String img;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;

    public Peliculas() {
    }

    public Peliculas(Integer id) {
        this.id = id;
    }

    public Peliculas(Integer id, String nombre, String genero, Date duracion, String calificacion, String estado, int ejemplares, String img, String habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.estado = estado;
        this.ejemplares = ejemplares;
        this.img = img;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peliculas)) {
            return false;
        }
        Peliculas other = (Peliculas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Peliculas[ id=" + id + " ]";
    }
    
}
