package br.com.unimontes.modelrn;

import java.util.List;

import br.com.unimontes.model.Usuario;
import br.com.unimontes.modeldao.UsuarioDAO;

public class UsuarioRN {
	public boolean inserirUsuario(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
		return (dao.insertUsuario(usuario));
	}
	public List<Usuario> selectUsuario(){
		UsuarioDAO dao = new UsuarioDAO();
		return (dao.listUsuarios());
	}
}
