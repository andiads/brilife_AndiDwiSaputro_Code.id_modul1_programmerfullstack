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
@Table(name="list_kontrasepsi")
public class ListKontrasepsi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Kontrasepsi")
	private int idKontrasepsi;
	
	@Column(name="Nama_Kontrasepsi")
	private String namaKontrasepsi;
	
}
