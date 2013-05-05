package org.curso.excepciones;

public class ExcepcionDividirPorUno extends RuntimeException{
    
    public ExcepcionDividirPorUno(){
        this("No realizaré esta acción");
    }
    
    public ExcepcionDividirPorUno(String args){
        super(args+" División por uno.");
    }
}
