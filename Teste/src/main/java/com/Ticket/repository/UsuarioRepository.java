package com.Ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ticket.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

}
