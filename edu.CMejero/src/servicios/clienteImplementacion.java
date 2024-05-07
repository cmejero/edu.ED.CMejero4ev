package servicios;

import java.time.LocalDateTime;
import java.util.Scanner;

import controladores.inicio;
import dtos.citaDto;
import dtos.clienteDto;

/// clase que implementa a clienteInterfaz
public class clienteImplementacion implements clienteInterfaz {

	public void registroCliente(Scanner sc) {  
		
		
		clienteDto nuevoCliente = new clienteDto();
		
		nuevoCliente.setIdCliente(nuevoId());
		System.out.println("introduzca su nombre");
		nuevoCliente.setNombreCliente(sc.next());
		System.out.println("introduzca su primer apellido");
		nuevoCliente.setApellido1(sc.next());
		System.out.println("introduzca su segundo apellido");
		nuevoCliente.setApellido2(sc.next());
		System.out.println("introduzca su DNI");
		nuevoCliente.setDni(sc.next());
		LocalDateTime fechaRegistro = LocalDateTime.now();
		nuevoCliente.setFechaRegistro(fechaRegistro);
		
		inicio.listaClientes.add(nuevoCliente);
		
		
		
		
	}
	
	
	
	public void solicitudMedica(Scanner sc) {

		menuInterfaz mi = new menuImplementacion();

		System.out.println("Introduzca el DNI del cliente");
		String dniIntroducido = sc.next();

		for (clienteDto clientes : inicio.listaClientes) {
			if (clientes.getDni().equals(dniIntroducido)) {
				if (clientes.isEstaValidado() == true) {

					boolean cerrarMenu = false;
					int opcionUsuario;
					while (!cerrarMenu) {

						opcionUsuario = mi.menuYSeleccionEspecialidad(sc);
						switch (opcionUsuario) {
						case 0:
							System.out.println("Has seleccionado volver");
							cerrarMenu = true;
							break;

						case 1:
							System.out.println("Has seleccionado Psicologia");
							
							System.out.println("Introduzca fecha y hora para solcitar cita: dd-MM-yyyy hh:mm:ss");
							String fechaPsi = sc.nextLine();							
							LocalDateTime fechaPsicologia = LocalDateTime.parse(fechaPsi);
							citaDto nuevaCita = new citaDto();
							nuevaCita.setIdCita(nuevoId());
							nuevaCita.setCitaPsicologia(fechaPsicologia);
							nuevaCita.setNombreCompletoCliente(clientes.getNombreCompleto());
							nuevaCita.setDniCliente(clientes.getDni());
							nuevaCita.setEspecialidad("Psicologia");
							
							inicio.listaCita.add(nuevaCita);
							
							
							

							break;

						case 2:
							System.out.println("Has seleccionado Traumatologia");
							System.out.println("Introduzca fecha y hora para solcitar cita: dd-MM-yyyy hh:mm:ss");
							String fechaTrau = sc.nextLine();							
							LocalDateTime fechaTraumatologia = LocalDateTime.parse(fechaTrau);
							citaDto nuevaCita2 = new citaDto();
							nuevaCita2.setIdCita(nuevoId());
							nuevaCita2.setCitaPsicologia(fechaTraumatologia);
							nuevaCita2.setNombreCompletoCliente(clientes.getNombreCompleto());
							nuevaCita2.setDniCliente(clientes.getDni());
							nuevaCita2.setEspecialidad("Psicologia");
							
							inicio.listaCita.add(nuevaCita2);
							
							

							break;

						case 3:
							System.out.println("Has seleccionado Fisioterapia");
							System.out.println("Introduzca fecha y hora para solcitar cita: dd-MM-yyyy hh:mm:ss");
							String fechaFisio = sc.nextLine();							
							LocalDateTime fechaFisioterapia = LocalDateTime.parse(fechaFisio);
							citaDto nuevaCita3 = new citaDto();
							nuevaCita3.setIdCita(nuevoId());
							nuevaCita3.setCitaPsicologia(fechaFisioterapia);
							nuevaCita3.setNombreCompletoCliente(clientes.getNombreCompleto());
							nuevaCita3.setDniCliente(clientes.getDni());
							nuevaCita3.setEspecialidad("Psicologia");
							
							inicio.listaCita.add(nuevaCita3);

							break;

						default:
							System.out.println("La opcion seleccionada no corresponde con niguna");

							break;
						}

					}

				} else {
					System.out.println("El cliente no está validado");
				}

			} else {
				System.out.println("El DNI introducido esta registrado");
			}

		}
		
	}
	
	
	
	/// metodo que se encarga de asignar un id a un cliente nuevo
		private long nuevoId() {
			
			long nuevoId;
			int tamanioLista = inicio.listaCita.size();
			
			if(tamanioLista > 0) {
				nuevoId = inicio.listaCita.get(tamanioLista -1).getIdCita() +1 ;
			}
			else {
				nuevoId = 1;
			}
			return nuevoId;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
