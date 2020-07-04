package com.nusacamp.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nusacamp.app.model.ListPropinsi;

@Repository
public interface ListPropinsiRepository extends JpaRepository<ListPropinsi, Integer>{

}
