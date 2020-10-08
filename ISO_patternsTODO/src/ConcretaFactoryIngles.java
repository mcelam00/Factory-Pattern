
public class ConcretaFactoryIngles implements AbstractFactoryIdiomas{
	/**
	 * Factoría concreta que va a implementar todos los metodos de la interfaz factoria
	 * 
	 */
	
	public ConcretaFactoryIngles() {
		
	}
	
	/**
	 * Esta factoría concreta se va a encargar de llamar ella al constructor de la moneda USA
	 * dólar estadounidense equivale a 0,85 euro
	 */
	
	public Moneda getMoneda() {
		Moneda monConcretaUSA;
		
		monConcretaUSA = new MonedaUSA(0.85);
		monConcretaUSA.configurar();
		
		return monConcretaUSA;
		
	}
	
	/**
	 * Esta factoría concreta se va a encargar de llamar ella al constructor de la lista Ingles
	 */
	
	public Lista getLista() {
		Lista listConcretaIng; //creo referencia de tipo la superclase
		
		listConcretaIng = new ListaIngles(); //creo el objeto concreto de manera que referencio a él con mi referencia superclase
		listConcretaIng.configurar();
		
		
		return listConcretaIng; //lo devuelvo
		
	}	
	

}
