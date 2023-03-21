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

import gestion.packages.entities.Zone;

import gestion.packages.services.ZoneService;

@RestController
@RequestMapping("api/zone")
public class ZoneController {
	@Autowired
	private ZoneService zoneServ;

	@PostMapping("/save")
	public void save(@RequestBody Zone zone) {
		zoneServ.save(zone);
	}

	@GetMapping("/{id}")
	public Zone findById(@PathVariable int id) {
		return zoneServ.findById(id);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return zoneServ.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone z = zoneServ.findById(Integer.parseInt(id));
		zoneServ.delete(z);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody Zone zone) {
		Zone z = zoneServ.findById(Integer.parseInt(id));
		z.setNom(zone.getNom());
		zoneServ.update(z);
	}

}
