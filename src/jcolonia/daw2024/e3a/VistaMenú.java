package jcolonia.daw2024.e3a;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Vista: Utilidades prototipo de gestión de menú.
 * 
 * @see ControladorInventarioAula
 * 
 * @version 1.2.0 (20250429000)
 * @author <a href="mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 */
public class VistaMenú extends VistaGeneral {
	/**
     * Scanner para la lectura de la entrada del usuario.
     */
    private Scanner scanner;
	/** Textos de las opciones del menú. */
	private String[] textoOpciones;

	/**
	 * Crea un menú con las opciones indicadas. Incorpora y activa la opción «0»
	 * para salir o finalizar.
	 * 
	 * @param nombre   el nombre o título del menú
	 * @param opciones la lista original de opciones a copiar
	 */
	public VistaMenú(String nombre, String[] opciones) {
		super(nombre);

		textoOpciones = Arrays.copyOf(opciones, opciones.length);
	}

	/**
	 * Envía a la consola de texto –salida estándar– la lista numerada de opciones
	 * disponibles. Incluye la opción «0» para salir o finalizar.
	 */
	public void mostrarMenú() {
	        System.out.println("\n=====================");
	        System.out.println("    Menú Principal   ");
	        System.out.println("=====================");
	        System.out.println("0. Salir");
	        System.out.println("1. Alta");
	        System.out.println("2. Baja");
	        System.out.println("3. Listado");
	        System.out.println("4. Exportación");
	        System.out.println("5. Importación");
	        System.out.println("6.Personalizar");
	        System.out.println("7. Borrar todos los inventarios");
	        System.out.println("=====================");
	    }

	/**
	 * Solicita al usuario que introduzca un número entero. 
	 * @return el entero introducido por el usuario
	 * 
	 */
	public int pedirOpcion() {
		return i;
		
	}
		/**
		 * es la opción seleccionada por el usuario
		 */
		int opción = -1;
		/**
		 * es el número de opciones disponibles
		 */
		int i = 0;{

		while (opción < 0 || opción > textoOpciones.length) {
			System.out.printf("Opción: ");
			try {
				opción = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: Debe ingresar un número válido.");
			}
		}
	}
}
