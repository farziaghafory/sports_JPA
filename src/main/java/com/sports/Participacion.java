package com.sports;
import jakarta.persistence.*;

@Entity
@Table(name = "participacion")
public class Participacion {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}

