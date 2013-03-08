public class Division{
	
	public void dividir(){
		try{
			divide(10,2);
		} catch(ExcepcionDividirUno edu){
			System.out.println(edu.getMessage());
		}
		System.out.println("Terminado");
	}

	public void divide(int a, int b) throws ExcepcionDividirUno{
		if(b==1){
			throw new ExcepcionDividirUno("Dividir por uno no es un reto, ");
		} else {
			System.out.println(a/b);
		}
	}

	public static void main(String args[]){
		new Division().dividir();
	}
}