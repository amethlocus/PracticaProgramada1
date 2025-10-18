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

public class Pila<T>{
    private Dato cima;
    
    public Pila() {
        cima =  null;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    // metodo apilar
    public void push(T valor){
        Dato nuevoDato = new Dato(valor);
        if (estaVacia()){
            cima = nuevoDato;
        } else {
            nuevoDato.setABajo(cima);
            cima = nuevoDato;
        }
    }
    // metodo desapilar
    public T pop(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La pila está vacia, no se puede desapilar");    
            return null;
        } else {
            T dato = (T) cima.getValor();
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
        Dato actual = cima;
        while (actual != null) {
            sb.append(actual.getValor()).append(" ");
            actual = actual.getAbajo();
        }
        
        return sb.toString().trim();
    }
}

