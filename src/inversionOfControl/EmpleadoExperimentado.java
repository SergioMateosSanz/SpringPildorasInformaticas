package inversionOfControl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("EmpleadoExperimentado")
public class EmpleadoExperimentado implements Empleados {

	@Override
	public String getTareas() {
		
		return "Vender, vender y vender";
	}

	@Override
	public String getInforme() {
		
		return "Informe generado por el empleado experimentado";
	}

	//necesario Scope singleton para estas anotaciones
	//puedes tener cualquier modificador de acceso (public, private, protected)
	//sin argumentos
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		
		System.out.println("Ejecutado tras creación de Bean");
	}
	
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		
		System.out.println("Ejecutado antes de la destrucción");
	}
}
