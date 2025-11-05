package mx.uv.listi._9.Saludar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class SaludarControlador {


    @RequestMapping("/")
    public String home() {
        return "<ul><li><a href='/altas'>Altas</a></li><li><a href='/bajas'>Bajas</a></li><li><a href='/cambios'>Cambios</a></li><li><a href='/consultas'>Consultas</a></li></ul>";
    }


    @RequestMapping("/altas")
    public String altas() {
        return "¡altas!";
    }

    @RequestMapping("/bajas")
    public String bajas() {
        return "¡bajas!";
    }

    @RequestMapping("/cambios")
    public String cambios() {
        return "¡cambios!";
    }

    @RequestMapping("/consultas")
    public String consultas() {
        return "¡consultas!";
    }

    //ejemplo de endpoint adecuadosi sigue el rest adwcuados no sigue el modelo rest
    @RequestMapping(value="/Saludar", method = RequestMethod.POST)
    public String altasREST() {
        return "¡altas!";
    }

    @RequestMapping(value="/Saludar", method = RequestMethod.DELETE)
    public String bajasREST() {
        return "¡bajas!";
    }

    @RequestMapping(value="/Saludar", method = RequestMethod.PUT)
    public String cambiosREST() {
        return "¡cambios!";
    }

    @RequestMapping(value="/Saludar", method = RequestMethod.GET)
    public String consultasREST() {
        return "¡consultas!";
    }

    //------------------------------
    @GetMapping("/saludar1/{nombre}")
    public Saludador saludarPath1(@PathVariable String nombre) {
        return new Saludador("Hola " + nombre);
    }

    @RequestMapping(value = "/saludar2/{nombre}", method = RequestMethod.GET)
    public Saludador saludarPath2(@PathVariable String nombre) {
        return new Saludador("Hola " + nombre);
    }
}