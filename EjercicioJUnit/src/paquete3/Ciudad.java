/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    
    private int poblacion;
    private String nombre;
    
    public void establecerPoblacion(int p) {
        poblacion = p;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public int obtenerPoblacion() {
        return poblacion;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Ciudad de Ecuador\n "
                + "Nombre: %s\n\n\t"
                + "Población: %d\n",nombre,poblacion);
        return cadena;
    }
    
}
