import java.util.ArrayList;

public abstract class Lista {
	/**
	 * Clase abstracta; no se puede instanciar e incluye metodos implementados y sin implementar 
	 * El método configurar será abstracto e implementado por las clases que heredan de esta clase
	 *    ListaEspañol
	 *    ListaIngles
	 */
	
	
	private ArrayList<Integer> elementos; //atributo lista de enteros
	
	
	/**
	 * Constructor de la clase: No se puede instanciar una clase abstracta sería para usar desde las subclases
	 */
	
	public Lista() {
		this.elementos = new ArrayList<Integer>();
	}
	
	
	/**
	 * Getter
	 * @param indice Posición del arraylist que queremos devolver su valor
	 * @return el entero en la posicion indice
	 */
	
	public int getElemento(int indice) {
		return this.elementos.get(indice);
	}
	
	/**
	 * Setter
	 * @param elem Elemento que se desea insertar en el arraylist
	 */
	
	public void insertarElemento(int elem) {
		this.elementos.add(elem);
	}
	
	/**
	 * Método que imprime el contenido de la lista
	 * 
	 */
	
	public void visualizar() {

		System.out.print("Contenido Lista:");  

		
		for(int i = 0; i < this.elementos.size(); i++) {
			
			System.out.print(" "+elementos.get(i));
		}
		
		
		System.out.println();  

	}
	
	/**
	 * Método abstracto implementado en las subclases
	 */
	
	public abstract void configurar();
	
	
	
	

}
