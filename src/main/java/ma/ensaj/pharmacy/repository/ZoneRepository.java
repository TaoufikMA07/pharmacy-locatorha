package ma.ensaj.pharmacy.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaj.pharmacy.entities.Zone;


public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	
	Zone findById(int id);

}


