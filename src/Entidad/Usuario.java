package Entidad;

public class Usuario {

	private String NombreU;
	private String Contrase�a;
	private Boolean EsAdmin;
	private Boolean Estado;
	
	public Usuario() {
		
	}
	
	public String getNombreU() {
		return NombreU;
	}
	public void setNombreU(String nombreU) {
		NombreU = nombreU;
	}
	public String getContrase�a() {
		return Contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}

	public Boolean getEsAdmin() {
		return EsAdmin;
	}

	public void setEsAdmin(Boolean esAdmin) {
		EsAdmin = esAdmin;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}
	
	
	
	
}
