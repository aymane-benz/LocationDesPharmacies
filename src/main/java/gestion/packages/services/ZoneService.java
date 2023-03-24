package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.Zone;
import gestion.packages.idao.IDao;
import gestion.packages.repositories.ZoneRep;

@Service
public class ZoneService implements IDao<Zone> {
	@Autowired
	private ZoneRep zoneRep;

	@Override
	public Zone save(Zone o) {

		return zoneRep.save(o);
	}

	@Override
	public Zone findById(int id) {

		return zoneRep.findById(id);
	}

	@Override
	public List<Zone> findAll() {

		return zoneRep.findAll();
	}

	@Override
	public void delete(Zone o) {
		zoneRep.delete(o);

	}

	@Override
	public void update(Zone o) {
		zoneRep.save(o);

	}
	  public List<Zone> findAllByVille(String nom){

	        return zoneRep.findZoneByVille(nom);
	    }

}
