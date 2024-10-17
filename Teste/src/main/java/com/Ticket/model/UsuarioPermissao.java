package com.Ticket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "usuario_permissao", schema = "ticket")
public class UsuarioPermissao {

	@Id
    @Column(name = "usuario_id_usuario")
    private Long usuarioId; // ID do usuário

	
    @Column(name = "permissao_id_permissao") 
    private int permissaoId; // ID da permissão

    // Getters e Setters
    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

	public int getPermissaoId() {
		return permissaoId;
	}

	public void setPermissaoId(int permissaoId) {
		this.permissaoId = permissaoId;
	}


}
