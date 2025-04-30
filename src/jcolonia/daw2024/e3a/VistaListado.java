package jcolonia.daw2024.e3a;

import static java.lang.System.out;

import java.util.List;

/**
 * Vista para gestión de listados en consola de texto.
 * 
 * @version 1.2 (20250428000)
 * @author <a href="mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 */
public class VistaListado extends VistaGeneral {
	/** Número de líneas a mostrar en cada página. */
	private static final int TAMAÑO_PÁGINA = 10;
	/**
	 * Formato común tipo «printf» para cada línea mostrada. Incluye el número y el
	 * propio texto de la línea.
	 */
	private static final String FORMATO_LISTADO = "  %d: %s%n";
	/**
	 * Número de entradas
	 */
	private int numEntradas;
	/**
	 * Número de  importaciones
	 */
	private int numImportaciones;
	/**
	 * Número de exportaciones
	 */
	private int numExportaciones;
	/**
	 * Número de borrados
	 */
	private int numBorrados;

	/**
	 * Almacena el nombre o título.
	 * 
	 * @param nombre el texto deseado
	 */
	public VistaListado(String nombre) {
		super(nombre);
	}

	/**
	 * Envía a la consola una lista numerada de textos distribuidos en lotes de
	 * cierta longitud. Al final de cada lote o página pide confirmación para
	 * mostrar las líneas que conformarán el siguiente lote.
	 * 
	 * @param listaTextos los textos a mostrar
	 * @see VistaGeneral#pedirConfirmación(String)
	 */
	public void mostrar(List<String> listaTextos) {
		int total = listaTextos.size();
		int página = 0;
		int inicio = 0;
		int fin = TAMAÑO_PÁGINA;

		while (inicio < total) {
			if (fin > total) {
				fin = total;
			}
			out.printf("Página %d de %d%n", ++página, (total / TAMAÑO_PÁGINA) + 1);
			for (int i = inicio; i < fin; i++) {
				out.printf(FORMATO_LISTADO, i + 1, listaTextos.get(i));
			}
			inicio += TAMAÑO_PÁGINA;
			if (inicio < total) {
				pedirConfirmación("Continuar porfavo...");
			}
		}
	}
	
	/**
	 * Método que gestiona el número de entradas, importaciones y exportaciones y borrados que 
	 * será usado posteriormente en el método mostrarResumen.
	 *  
	 */
	public void gestionarResumen() {
		
		int numEntradas = 0;
		int numImportaciones = 0;
		int numExportaciones = 0;
		int numBorrados = 0;
		
		this.numEntradas = numEntradas;
		this.numImportaciones = numImportaciones;
		this.numExportaciones = numExportaciones;
		this.numBorrados = numBorrados;
	}
	
	/**
	 * Incorporar un método asi como los atributos y los retoques necesarios para su gestión 
	 * para mostrar un resumen del estado del inventario: número de entradas, informacion de importaciones
	 * y exportaciones, borrados realizados, etc.
	 */
	
	
	public void mostrarResumen() {
		out.println("Resumen del inventario:");
		out.println("Número de entradas: " + numEntradas);
		out.println("Número de importaciones: " + numImportaciones);
		out.println("Número de exportaciones: " + numExportaciones);
		out.println("Número de borrados realizados: " + numBorrados);
	}
}
