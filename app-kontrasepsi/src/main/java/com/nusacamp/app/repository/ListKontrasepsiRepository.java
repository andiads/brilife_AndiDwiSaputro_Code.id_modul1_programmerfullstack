package com.nusacamp.app.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nusacamp.app.model.ListKontrasepsi;

@Repository
public interface ListKontrasepsiRepository extends JpaRepository<ListKontrasepsi, Integer> {
	
}
