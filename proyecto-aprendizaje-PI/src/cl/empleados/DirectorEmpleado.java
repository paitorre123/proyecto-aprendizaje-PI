package cl.empleados;

public class DirectorEmpleado  implements IEmpleado{
	
	private IUsableInformes informeNuevo;
	
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

}
