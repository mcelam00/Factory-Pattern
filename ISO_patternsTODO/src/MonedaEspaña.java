
public class MonedaEspaña extends Moneda{
	/**
	 * Al llamar al constructor se crea un euro
	 */
	
	public MonedaEspaña() {
		this.setTexto("Euro");
	}
	
	/**
	 * Al llamar a configurar se estipula su valor
	 */
	
	public void configurar() {
		this.setValor(1.00);
	}
	

}
