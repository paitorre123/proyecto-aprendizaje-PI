package cl.empleados;

public class SecretarioEmpleado implements IEmpleado{
	
	private IUsableInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	
	
	public IUsableInformes getInformeNuevo() {
		return informeNuevo;
	}

	public void setInformeNuevo(IUsableInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTarea() {
		return "Secretario gestiona la Agenda del Jefe";
	}

	@Override
	public String getInformes() {
		return "Informe generado por el secretario: "+ informeNuevo.getInforme();
	}
	

}
