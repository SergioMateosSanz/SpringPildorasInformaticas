package inversionOfControl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("inversionOfControl")
@PropertySource("classpath:DatosEmpresasAnnotations.propiedades")
public class EmpleadosConfig {

	//definir bean para el informeFinancieroDptoCompras
	//el nombre del método será el id del bean para la inyección
	@Bean
	public CreacionInformes informeFinancieroDptoCompras() {
		
		return new InformeFinanciertoDptoCompras();
	}
	
	//definir bean para el DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDptoCompras());
	}
}
