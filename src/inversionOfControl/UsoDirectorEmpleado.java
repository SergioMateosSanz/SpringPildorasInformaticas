package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDirectorEmpleado {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml"); 

		Empleados juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(juan.getInforme());
		
		contexto.close();
	}

}
