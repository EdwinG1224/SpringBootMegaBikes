package co.edu.sena.MegaBikes.SpringBoot.MotoControllerTest;

import co.edu.sena.MegaBikes.SpringBoot.controllers.MotoController;
import co.edu.sena.MegaBikes.SpringBoot.Services.MotoService;
import co.edu.sena.MegaBikes.SpringBoot.entities.Moto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(MotoController.class)
public class MotoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MotoService motoService;

    @InjectMocks
    private MotoController motoController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAllMotos() throws Exception {
        Moto moto1 = new Moto(1L, "Kawasaki", "ZX10R", 3214L, 4123L, 1L);
        Moto moto2 = new Moto(2L, "BMW", "S1000RR", 9876L, 6789L, 1L);
        List<Moto> motos = Arrays.asList(moto1, moto2);

        when(motoService.getMotos()).thenReturn(motos);

        mockMvc.perform(get("/motos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Kawasaki"))
                .andExpect(jsonPath("$[1].name").value("BMW"));
    }
}
