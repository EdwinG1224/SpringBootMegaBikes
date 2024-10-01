package co.edu.sena.MegaBikes.SpringBoot.MotoServiceTest;

import co.edu.sena.MegaBikes.SpringBoot.Repositories.MotoRepository;
import co.edu.sena.MegaBikes.SpringBoot.Services.MotoImplService;
import co.edu.sena.MegaBikes.SpringBoot.entities.Moto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class MotoServiceTest {

    @Mock

    MotoRepository motoRepository;

    @InjectMocks
    MotoImplService motoService;

    @BeforeEach
    public void setUp(){

        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetMotos() {
        Moto moto1 = new Moto(1L, "Kawasaki", "ZX10R", 3214L, 4123L, 1L);
        Moto moto2 = new Moto(2L, "BMW", "S1000RR", 9876L, 6789L, 1L);

        when(motoRepository.findAll()).thenReturn(Arrays.asList(moto1, moto2));

        List<Moto> motos = motoService.getMotos();
        assertEquals(2, motos.size());
        verify(motoRepository, times(1)).findAll();
    }
    
}
