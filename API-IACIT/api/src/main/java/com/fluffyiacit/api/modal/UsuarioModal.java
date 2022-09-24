package com.fluffyiacit.api.modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
@ToString
public class UsuarioModal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codUsuario")
	private Integer codUsuario;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "senha")
	private String senha;

	


}
