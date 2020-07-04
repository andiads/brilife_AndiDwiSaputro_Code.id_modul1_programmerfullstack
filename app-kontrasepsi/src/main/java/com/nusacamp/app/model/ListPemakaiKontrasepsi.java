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
@Table(name="list_pemakai_kontrasepsi")
public class ListPemakaiKontrasepsi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_List")
	private int idList;
	@Column(name="Id_Propinsi")
	private int idPropinsi;
	@Column(name="Id_Kontrasepsi")
	private int idKontrasepsi;
	@Column(name="Jumlah_Pemakai")
	private int jumlahPemakai;
	
}
