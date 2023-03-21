package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.Role;
import gestion.packages.idao.IDao;

import gestion.packages.repositories.RoleRep;

@Service
public class RoleService implements IDao<Role> {
	@Autowired
	private RoleRep roleRep;

	@Override
	public Role save(Role o) {

		return roleRep.save(o);
	}

	@Override
	public Role findById(int id) {

		return roleRep.findById(id);
	}

	@Override
	public List<Role> findAll() {
		return roleRep.findAll();
	}

	@Override
	public void delete(Role o) {
		roleRep.delete(o);

	}

	@Override
	public void update(Role o) {
		roleRep.save(o);

	}

}
