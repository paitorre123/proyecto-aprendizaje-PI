package cl.empleados;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		//1. cargar archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.Pedir el Bean
		DirectorEmpleado e1 = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		SecretarioEmpleado e2 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		//3.Uso del contenedor
		System.out.println("EMPLEADO: "+ e1);
		System.out.println(e1.getTarea());
		System.out.println(e1.getInformes());
		System.out.println(e1.getEmail());
		System.out.println("Empresa: "+e1.getNombreEmpresa());
		
		System.out.println("\n");
		
		System.out.println("EMPLEADO: "+ e2);
		System.out.println(e2.getTarea());
		System.out.println(e2.getInformes());
		System.out.println(e2.getEmail());
		System.out.println("Empresa: "+e2.getNombreEmpresa());
		
		//4.Cerrar el contexto (liberar memoria)
		contexto.close();
	}
}
