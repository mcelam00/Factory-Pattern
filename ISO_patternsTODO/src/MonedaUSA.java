
public class MonedaUSA extends Moneda{
	
	/**
	 * Al llamar al constructor se asigna el valor
	 */
	
	public MonedaUSA(double valor) {
		this.setValor(valor);
	}
	
	/**
	 * Al llamar a configurar se estipula su tipo de moneda
	 */
	
	
	public void configurar() {
		
		this.setTexto("Dólar Estadounidense");

	}
	

}
