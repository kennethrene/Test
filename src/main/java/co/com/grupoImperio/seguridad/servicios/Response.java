package co.com.grupoImperio.seguridad.servicios;

public class Response {
	private boolean status;
	private String errorMessage;

	public Response() {

	}

	public Response(boolean status, String errorMessage) {
		this.status = status;
		this.errorMessage = errorMessage;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}