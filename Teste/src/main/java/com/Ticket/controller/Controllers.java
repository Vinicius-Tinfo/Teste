package com.Ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Ticket.model.UsuarioModel;
import com.Ticket.services.UsuarioService;


@Controller
public class Controllers {

	
@GetMapping({"/"})
public String Inicio(){
	
	return"page";
}
	
	@Autowired
    private UsuarioService usuarioService; 

    @PostMapping({"/Formulario/salvar"})
    public ModelAndView criarUsuario( UsuarioModel usuario) {
       
        usuarioService.salvarUsuario(usuario);
        
        
        return new ModelAndView("redirect:/");
    }
}
