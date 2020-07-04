package com.nusacamp.app.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nusacamp.app.model.ListPropinsi;
import com.nusacamp.app.repository.ListPropinsiRepository;
import com.nusacamp.app.service.ListPropinsiService;

import com.nusacamp.app.model.ListKontrasepsi;
import com.nusacamp.app.repository.ListKontrasepsiRepository;
import com.nusacamp.app.service.ListKontrasepsiService;

import com.nusacamp.app.model.ListPemakaiKontrasepsi;
import com.nusacamp.app.repository.ListPemakaiKontrasepsiRepository;
import com.nusacamp.app.service.ListPemakaiKontrasepsiService;


import lombok.RequiredArgsConstructor;

import com.nusacamp.app.model.ViewReportEntity;

@Controller
@RequestMapping("/index")
@RequiredArgsConstructor
public class ListPemakaiKontrasepsiController {

	private final ListPropinsiService listPropinsiSvc;
	
	private final ListKontrasepsiService listKontrasepsiSvc;
	
	private final ListPemakaiKontrasepsiService listPemakaiSvc;
	
	
	@GetMapping
	public String listPemakai(Model model) {
		model.addAttribute("pemakaiKontrasepsi", new ListPemakaiKontrasepsi());
		model.addAttribute("list", listPemakaiSvc.getAll());
		return "index";
	}
	
	@GetMapping(value = "/add")
	public String addPemakai(Model model) {
		List<ListPropinsi> listPropinsi = listPropinsiSvc.getAll();
		List<ListKontrasepsi> listKontrasepsi = listKontrasepsiSvc.getAll();
		model.addAttribute("listPropinsi", listPropinsi);
		model.addAttribute("listKontrasepsi", listKontrasepsi);
		model.addAttribute("listPemakai", new ListPemakaiKontrasepsi());
		return "entry";
	}
	
	@PostMapping(value = "/save") 
	public String savePemakai(ListPemakaiKontrasepsi listPemakai) {
		listPemakaiSvc.savePemakai(listPemakai);
		return "redirect:/index";
	}
	
	@GetMapping(value = "/report")
	public String viewReport(Model model) {
		
		long countPropinsi = listPropinsiSvc.getCountPropinsi();
		
		List<ListPropinsi> listPropinsi = listPropinsiSvc.getAll();
		List<ListKontrasepsi> listKontrasepsi = listKontrasepsiSvc.getAll();
		
		List<Integer> listPemakaiPil = listPemakaiSvc.getCountByAlatKontrasepsi(1);
		List<Integer> listPemakaiKondom = listPemakaiSvc.getCountByAlatKontrasepsi(2);
		List<Integer> listPemakaiIUD = listPemakaiSvc.getCountByAlatKontrasepsi(3);
		
		//model.addAttribute("list", listPemakaiSvc.getAll());
		model.addAttribute("listPemakaiPil", listPemakaiPil);
		model.addAttribute("listPemakaiKondom", listPemakaiKondom);
		model.addAttribute("listPemakaiIUD", listPemakaiIUD);
		
		model.addAttribute("listPropinsi", listPropinsi);
		model.addAttribute("listKontrasepsi", listKontrasepsi);
		return "report";
	}
	
}
