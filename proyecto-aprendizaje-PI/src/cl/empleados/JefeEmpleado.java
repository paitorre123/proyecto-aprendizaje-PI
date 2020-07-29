package cl.empleados;

public class JefeEmpleado implements IEmpleado {
	
	private IUsableInformes nuevoInforme;
	
	
	
	public JefeEmpleado(IUsableInformes nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTarea() {
		// TODO Auto-generated method stub
		return "Jefe gestiona a los Empleados";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Jefe de los empleados emite informe: "+ this.nuevoInforme.getInforme();
	}

}
