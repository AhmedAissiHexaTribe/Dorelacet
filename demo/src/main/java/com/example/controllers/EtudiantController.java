package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Etudiant;
import com.example.model.MessageResponse;
import com.example.services.EtudiantService;

@CrossOrigin("*")
@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
	@Autowired
	private EtudiantService etudiantService;

	@PostMapping
	public MessageResponse saveEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.save(etudiant);

	}

	@PutMapping
	public MessageResponse updateEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.update(etudiant);

	}

	@DeleteMapping
	public MessageResponse deleteEtudiant(@PathVariable Long id) {
		return etudiantService.delete(id);

	}

	@GetMapping
	public List<Etudiant> getAllEtudiant() {
		return etudiantService.findAll();
	}

	@GetMapping("/{id}")
	public Etudiant getEtudiantById(@PathVariable Long id) {
		return etudiantService.findById(id);
	}

}
