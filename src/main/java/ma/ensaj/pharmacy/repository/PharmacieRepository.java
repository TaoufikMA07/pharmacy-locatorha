package ma.ensaj.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaj.pharmacy.entities.Pharmacie;

public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
	
	Pharmacie findById(int id);

}
