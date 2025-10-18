/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1.Datos;

/**
 *
 * @author abb
 */
public class DatoInteger {
    private int valor;
    private DatoInteger abajo;
    
    public DatoInteger(int valor){
        this.valor = valor;
        this.abajo = null;
    }
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public DatoInteger getAbajo() {
        return abajo;
    }
    
    public void setABajo(DatoInteger abajo){
        this.abajo = abajo;
    }
}
