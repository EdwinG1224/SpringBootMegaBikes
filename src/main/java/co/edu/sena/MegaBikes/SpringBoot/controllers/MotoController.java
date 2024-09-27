package co.edu.sena.MegaBikes.SpringBoot.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.sena.MegaBikes.SpringBoot.Services.*;
import co.edu.sena.MegaBikes.SpringBoot.entities.*;

// Con esta notación ya estamos confirmando que esta clase será nuestro controlador
@RestController

public class MotoController {

    @Autowired
    MotoService motoService;

// Con esta notación traemos los datos de las motos
    @GetMapping("/motos")
    public List<Moto> findAllMotos(){
        return motoService.getMotos();
    } 

}
