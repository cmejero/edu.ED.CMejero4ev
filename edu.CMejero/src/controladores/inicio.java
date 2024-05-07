package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.citaDto;
import dtos.clienteDto;
import servicios.menuImplementacion;
import servicios.menuInterfaz;

/// clase principal de la aplicacion
public class inicio {
	static public List<clienteDto> listaClientes = new ArrayList<clienteDto>();
	static public List<citaDto> listaCita = new ArrayList<citaDto>();
	static public String rutaArchivo;

	/// metodo principal de entrada de nuestra aplicacion
	public static void main(String[] args) {
		menuInterfaz mi = new menuImplementacion();

		Scanner sc = new Scanner(System.in);
		LocalDateTime fechaActual = LocalDateTime.now();

		SimpleDateFormat formato = new SimpleDateFormat("ddMMMyyyy");
		String fechaString = formato.format(fechaActual);
		FileWriter fw;

		rutaArchivo = "C:\\Users\\Carlos\\Desktop\\log-" + fechaString.toString() + ".txt";

		int opcionUsuario;
		boolean cerrarMenu = false;
		try {
			do {

				opcionUsuario = mi.menuYSeleccionPrincipal(sc);

				switch (opcionUsuario) {

				case 0:
					System.out.println("Has seleccionado cerrar aplicacion");
					fw = new FileWriter(inicio.rutaArchivo, true);
					PrintWriter pw = new PrintWriter(fw);
					pw.println("Ha seleccionado cerrar aplicacion");
					pw.close();
					fw.close();
					cerrarMenu = true;
					break;

				case 1:
					System.out.println("Has seleccionado menu empleados");
					fw = new FileWriter(inicio.rutaArchivo, true);
					PrintWriter pr = new PrintWriter(fw);
					pr.println("Ha seleccionado menu empleados");
					pr.close();
					fw.close();
					mi.accesoMenuEmpleado(sc);

					break;

				case 2:
					System.out.println("Has seleccionado menu clientes");
					fw = new FileWriter(inicio.rutaArchivo, true);
					PrintWriter pi = new PrintWriter(fw);
					pi.println("Ha seleccionado menu clientes ");
					pi.close();
					fw.close();
					mi.accesoMenuCliente(sc);

					break;

				}

			} while (!cerrarMenu);
		} catch (IOException e) {

			System.out.println("Ha ocurrido un error, intentelo mas tarde" + e.getMessage());
			fw = new FileWriter(inicio.rutaArchivo, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Ha ocurrido un error");
			pw.close();
			fw.close();
		}

	}

}
