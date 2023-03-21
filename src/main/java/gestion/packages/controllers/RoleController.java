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

import gestion.packages.entities.Role;
import gestion.packages.entities.User;
import gestion.packages.services.RoleService;

@RestController
@RequestMapping("api/role")
public class RoleController {
	@Autowired
	private RoleService roleServ;

	@PostMapping("/save")
	public void save(@RequestBody Role role) {
		roleServ.save(role);
	}

	@GetMapping("/all")
	public List<Role> findAll() {
		return roleServ.findAll();
	}
	@GetMapping("/{id}")
	public Role findById(@PathVariable int id) {
		return roleServ.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Role r = roleServ.findById(Integer.parseInt(id));
		roleServ.delete(r);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody User user) {
		Role r  = roleServ.findById(Integer.parseInt(id));
		r.setNom(user.getNom());
		roleServ.update(r);
	}
}
