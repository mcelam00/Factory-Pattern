
public class Principal {
	    public static void main(String[] args)
	    {
	        // CREAR EN ESPAÑOL 
	    	
	         Cliente cliente = new Cliente( new ConcretaFactoryEspañol() );  //le pasamos la factoría concreta Español
	         cliente.visualizaElems();
	     
	      
	         // CREAR EN INGLES
	         cliente = new Cliente ( new ConcretaFactoryIngles() ); //le pasamos la factoría completa Ingles
	         cliente.visualizaElems();
		     
	    }    
	       
	}
 
