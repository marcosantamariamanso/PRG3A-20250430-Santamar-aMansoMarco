package jcolonia.daw2024.e3a;

	/**
	 * Vista para la gestión de borrado total de todos los equipos para iniciar un inventario nuevo,
	 * Se asegura una confirmación estricta del usuario debido al peligro que conlleva.
	 * 
	 * @author Marco S.
	 * @version 1.0
	 */
public class VistaBorradoTotal {
	/**
	 * Constructor de la vista de borrado total.
	 * 
	 * @param nombre el nombre o título del menú
	 */
	public VistaBorradoTotal(String nombre) {
		super();
	}

	/**
	 * Solicita al usuario que confirme el borrado total de todos los equipos.
	 * 
	 * @return true si el usuario confirma, false en caso contrario
	 */
	public boolean confirmarBorradoTotal() {
		String respuesta = entradaTexto("¿Está seguro de que desea borrar todos los equipos? (S/N): ");
		return respuesta.equalsIgnoreCase("S");
	}

	/**
	 * @param string
	 * @return personaliza el texto
	 */
	private String entradaTexto(String string) {
		return null;
	}
}
