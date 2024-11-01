package ar.edu.ies6.model.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String getMateria() {
    	
    	    	return "index";
    }


  @GetMapping("materia")
  public String getIndexMateria() {
	  materia unaMateria = new Materia();
	  unaMateria.setNombre("Matematicas");
	  unaMateria.setCodigo("M16");
	  unaMateria.setCredito(6);
  
  }
}

  
  
  
  
	  
  