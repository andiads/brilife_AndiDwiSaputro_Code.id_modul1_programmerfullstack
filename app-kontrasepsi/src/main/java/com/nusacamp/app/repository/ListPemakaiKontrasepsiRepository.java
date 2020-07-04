package com.nusacamp.app.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nusacamp.app.model.ListPemakaiKontrasepsi;

@Repository
public interface ListPemakaiKontrasepsiRepository extends JpaRepository<ListPemakaiKontrasepsi, Integer>{

	// Get Jumlah_Pemakai alat-alat kontrasepsi tiap provinsi
	@Query(
			value="SELECT p.Jumlah_Pemakai FROM list_pemakai_kontrasepsi p INNER JOIN list_propinsi r ON r.Id_Propinsi = p.Id_Propinsi WHERE p.Id_Kontrasepsi = :idKontrasepsi GROUP BY p.Id_Propinsi",
			nativeQuery=true)
	public List<Integer> getCountByAlatKontrasepsi(@Param("idKontrasepsi")Integer idKontrasepsi);
	
	// Get Total Jumlah by Columns 
	@Query(
			value="SELECT SUM(p.Jumlah_Pemakai) FROM list_pemakai_kontrasepsi p INNER JOIN list_propinsi r ON r.Id_Propinsi = p.Id_Propinsi WHERE p.Id_Kontrasepsi = :idKontrasepsi GROUP BY p.Id_Propinsi",
			nativeQuery=true)
	public List<Integer> getSumTotalByColumns(@Param("idKontrasepsi")Integer idKontrasepsi);
	
}
