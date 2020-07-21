package cl.empleados;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		//1. cargar archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.Pedir el Bean
		IEmpleado e1 = contexto.getBean("miEmpleado", IEmpleado.class);
		//3.Uso del contenedor
		System.out.println(e1.getTarea());
		
		System.out.println(e1.getInformes());
		//4.Cerrar el contexto (liberar memoria)
		contexto.close();
	}
}
