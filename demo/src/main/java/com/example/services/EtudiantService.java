package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Etudiant;
import com.example.model.MessageResponse;
import com.example.repositories.EtudiantRepository;

@Service
public class EtudiantService {
	@Autowired
	private EtudiantRepository etudiantRepository;

	public MessageResponse save(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
		return new MessageResponse(true, "Success", "Etudiant enregistré avec succées");
	}

	public MessageResponse update(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
		return new MessageResponse(true, "Success", "Etudiant modifié avec succées");
	}

	public MessageResponse delete(Long id) {
		etudiantRepository.deleteById(id);
		return new MessageResponse(true, "Success", "Etudiant supprimé avec succées");
	}

	public List<Etudiant> findAll() {
		return etudiantRepository.findAll();
	}

	public Etudiant findById(Long id) {

		return etudiantRepository.findById(id).orElse(null);
	}

}
