/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1;
import javax.swing.JOptionPane;

/**
 *
 * @author abb
 */

public class PilaProducto{
    private DatoProducto cima;
    
    public PilaProducto() {
        cima =  null;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    // metodo apilar
    public void push(Producto valor){
        DatoProducto nuevoDato = new DatoProducto(valor);
        if (estaVacia()){
            cima = nuevoDato;
        } else {
            nuevoDato.setABajo(cima);
            cima = nuevoDato;
        }
    }
    // metodo desapilar
    public Producto pop(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La pila está vacia, no se puede desapilar");    
            return null;
        } else {
            Producto dato = cima.getValor();
            cima = cima.getAbajo();
            return dato;
        }
    }
    
    // metodo mostarPila
    public String peek() {
        if(estaVacia()){
            return "La pila está vacia";
        }
        
        StringBuilder sb = new StringBuilder();
        DatoProducto actual = cima;
        while (actual != null) {
            sb.append(actual.getValor()).append(" ");
            actual = actual.getAbajo();
        }
        
        return sb.toString().trim();
    }
}

