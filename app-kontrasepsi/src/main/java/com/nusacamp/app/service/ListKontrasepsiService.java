package com.nusacamp.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.nusacamp.app.model.ListKontrasepsi;
import com.nusacamp.app.repository.ListKontrasepsiRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ListKontrasepsiService {

	private final ListKontrasepsiRepository listKontrasepsiRepo;
	
	public List<ListKontrasepsi> getAll() {
		return listKontrasepsiRepo.findAll();
	}
	
	public void saveKontrasepsi(ListKontrasepsi listKontrasepsi) {
		this.listKontrasepsiRepo.save(listKontrasepsi);
	}
	
	public ListKontrasepsi getById(int id) {
		return this.listKontrasepsiRepo.findById(id).get();
	}
	
	public Optional<ListKontrasepsi> findById(int id) {
		return this.listKontrasepsiRepo.findById(id);
	}
}
