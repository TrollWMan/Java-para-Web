package br.com.unimontes.modeldao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.unimontes.sessao.HibernateUtil;
import br.com.unimontes.model.Usuario;

public class UsuarioDAO {

	/* Funcao que insere dados na tabela usuario */
	public boolean insertUsuario(Usuario usuario) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = HibernateUtil.getCurrentSession();
			transaction = session.beginTransaction();

			Usuario user = new Usuario();

			user.setNome(usuario.getNome());
			user.setSenha(usuario.getSenha());
			user.setDescricao(usuario.getDescricao());

			session.save(user);

			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	/* Funcao que lista todas as entradas da tabela usuario */
	@SuppressWarnings("unchecked")
	public List<Usuario> listUsuarios() {
		Transaction transaction = null;
		Session session = null;
		List<Usuario> usuario = new ArrayList<Usuario>();
		try {
			session = HibernateUtil.getCurrentSession();
			transaction = session.beginTransaction();

			Query query = session.createQuery("FROM Usuario");

			usuario = query.getResultList();

			transaction.commit();
			return usuario;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}