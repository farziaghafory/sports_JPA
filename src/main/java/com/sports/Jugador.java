package com.sports;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugador")
    private Integer idJugador;
    private String apodo;
    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;
    public Jugador() {
    }
    public Integer getIdJugador() {
        return idJugador;
    }
    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}

