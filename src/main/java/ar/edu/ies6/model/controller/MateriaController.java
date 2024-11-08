package ar.edu.ies6.model.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MateriaController {
	@GetMapping(value={"/materia"})
	public String getMateriaController() {
		return ("materia");
}
}

