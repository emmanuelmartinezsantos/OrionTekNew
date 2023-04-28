package com.ent.test;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class EntCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Long getId() {
        return id;
    }

    @Column(name="NOMBRE")
    private String name;

    @Column(name="EDAD")
    private String edad;

    @Column(name="SEXO")
    private String sex;


    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
    private List<EntAddress> direccion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<EntAddress> getDireccion() {
        return direccion;
    }

    public void setDireccion(List<EntAddress> direccion) {
        this.direccion = direccion;
    }
}