package ma.ensaj.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaj.pharmacy.entities.PharmacieDeGarde;


public interface PharmacieDeGardeRepository extends JpaRepository<PharmacieDeGarde, Integer> {
	
	PharmacieDeGarde findById(int id);

}
