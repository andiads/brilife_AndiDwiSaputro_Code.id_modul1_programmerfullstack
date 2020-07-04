package com.nusacamp.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.nusacamp.app.repository.ListPropinsiRepository;
import com.nusacamp.app.model.ListPropinsi;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ListPropinsiService {
	
	private final ListPropinsiRepository listPropinsiRepo;
	
	public List<ListPropinsi> getAll() {
		return listPropinsiRepo.findAll();
	}
	
	public void savePropinsi(ListPropinsi lp) {
		listPropinsiRepo.save(lp);
	}
	
	public ListPropinsi getById(int id) {
		return this.listPropinsiRepo.findById(id).get();
	}
	
	public Optional<ListPropinsi> findById(int id) {
		return this.listPropinsiRepo.findById(id);
	}
	
	public long getCountPropinsi() {
		return this.listPropinsiRepo.count();
	}
}
