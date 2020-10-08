
public class Cliente {
	
	
	
	private AbstractFactoryIdiomas factoria; //Referencia para almacenar la factoría concreta usando su abstracción (superclase-Interfaz) para apuntar a la concreta segun corresponda por la instancia pasada al constructor
										//es como si tuviera un atributo de tipo CFingl o CFEsp segun corresponda por la instancia que le llegue al constructor
	
	/**
	 * Constructor de la clase guarda la factoría que recibe
	 * @param factoria instancia de la clase factoría concreta
	 */
	
	public Cliente(AbstractFactoryIdiomas factoria) {
		
		this.factoria = factoria;
		
		
	}
	
	/**
	 * Método que imprime los resultados de la creación del objeto concreto (puesto que programo en global para ambos Esp/Ing) para ver que la factoría correspondiente ha desempeñado bién su trabajo
	 * Se propaga la llamada al "visualizar" local de cada clase abstracta
	 */
	
	public void visualizaElems() {
		
		Moneda moneda;
		Lista lista;
		
		moneda = this.factoria.getMoneda();		//utilizamos la factoria para llamar a los métodos que gestionan la creación de los objetos concretos
		lista = this.factoria.getLista();	
		
		lista.visualizar();
		System.out.println("Moneda texto: "+moneda.getTexto()+"\n"+"Moneda valor: "+moneda.getValor()+"\n"); //heredan el getter ambos concretos

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
