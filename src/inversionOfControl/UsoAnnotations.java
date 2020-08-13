package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		
		Empleados Antonio = contexto.getBean("EmpleadoExperimentado",Empleados.class);
		Empleados Lucia = contexto.getBean("EmpleadoExperimentado",Empleados.class);
		
		if (Antonio == Lucia) {
			System.out.println("Apuntan al mismo objeto en memoria");
			System.out.println(Antonio);
			System.out.println(Lucia);
		} else {
			System.out.println("No apuntan al mismo objeto en memoria");
			System.out.println(Antonio);
			System.out.println(Lucia);
		}
		contexto.close();
	}

}
