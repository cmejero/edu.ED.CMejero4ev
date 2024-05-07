package servicios;

import java.util.Scanner;

/// clase que se encarga de la operativa de los clientes
public interface clienteInterfaz {

	/// metodo que se encarga de registar a un nuevo cliente
	public void registroCliente(Scanner sc);

	/// metodo que se encarga de realizar una solicitud medica
	public void solicitudMedica(Scanner sc);
	
	
}
