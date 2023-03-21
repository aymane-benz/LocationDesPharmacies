package gestion.packages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.packages.entities.Pharmacie;

import gestion.packages.services.PharmacieService;

@RestController
@RequestMapping("api/pharmacie")

public class PharmacieController {
	@Autowired
	private PharmacieService pharmService;

	@PostMapping("/save")
	public void save(@RequestBody Pharmacie pharm) {
		pharmService.save(pharm);
	}

	@GetMapping("/all")
	public List<Pharmacie> findAll() {
		return pharmService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie p = pharmService.findById(Integer.parseInt(id));
		pharmService.delete(p);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody Pharmacie pharmacie) {
		Pharmacie p = pharmService.findById(Integer.parseInt(id));
		p.setNom(pharmacie.getNom());
		pharmService.update(p);
	}

	@GetMapping("/{id}")
	public Pharmacie findById(@PathVariable int id) {
		return pharmService.findById(id);
	}

}
