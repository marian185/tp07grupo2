package ar.edu.ies6.model.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Materia;

public class MateriaController {
	@GetMapping("/materia")
	public String getMateriaController() {
		return "materia";
	}		
		@GetMapping("/Materia")
		public ModelAndView getIndexWithMateria() {
			Materia unaMateria = new Materia ();
			unaMateria.setNombre("matematicas");
			unaMateria.setCodigo("M1243");
			unaMateria.setCreditos(8);
			unaMateria.setProfesor("Dani Vargas");
			
			ModelAndView transportador = new ModelAndView("materia");
			transportador.addObject("materia", unaMateria);
			return transportador;
}
}

