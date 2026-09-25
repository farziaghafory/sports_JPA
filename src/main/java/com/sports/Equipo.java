package com.sports;
import jakarta.persistence.*;

@Entity
@Table(name = "equipo")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Integer idEquipo;
    private String nombre;
    private String pais;
    public Equipo() {
    }
    public Integer getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(){
        this.pais=pais;
    }
}
 