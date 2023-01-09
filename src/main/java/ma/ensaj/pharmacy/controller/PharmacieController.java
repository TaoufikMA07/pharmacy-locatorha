package ma.ensaj.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.ensaj.pharmacy.entities.Pharmacie;
import ma.ensaj.pharmacy.repository.PharmacieRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("pharmacies")
public class PharmacieController {

	@Autowired
	private PharmacieRepository repository;

	@PostMapping("/save")
	public void save(@RequestBody Pharmacie Pharmacie) {
		repository.save(Pharmacie);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie s = repository.findById(Integer.parseInt(id));
		repository.delete(s);
	}
	@GetMapping("/all")
	public List<Pharmacie> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/count")
	public long countPharmacie() {
		return repository.count();
	}

}
