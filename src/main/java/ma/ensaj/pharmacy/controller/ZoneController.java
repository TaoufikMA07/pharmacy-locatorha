package ma.ensaj.pharmacy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensaj.pharmacy.entities.Zone;
import ma.ensaj.pharmacy.repository.ZoneRepository;

@RestController
@RequestMapping("zones")
public class ZoneController {

	@Autowired
	private ZoneRepository repository;

	@PostMapping("/save")
	public void save(@RequestBody Zone Zone) {
		repository.save(Zone);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone s = repository.findById(Integer.parseInt(id));
		repository.delete(s);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/count")
	public long countZone() {
		return repository.count();
	}

}
