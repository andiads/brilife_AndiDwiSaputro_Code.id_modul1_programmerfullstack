package com.nusacamp.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="list_propinsi")
public class ListPropinsi {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Propinsi")
	private int idPropinsi;
	@Column(name="Nama_Propinsi")
	private String namaPropinsi;
	
	
}
