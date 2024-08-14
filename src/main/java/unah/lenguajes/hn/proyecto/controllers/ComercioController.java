package unah.lenguajes.hn.proyecto.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import unah.lenguajes.hn.proyecto.models.Comercio;
import unah.lenguajes.hn.proyecto.services.ComercioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/comercio")
public class ComercioController {
    
    @Autowired
    private ComercioService comercioService;

    @PostMapping("/crear")
    public String crearComercio(@RequestBody Comercio comercio) {
        return this.comercioService.crearComercio(comercio);
    }

    @GetMapping("/obtener/todos")
    public List<Comercio> obtenerComercios() {
        return this.comercioService.obtenerComercios();
    }
    
    
}
