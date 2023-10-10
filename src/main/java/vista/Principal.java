package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.Cliente;
import modelo.TipoCliente;

public class Principal {

	public static void main(String[] args) {
		// LLama directamente a Cliente
		//Cliente cliente = new Cliente(1,"Miguel Grau","Piura",2000,"mgrau@correo.com.pe");
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cliente cliente = contexto.getBean(Cliente.class);
		TipoCliente tipo = contexto.getBean(TipoCliente.class);

		System.out.println("Hola a todos");
		System.out.println("Id: " + tipo.getId());
		System.out.println("Tipo: " + tipo.getTipo());
		System.out.println("-------------------------");
		System.out.println("Cliente: " + cliente.getNombre());
		System.out.println("TipoCliente: " + cliente.getTipo().getTipo());

	}

}
