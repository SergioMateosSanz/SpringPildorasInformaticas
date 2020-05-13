package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creación de objetos
		//Empleados Empleado1 = new JefeEmpleado();
		//Empleados Empleado2 = new SecretarioEmpleado();
		//Empleados Empleado3 = new DirectorEmpleado();
		
		//uso de los objetos creados
		//System.out.println(Empleado1.getTareas());
		//System.out.println(Empleado2.getTareas());
		//System.out.println(Empleado3.getTareas());
		
		//1. cargar el archivo de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. pedir el bean
		DirectorEmpleado juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);
		SecretarioEmpleado jose = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		//3. utilizar el bean
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println("Email:" + juan.getEmail());
		System.out.println("Nombre empresa:" + juan.getNombreEmpresa());
		System.out.println(jose.getTareas());
		System.out.println(jose.getInforme());
		System.out.println("Email:" + jose.getEmail());
		System.out.println("Nombre empresa:" + jose.getNombreEmpresa());
		
		//4. cerrar el contexto
		contexto.close();
	}

}
