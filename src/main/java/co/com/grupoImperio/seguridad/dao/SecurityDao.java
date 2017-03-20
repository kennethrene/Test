package co.com.grupoImperio.seguridad.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import co.com.grupoImperio.seguridad.entidades.Usuario;

@SuppressWarnings("serial")
@Stateless
public class SecurityDao implements Serializable {

	@PersistenceContext(name = "ImperioPersisRS")
	private EntityManager em;

	public Usuario getUsuario(String username, String password)
			throws Exception {
		Usuario user = null;

		try {
			user = (Usuario) em
					.createQuery(
							"SELECT u FROM Usuario u WHERE u.username = :username AND u.password = :password AND u.activo = 'S'")
					.setParameter("username", username)
					.setParameter("password", password).getSingleResult();
		} catch (NoResultException e) {
			user = null;
		}

		return user;
	}
}