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

import ma.ensaj.pharmacy.entities.PharmacieDeGarde;
import ma.ensaj.pharmacy.repository.PharmacieDeGardeRepository;

@RestController
@RequestMapping("pharmacieDeGardes")
public class PharmacieDeGardeController {

	@Autowired
	private PharmacieDeGardeRepository repository;

	@PostMapping("/save")
	public void save(@RequestBody PharmacieDeGarde PharmacieDeGarde) {
		repository.save(PharmacieDeGarde);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		PharmacieDeGarde s = repository.findById(Integer.parseInt(id));
		repository.delete(s);
	}

	@GetMapping("/all")
	public List<PharmacieDeGarde> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/count")
	public long countPharmacieDeGarde() {
		return repository.count();
	}

}
