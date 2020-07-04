package com.nusacamp.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.nusacamp.app.model.ListPemakaiKontrasepsi;
import com.nusacamp.app.repository.ListPemakaiKontrasepsiRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ListPemakaiKontrasepsiService {

	private final ListPemakaiKontrasepsiRepository listPemakaiRepo;
	
	public List<ListPemakaiKontrasepsi> getAll() {
		return listPemakaiRepo.findAll();
	}
	
	public void savePemakai(ListPemakaiKontrasepsi listPemakai) {
		this.listPemakaiRepo.save(listPemakai);
	}
	
	public ListPemakaiKontrasepsi getById(int id) {
		return this.listPemakaiRepo.findById(id).get();
	}
	
	public Optional<ListPemakaiKontrasepsi> findById(int id) {
		return this.listPemakaiRepo.findById(id);
	}
	
	public List<Integer> getCountByAlatKontrasepsi(Integer idKontrasepsi) {
		return listPemakaiRepo.getCountByAlatKontrasepsi(idKontrasepsi);
	}
	
	public List<Integer> getSumTotalByColumns(Integer idKontrasepsi) {
		return listPemakaiRepo.getSumTotalByColumns(idKontrasepsi);
	}
}
