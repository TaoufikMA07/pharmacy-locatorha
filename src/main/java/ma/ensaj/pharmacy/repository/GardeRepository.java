package ma.ensaj.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaj.pharmacy.entities.Garde;


public interface GardeRepository extends JpaRepository<Garde, Integer> {
	
	Garde findById(int id);

}
