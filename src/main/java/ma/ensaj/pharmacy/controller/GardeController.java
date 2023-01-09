package ma.ensaj.pharmacy.controller;

import  java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensaj.pharmacy.entities.Garde;
import ma.ensaj.pharmacy.repository.GardeRepository;

@RestController
@RequestMapping("gardes")
public class GardeController {
	@Autowired
	private GardeRepository repository;

	@PostMapping("/save")
	public void save(@RequestBody Garde Garde) {
		repository.save(Garde);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Garde s = repository.findById(Integer.parseInt(id));
		repository.delete(s);
	}

	@GetMapping("/all")
	public List<Garde> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/count")
	public long countGarde() {
		return repository.count();
	}

}
