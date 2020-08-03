package cl.empleados;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		//1. cargar archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.Pedir el Bean al contenedor de spring
		DirectorEmpleado e1 = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		SecretarioEmpleado se1= contexto.getBean("miSecretarioEmpleadoPrototype", SecretarioEmpleado.class);
		SecretarioEmpleado se2= contexto.getBean("miSecretarioEmpleadoPrototype", SecretarioEmpleado.class);
		//3.Uso del contenedor
		System.out.println("EMPLEADO DIRECTIVO: "+ e1);
//		System.out.println(e1.getTarea());
//		System.out.println(e1.getInformes());
//		System.out.println(e1.getEmail());
//		System.out.println("Empresa: "+e1.getNombreEmpresa());
		
		System.out.println("\n");
		
		System.out.println("EMPLEADO SECRETARIO 1: "+ se1);
		
		System.out.println("\n");
		
		System.out.println("EMPLEADO SECRETARIO 2: "+ se2);
//		System.out.println(se1.getTarea());
//		System.out.println(se1.getInformes());
//		System.out.println(se1.getEmail());
//		System.out.println("Empresa: "+se1.getNombreEmpresa());
		
		//4.Cerrar el contexto (liberar memoria)
		contexto.close();
	}
}
