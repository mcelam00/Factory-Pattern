
public abstract class Moneda {
	/**
	 * Clase abstracta; no se puede instanciar e incluye metodos implementados y sin implementar 
	 * El método configurar será abstracto e implementado por las clases que heredan de esta clase
	 *    MonedaEspaña
	 *    MonedaUSA
	 */
	
	protected String texto;
	protected double valor;
	
	public Moneda() {
		
	}
	
	
	public String getTexto() {
		
	}
	
	public void setTexto(String texto) {
		
	}
	
	
	public double getValor() {
		
	}
	
	
	public void setValor(double valor) {
		
	}
	
	public void visualizar() {
		
	}
	
	public abstract void configurar();	
	
	
	
}
