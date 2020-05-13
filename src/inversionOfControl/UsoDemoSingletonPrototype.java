package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(maria);
		System.out.println(pedro);
		
		contexto.close();
	}

}
