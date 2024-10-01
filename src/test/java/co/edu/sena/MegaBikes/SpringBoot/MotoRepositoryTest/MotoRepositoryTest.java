package co.edu.sena.MegaBikes.SpringBoot.MotoRepositoryTest;

import co.edu.sena.MegaBikes.SpringBoot.Repositories.MotoRepository;
import co.edu.sena.MegaBikes.SpringBoot.entities.Moto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class MotoRepositoryTest {

    @Autowired
    MotoRepository motoRepository;

    @Test
    public void testFindAll() {
        List<Moto> motos = motoRepository.findAll();
        assertEquals(4, motos.size(), "Debería encontrar 4 motos");
    }
}