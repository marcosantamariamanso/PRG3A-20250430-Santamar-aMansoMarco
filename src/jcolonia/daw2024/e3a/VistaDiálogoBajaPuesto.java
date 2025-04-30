package jcolonia.daw2024.e3a;
	/**
	 * Vista para la gestión de la baja de un puesto de trabajo.
	 * 
	 * @author Marco S.
	 * @version 1.0
	 */
public class VistaDiálogoBajaPuesto {
	/**
	 * Constructor de la vista de baja de puesto.
	 * 
	 * @param nombre el nombre o título del menú
	 */
	public VistaDiálogoBajaPuesto(String nombre) {
		super();
	}

	/**
	 * Solicita al usuario que confirme la baja del puesto de trabajo.
	 * 
	 * @return true si el usuario confirma, false en caso contrario
	 */
	public boolean confirmarBajaPuesto() {
		String respuesta = entradaTexto("¿Está seguro de que desea dar de baja el puesto? (S/N): ");
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
