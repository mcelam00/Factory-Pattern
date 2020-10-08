
public abstract class Moneda {
	/**
	 * Clase abstracta; no se puede instanciar e incluye metodos implementados y sin implementar 
	 * El método configurar será abstracto e implementado por las clases que heredan de esta clase
	 *    MonedaEspaña
	 *    MonedaUSA
	 */
	
	private String texto; //atributo texto para la moneda
	private double valor; //Atributo valor para la moneda
	
	/**
	 * Constructor de la clase: No se puede instanciar una clase abstracta sería para usar desde las subclases
	 */
		
	public Moneda() {
		
	}
	
	/**
	 * Getter
	 * @return el atributo texto
	 */
	
	public String getTexto() {
		return this.texto;
	}
	
	/**
	 * Setter
	 * @param texto El valor de tecto que queramos ponerle a la moneda
	 */
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	/**
	 * Getter
	 * @return el atributo valor
	 */
	
	public double getValor() {
		return this.valor;
	}
	
	/**
	 * Setter
	 * @param valor El valor numerico en coma flotante de precisión doble que queramos ponerle a la moneda
	 */
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Método que imprime la moneda creada
	 * 
	 */
	
	public void visualizar() {
		System.out.println("Moneda texto: "+this.texto+"\n"+"Moneda valor: "+this.valor+"\n"); //heredan el getter ambos concretos

	}
	
	/**
	 * Método abstracto implementado en las subclases
	 */
	
	
	public abstract void configurar();	
	
	
	
}
