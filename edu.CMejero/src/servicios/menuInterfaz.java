package servicios;

import java.util.Scanner;

///Clase que se encarga de los menus de la aplicacion
public interface menuInterfaz {

	/// metodo que se encarga de mostrar el menu principal de la aplicacion
	public int menuYSeleccionPrincipal(Scanner sc);
	
	/// metodo que se encarga del acceso al menu de empleado
	public void accesoMenuEmpleado(Scanner sc);
	
	/// metodo que se encarga del acceso al menu de cliente
	public void accesoMenuCliente(Scanner sc);
	
	/// metodo que se encarga de mostrar el menu de especializacion
	public int menuYSeleccionEspecialidad(Scanner sc);
}
