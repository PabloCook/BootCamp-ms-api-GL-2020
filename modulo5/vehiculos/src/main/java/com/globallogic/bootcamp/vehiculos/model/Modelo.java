package com.globallogic.bootcamp.vehiculos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
//@AllArgsConstructor
@Entity
@Table(name = "modelo")
public class Modelo {

	@Id
	private Integer codigo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "nombre")
	private String nombre;
}
