package org.curso.clases;

import org.curso.excepciones.ExcepcionDividirPorUno;

public class Division {
    
    private int divisor, dividendo;
    
    public Division(){}
    
    public Division(String a, String b) throws NumberFormatException {
        divisor = Integer.parseInt(a);
        dividendo = Integer.parseInt(b);
    }
    
    public String dividir() throws ArithmeticException, ExcepcionDividirPorUno{
        int resultado = 0;
        if(dividendo==1){
            throw new ExcepcionDividirPorUno("Esto no es un reto");
        } else {
            resultado = divisor/dividendo;
        }
        return Integer.toString(resultado);
    }
}
