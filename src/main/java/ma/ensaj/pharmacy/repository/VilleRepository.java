package ma.ensaj.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaj.pharmacy.entities.Ville;


public interface VilleRepository extends JpaRepository<Ville, Integer> {
	
	Ville findById(int id);

}
