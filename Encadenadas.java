class Encadenadas{
	
	public Encadenadas(){
		try{
			superior();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void superior() throws Exception{
		try{
			intermedio();
		} catch(Exception e){
			throw new Exception("Excepcion Superior", e);
		}
	}

	public void intermedio() throws Exception{
		try{
			inferior();
		} catch(Exception e){
			throw new Exception("Excepcion Intermedia", e);
		}
	}

	public void inferior() throws Exception{
		throw new Exception("Excepcion Inferior");
	}

	public static void main(String... args){
		new Encadenadas();
	}
}