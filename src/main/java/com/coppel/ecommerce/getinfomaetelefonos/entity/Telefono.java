package com.coppel.ecommerce.getinfomaetelefonos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "XMAESTROTELEFONO")
public class Telefono {
    @Id
    @Column(name = "ID_SERIAL")
    private Long id;

    @Column(name = "FECALTA")
    private LocalDateTime fecha;

    @Column(name = "NUM_STATUSTELEFONO")
    private int status;

    @Column(name = "USERS_ID")
    private Long userId;

    @Column(name = "NUM_TELEFONO")
    private Long numTelefono;

    @Column(name = "NOM_EMAIL")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
