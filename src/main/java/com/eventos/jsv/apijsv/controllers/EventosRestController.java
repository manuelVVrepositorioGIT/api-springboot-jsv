package com.eventos.jsv.apijsv.controllers;

import org.springframework.web.bind.annotation.*;

import com.eventos.jsv.apijsv.models.entity.Participante;

@RestController
@RequestMapping("/api")
public class EventosRestController {

	@PostMapping("/registro")
	public Participante registrar(@RequestBody Participante participante) {
		return null;
	}
}
