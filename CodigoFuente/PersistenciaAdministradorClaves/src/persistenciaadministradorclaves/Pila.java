/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaadministradorclaves;

import java.util.ArrayList;

/**
 *
 * @author abecerra
 * @param <E>
 */
public class Pila<E> {
    private ArrayList<E> cadenas = null;
    
    public Pila() {
        this.cadenas = new ArrayList<E>();
    }
    
    public void agregar(E dato) {
        if (!this.cadenas.contains(dato)) {
            this.cadenas.add(dato);
        }
    }
    
    public void quitar(E dato) {
        this.cadenas.remove(this.cadenas.size()-1);
    }
    
    public String total() {
        return this.cadenas.toString();
    }
    
    public E get(int posicion) {
        return this.cadenas.get(posicion);
    }
}
