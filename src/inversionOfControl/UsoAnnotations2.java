package inversionOfControl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleados Antonio = contexto.getBean("EmpleadoExperimentado",Empleados.class);
		Empleados Lucia = contexto.getBean("EmpleadoExperimentado",Empleados.class);
		
		System.out.println(Antonio);
		System.out.println(Lucia);
		
		Empleados Felipe = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(Felipe.getTareas());
		System.out.println(Felipe.getInforme());
		
		DirectorFinanciero David = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Email del director financiero: " + David.getEmail());
		System.out.println("Nombre de la empresa: " + David.getNombreEmpresa());
		
		contexto.close();
	}

}
