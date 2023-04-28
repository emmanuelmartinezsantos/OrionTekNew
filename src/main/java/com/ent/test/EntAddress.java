package com.ent.test;

import javax.persistence.*;

@Entity
public class EntAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "direccion")
    private EntCliente cliente;

    @Column(name="Name")
    private String name;

    @Column(name="Calle")
    private String calle;

    @Column(name="Sector")
    private String sector;

    @Column(name="ProvinciaEstado")
    private String provinciaEstado;

    @Column(name="Pais")
    private String pais;


    public void setCliente(EntCliente cliente) {
        this.cliente = cliente;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getProvinciaEstado() {
        return provinciaEstado;
    }

    public void setProvinciaEstado(String provinciaEstado) {
        this.provinciaEstado = provinciaEstado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}