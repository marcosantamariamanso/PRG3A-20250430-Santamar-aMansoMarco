package jcolonia.daw2024.e3a;
/**
 * Permite personalizar el aula El programa debe determinar el prefijo a utilizar, el nombre de 
 * archivo de importacion exportacon estara tambien ligado al prefijo.
 * @author Marco S.
 * @version 1.0 
 */
public class VistaPersonalizar extends VistaGeneral {
	/**
	 * Constructor de la vista de personalización.
	 * 
	 * @param nombre el nombre o título del menú
	 */
	public VistaPersonalizar(String nombre) {
		super(nombre);
	}
	/**
	 * Solicita al usuario que introduzca un prefijo para el aula.
	 * 
	 * @return el prefijo introducido por el usuario
	 */
	public String entradaPrefijo() {
		try {
			prefijo = entradaTexto("Introduce el prefijo para el aula: ");
		} catch (Exception e) {
			System.out.println("Error al introducir el prefijo: " + e.getMessage());
		}
		return prefijo;
		
		
	}
		/**
		 * 
		 */
		String prefijo = entradaTexto("Introduce el prefijo para el aula: ");

	/**
	 * Solicita al usuario que introduzca un nombre de archivo para la exportación.
	 * 
	 * @return el nombre de archivo introducido por el usuario
	 */
	public String entradaNombreArchivo() {
		String nombreArchivo = entradaTexto("Introduce el nombre del archivo de exportación: ");
		try {
			nombreArchivo = entradaTexto("Introduce el nombre del archivo de exportación: ");
		} catch (Exception e) {
			System.out.println("Error al introducir el nombre del archivo: " + e.getMessage());
		}
		return nombreArchivo;
		
	}
	/**
	 * @param string
	 * @return personaliza el texto
	 */
	private String entradaTexto(String string) {
		return null;
		
	}
	/**
	 * Solicita al usuario que introduzca un nombre de archivo para la importación.
	 * 
	 * @return el nombre de archivo introducido por el usuario
	 */
	public String entradaNombreArchivoImportacion() {
		String nombreArchivoImportacion = entradaTexto("Introduce el nombre del archivo de importación: ");
		try {
			nombreArchivoImportacion = entradaTexto("Introduce el nombre del archivo de importación: ");
		} catch (Exception e) {
			System.out.println("Error al introducir el nombre del archivo: " + e.getMessage());
		}
		return nombreArchivoImportacion;
	}
	
}
