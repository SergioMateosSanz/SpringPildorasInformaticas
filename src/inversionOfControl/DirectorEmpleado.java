package inversionOfControl;

public class DirectorEmpleado implements Empleados {

	// Crear campo tipo creaciónInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	private String email;
	private String nombreEmpresa;
	
	// creación de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
 
	//método init (ejecutar tareas antes de que el bean este disponible)
	public void metodoInicial() {
		System.out.println("Antes de tener disponible el bean, dentro del método init");
	}
	
	//método destroy (ejecutar tareas después del uso del bean)
	public void metodoFinal() {
		System.out.println("Después de utilizar el bean, dentro del método destroy");
	}
	
	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
