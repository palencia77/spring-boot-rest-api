package com.palencia77.modelo;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by palencia77 on 7/19/17.
 */

@Entity
public class Automovil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    @OneToMany(mappedBy = "automovil")
    private Set<Opcional> opcionales;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Opcional> getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(Set<Opcional> opcionales) {
        this.opcionales = opcionales;
    }
}
