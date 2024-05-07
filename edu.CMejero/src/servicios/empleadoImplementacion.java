package servicios;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

import controladores.inicio;
import dtos.citaDto;
import dtos.clienteDto;

/// clase que implementa a empleadoInterfaz
public class empleadoImplementacion implements empleadoInterfaz {

	public void validarCLiente(Scanner sc) {

		System.out.println("Introduzca el DNI del cliente");
		String dniIntroducido = sc.next();
		String volverAValidar = "";

		do {
			for (clienteDto clientes : inicio.listaClientes) {
				if (clientes.isEstaValidado() == false) {
					System.out.println("Nombre Completo: " + clientes.getNombreCompleto());
					System.out.println("Dni: " + clientes.getDni());
				} else {
					System.out.println("No hay clientes por validar");
				}
			}

			for (clienteDto clientes : inicio.listaClientes) {
				if (clientes.getDni().equals(dniIntroducido)) {

					clientes.setEstaValidado(true);
					System.out.println("El cliente ha sido validado");

				} else {
					System.out.println("El DNI introducido no corresponde con ninguno");

				}
				System.out.println("¿quieres validar otro cliente?: s/n");
				volverAValidar = sc.next();
			}

		} while (!volverAValidar.equals("s"));
	}

	
	
public void imprimirCitas(Scanner sc) {
		
		System.out.println("Introduzca la fecha: dd-MM-yyyy");
		String fechaIntroducida = sc.nextLine();
		
		
		SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd-MM-yyyy");
		LocalDateTime fechaParse = LocalDateTime.parse(fechaIntroducida , fechaFormateada);
		
		
		for(citaDto citas : inicio.listaCita) {
			if(citas.getCitaFisioterapia() == fechaParse);
		}
		
	}
	
	
	
	
	
/// metodo que se encarga de generar un nuevo id al cliente
	private long nuevoId() {

		long nuevoId;
		int tamanioLista = inicio.listaClientes.size();

		if (tamanioLista > 0) {
			nuevoId = inicio.listaClientes.get(tamanioLista - 1).getIdCliente() + 1;
		} else {
			nuevoId = 1;
		}
		return nuevoId;
	}

}
