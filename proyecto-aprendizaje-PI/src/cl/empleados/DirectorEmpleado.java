package cl.empleados;

public class DirectorEmpleado  implements IEmpleado{
	
	private IUsableInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	//Dependencia del informe
	public DirectorEmpleado(IUsableInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTarea() {
		// TODO Auto-generated method stub
		return "Director gestiona la Plantilla de la Empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director:"+ this.informeNuevo.getInforme();
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
	
	//metodo init. Ejercutar tareas abtes de que el bean esté disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aquí irian las tareas a ejecutar " + " antes de que el bean este listo");
	}
	//metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas a ejecutar " + "despues de utilizar el bean");
	}
}
