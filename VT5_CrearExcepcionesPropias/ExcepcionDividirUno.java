public class ExcepcionDividirUno extends RuntimeException{
	
	public ExcepcionDividirUno(){
		this("No voy a ");
	}

	public ExcepcionDividirUno(String str){
		super(str+" dividir por uno.");
	}
}