package co.com.grupoImperio.seguridad.servicios;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import co.com.grupoImperio.seguridad.dao.SecurityDao;
import co.com.grupoImperio.seguridad.entidades.Usuario;

@Path("/")
public class SecurityRS {
	@EJB
	private SecurityDao securityDao;

	@GET
	@Path("/validateCredentials")
	@Produces("application/json")
	public Response validateCredentials(@QueryParam("username") String username, @QueryParam("password") String password) {
		Response resp = new Response();

		try {
			Usuario user = securityDao.getUsuario(username, password);

			if (user != null) {
				resp.setStatus(true);
				resp.setErrorMessage("OK");
			} else {
				resp.setStatus(false);
				resp.setErrorMessage("Wrong user or password");
			}

		} catch (Exception e) {
			resp.setStatus(false);
			resp.setErrorMessage("Technical problems");
		}

		return resp;
	}

}