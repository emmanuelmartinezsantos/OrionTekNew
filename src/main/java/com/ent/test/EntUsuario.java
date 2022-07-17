package com.ent.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntUsuario {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="EDAD")
	private String edad;
	
	@Column(name="SEXO")
	private String sex;
	
	@Column(name="DIRECCION")
	private String direccion;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}
	
	
}

