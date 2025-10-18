/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1;

/**
 *
 * @author abb
 */
public class Dato<T> {
    private T valor;
    private Dato abajo;
    
    public Dato(T valor){
        this.valor = valor;
        this.abajo = null;
    }
    
    public T getValor() {
        return valor;
    }
    
    public void setValor(T valor){
        this.valor = valor;
    }
    
    public Dato getAbajo() {
        return abajo;
    }
    
    public void setABajo(Dato abajo){
        this.abajo = abajo;
    }
}
