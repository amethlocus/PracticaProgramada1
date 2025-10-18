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

public class PilaChar{
    private DataChar cima;
    
    public PilaChar() {
        cima =  null;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    // metodo apilar
    public void push(Character valor){
        DataChar nuevoDato = new DataChar(valor);
        if (estaVacia()){
            cima = nuevoDato;
        } else {
            nuevoDato.setABajo(cima);
            cima = nuevoDato;
        }
    }
    // metodo desapilar
    public Character pop(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La pila está vacia, no se puede desapilar");    
            return null;
        } else {
            Character dato = cima.getValor();
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
        DataChar actual = cima;
        while (actual != null) {
            sb.append(actual.getValor()).append(" ");
            actual = actual.getAbajo();
        }
        
        return sb.toString().trim();
    }
}

