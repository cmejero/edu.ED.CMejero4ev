package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import controladores.inicio;

 /// Clase que implementa al menuInterfaz
public class menuImplementacion implements menuInterfaz {

	empleadoInterfaz ei = new empleadoImplementacion();
	clienteInterfaz ci = new clienteImplementacion();
	
	public int menuYSeleccionPrincipal(Scanner sc) {
		
		int opcionUsuario;
		
		System.out.println("######################");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. menu empleados");
		System.out.println("2. menu clientes");
		System.out.println("######################");
		
		
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
		}
		
			/// metodo que se encarga del menu de empleado
		private int menuYSeleccionEmpleado(Scanner sc) {
			int opcionUsuario;
			System.out.println("######################");
			System.out.println("0. Volver");
			System.out.println("1. validar nuevo cliente");
			System.out.println("2. imprimir cita medica para un dia especifico");
			System.out.println("######################");
			opcionUsuario = sc.nextInt();
			return opcionUsuario;
		}
		
		
		
		
		public void accesoMenuEmpleado(Scanner sc) {
			
			int opcionUsuario;
			boolean cerrarMenu = false;
			
			try {
				while (!cerrarMenu) {
				
				opcionUsuario = menuYSeleccionEmpleado(sc);
				switch(opcionUsuario) {
				
				case 0:
					System.out.println("Has seleccionado volver");
					FileWriter fw = new FileWriter(inicio.rutaArchivo,true);
					PrintWriter pw = new PrintWriter(fw);
					pw.println("Ha seleccionado volver en menu de empleado");
					pw.close();
					fw.close();
					cerrarMenu = true;
					break;
					
				case 1:
					System.out.println("Has seleccionado validar nuevo cliente");
					ei.validarCLiente(sc);
					FileWriter fr = new FileWriter(inicio.rutaArchivo,true);
					PrintWriter pr = new PrintWriter(fr);
					pr.println("Ha seleccionado validar nuevo cliente");
					pr.close();
					fr.close();
					break;
					
				case 2: 
					System.out.println("Has seleccionado imprimir cita");
					ei.imprimirCitas(sc);
					FileWriter fi = new FileWriter(inicio.rutaArchivo,true);
					PrintWriter pi = new PrintWriter(fi);
					pi.println("Ha seleccionado imprimir cita");
					pi.close();
					fi.close();
					break;
					
					default:
						System.out.println("La opcion seleccionada es incorrecta");
						FileWriter ft = new FileWriter(inicio.rutaArchivo,true);
						PrintWriter pt = new PrintWriter(ft);
						pt.println("Ha seleccionado una opcion incorrecta en menu empleado");
						pt.close();
						ft.close();
						
						break;
				
				}
				
				
			
				
			}
			}catch (IOException e){
				System.out.println("Ha ocurrido un error, intentelo mas tarde" + e.getMessage());
				FileWriter ft = new FileWriter(inicio.rutaArchivo,true);
				PrintWriter pt = new PrintWriter(ft);
				pt.println("Ha seleccionado una opcion incorrecta en menu empleado");
				pt.close();
				ft.close();
			}
		}
		
		
		
		
		
		
		
			
			/// metodo que se encarga del menu de clientes
			private int menuYSeleccionCLiente(Scanner sc) {
				int opcionUsuario;
				System.out.println("######################");
				System.out.println("0. Volver");
				System.out.println("1. Registro de cliente");
				System.out.println("2. Solicitud de cita medica");
				System.out.println("3. Consultar citas medicas para un intervalo de tiempo");				
				System.out.println("######################");
				opcionUsuario = sc.nextInt();
				return opcionUsuario;
			}
			
			public void accesoMenuCliente(Scanner sc) {
				
				int opcionUsuario;
				boolean cerrarMenu = false;
				try {
				while(!cerrarMenu) {
					
					opcionUsuario = menuYSeleccionCLiente(sc);
					switch(opcionUsuario) {
					
					case 0:
						System.out.println("Has seleccionado volver");
						cerrarMenu = true;
						FileWriter fw = new FileWriter(inicio.rutaArchivo,true);
						PrintWriter pw = new PrintWriter(fw);
						pw.println("Ha seleccionado volver en menu de Cliente");
						pw.close();
						fw.close();
						break;
						
					case 1:
						System.out.println("Has seleccionado registro de cliente");
						ci.registroCliente(sc);
						FileWriter fr = new FileWriter(inicio.rutaArchivo,true);
						PrintWriter pr = new PrintWriter(fr);
						pr.println("Ha seleccionado registro de cliente");
						pr.close();
						fr.close();
						break;
						
					case 2: 
						System.out.println("Has seleccionado solicitud de cita medica");
						ci.solicitudMedica(sc);
						FileWriter fi = new FileWriter(inicio.rutaArchivo,true);
						PrintWriter pi = new PrintWriter(fi);
						pi.println("Ha seleccionado solicitud de cita medica");
						pi.close();
						fi.close();
						break;
						
					case 3: 
						System.out.println("Has seleccionado consultar citas para un intervalo de tiempo");
						
						FileWriter ft = new FileWriter(inicio.rutaArchivo,true);
						PrintWriter pt = new PrintWriter(ft);
						pt.println("Ha seleccionado consultar citas para un intervalo de tiempo");
						pt.close();
						ft.close();
						break;
						
						default:
							System.out.println("La opcion seleccionada es incorrecta");
							FileWriter fs = new FileWriter(inicio.rutaArchivo,true);
							PrintWriter ps = new PrintWriter(fs);
							ps.println("Ha seleccionado una opcion incorrecta en menu de clientes");
							ps.close();
							fs.close();
							
							break;
					
					}
				}
				}catch(Exception io) {
					
					System.out.println("Ha ocurrido un error en ficheros" + io.getMessage());
					FileWriter ft = new FileWriter(inicio.rutaArchivo,true);
					PrintWriter pt = new PrintWriter(ft);
					pt.println("Ha seleccionado una opcion incorrecta en menu empleado");
					pt.close();
					ft.close();
				}
			
		}
			
			public int menuYSeleccionEspecialidad(Scanner sc) {
				
				int opcionUsuario;
				System.out.println("######################");
				System.out.println("0. Volver");
				System.out.println("1. Psicologia");
				System.out.println("2. Traumatologia");
				System.out.println("3. Fisioterapia");				
				System.out.println("######################");
				opcionUsuario = sc.nextInt();
				return opcionUsuario;
			}
	
}
