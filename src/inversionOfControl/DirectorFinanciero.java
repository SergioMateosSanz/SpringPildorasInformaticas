package inversionOfControl;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformes informeFinanciero;
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa")
	private String nombreEmpresa;
	
	
	public DirectorFinanciero(CreacionInformes informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		
		return "Se encarga de la gestión de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		
		return informeFinanciero.getInforme();
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	
	
}
