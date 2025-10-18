/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.Pilas;
import heladeria.practica1.Datos.DatoEstudiante;
import practica1.Modelos.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author abb
 */

public class PilaEstudiante{
    private DatoEstudiante cima;
    
    public PilaEstudiante() {
        cima =  null;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    // metodo apilar
    public void push(Estudiante valor){
        DatoEstudiante nuevoDato = new DatoEstudiante(valor);
        if (estaVacia()){
            cima = nuevoDato;
        } else {
            nuevoDato.setABajo(cima);
            cima = nuevoDato;
        }
    }
    // metodo desapilar
    public Estudiante pop(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La pila está vacia, no se puede desapilar");    
            return null;
        } else {
            Estudiante dato = cima.getValor();
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
        DatoEstudiante actual = cima;
        while (actual != null) {
            sb.append(actual.getValor()).append(" ");
            actual = actual.getAbajo();
        }
        
        return sb.toString().trim();
    }
}

