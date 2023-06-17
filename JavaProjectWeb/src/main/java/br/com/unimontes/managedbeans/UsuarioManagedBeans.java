package br.com.unimontes.managedbeans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.unimontes.model.Usuario;
import br.com.unimontes.modelrn.UsuarioRN;

@ManagedBean(name = "UsuarioMB")
public class UsuarioManagedBeans {

	private Usuario usuario = new Usuario();

	public String cadastraUsuario() {
		UsuarioRN rn = new UsuarioRN();

		if (rn.inserirUsuario(usuario)) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Usuario cadastrado com sucesso!"));
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Erro no cadastro de usuario!"));

		}	
		return "";
	}

	public List<Usuario> getUsuarios(){

		UsuarioRN rn = new UsuarioRN();
		List<Usuario> listaUsuarios = rn.selectUsuario();

		return listaUsuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
