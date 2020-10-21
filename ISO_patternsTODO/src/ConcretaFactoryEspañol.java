
public class ConcretaFactoryEspañol implements AbstractFactoryIdiomas{
	/**
	 * Factoría concreta que va a implementar todos los metodos de la interfaz factoria
	 * 
	 */
	
	public ConcretaFactoryEspañol() {
		
	}
	
	/**
	 * Esta factoría concreta se va a encargar de llamar ella al constructor de la moneda España 
	 */
	
	public Moneda getMoneda() {
		Moneda monConcretaESP;
		
		monConcretaESP = new MonedaEspaña();
		monConcretaESP.configurar();
		
		return monConcretaESP;
		
	} 
	
	/**
	 * Esta factoría concreta se va a encargar de llamar ella al constructor de la lista Español 
	 */
	
	public Lista getLista() {
		Lista listConcretaESP; //creo referencia de tipo la superclase
		
		listConcretaESP = new ListaEspañol(); //creo el objeto concreto de manera que referencio a él con mi referencia superclase
		listConcretaESP.configurar();
		
		
		return listConcretaESP; //lo devuelvo
		
	}	
	
	
	
	
}
