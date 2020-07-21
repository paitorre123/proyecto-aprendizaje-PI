package cl.empleados;

public class DirectorEmpleado  implements IEmpleado{
	
	private ICreacionInformes informeNuevo;
	
	//Dependencia del informe
	public DirectorEmpleado(ICreacionInformes informeNuevo) {
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
