package com.Ticket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ticket.model.UsuarioModel;
import com.Ticket.model.UsuarioPermissao;
import com.Ticket.repository.UsuarioPermissaoRepository;
import com.Ticket.repository.UsuarioRepository;


@Service
public class UsuarioService {
	 
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private  UsuarioPermissaoRepository usuarioPermissaoRepository;

	
	
	   public void salvarUsuario(UsuarioModel usuario) {
	    // Salvar o usuário
	    UsuarioModel usuarioSalvo = usuarioRepository.save(usuario);
	    Long usuarioIdSalvo = usuarioSalvo.getId_usuario();
	    int usuarioPermissaoSalva = usuarioSalvo.getPermissao();

	    // Criar e salvar UsuarioPermissao
	    UsuarioPermissao usuarioPermissao = new UsuarioPermissao();
	    usuarioPermissao.setUsuarioId(usuarioIdSalvo);
	    usuarioPermissao.setPermissaoId(usuarioPermissaoSalva); // Assumindo que existe um método para isso
	    usuarioPermissaoRepository.save(usuarioPermissao);

	}

}
