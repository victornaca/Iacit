package DTO;

import lombok.Data;

@Data
public class UsuarioRequestDTO {
	
	private String usuario_username;
	
	private String usuario_nome;
	
	private String usuario_senha;
	
	private String usuario_cadastrante;

	private String usuario_nome_adm;
	
	private String nome_permissao;
}
