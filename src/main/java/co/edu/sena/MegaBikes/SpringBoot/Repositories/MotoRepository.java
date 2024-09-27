package co.edu.sena.MegaBikes.SpringBoot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.sena.MegaBikes.SpringBoot.entities.Moto;

@Repository
public interface MotoRepository extends JpaRepository<Moto,Long>{
    
}
