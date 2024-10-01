// MotoImplementationServices -> Esta si lleva lógica

package co.edu.sena.MegaBikes.SpringBoot.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.sena.MegaBikes.SpringBoot.Repositories.MotoRepository;
import co.edu.sena.MegaBikes.SpringBoot.entities.Moto;

@Service
public class MotoImplService implements MotoService {
    
    @Autowired
    private MotoRepository motoRepository;

    @Override
    public List<Moto> getMotos() {
        return motoRepository.findAll();
    }
}
