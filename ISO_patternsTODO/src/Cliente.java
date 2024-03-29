
public class Cliente {
	
	
	private Moneda moneda;
	private Lista lista;
	private AbstractFactoryIdiomas factory; //Referencia para almacenar la factoría concreta usando su abstracción (superclase-Interfaz) para apuntar a la concreta segun corresponda por la instancia pasada al constructor
										//es como si tuviera un atributo de tipo CFingl o CFEsp segun corresponda por la instancia que le llegue al constructor
	
	/**
	 * Constructor de la clase guarda la factoría que recibe
	 * @param factoria instancia de la clase factoría concreta
	 */
	
	public Cliente(AbstractFactoryIdiomas factoria) {
		
		this.factory = factoria;
		this.moneda = factoria.getMoneda();
		this.lista = factoria.getLista();
		
		
	}
	
	/**
	 * Método que imprime los resultados de la creación del objeto concreto (puesto que programo en global para ambos Esp/Ing) para ver que la factoría correspondiente ha desempeñado bién su trabajo
	 * Se propaga la llamada al "visualizar" local de cada clase abstracta
	 */
	
	public void visualizaElems() {
		
		//this.moneda = this.factory.getMoneda();		//utilizamos la factoria para llamar a los métodos que gestionan la creación de los objetos concretos
		//this.lista = this.factory.getLista();	
		
		lista.visualizar();
		moneda.visualizar();
		
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
