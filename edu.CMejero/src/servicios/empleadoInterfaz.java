package servicios;

import java.util.Scanner;

/// clase que se encarga de la operativa de los empleados
public interface empleadoInterfaz {

	/// metodo que se encarga de validar a un cliente
	public void validarCLiente(Scanner sc);
	
	/// metodo que se encarga de imprimir las citas por fichero
	public void imprimirCitas(Scanner sc);
}
