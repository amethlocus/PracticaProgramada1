/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1.Datos;

/**
 *
 * @author abb
 */
public class DataChar {
    private Character valor;
    private DataChar abajo;
    
    public DataChar(Character valor){
        this.valor = valor;
        this.abajo = null;
    }
    
    public Character getValor() {
        return valor;
    }
    
    public void setValor(Character valor){
        this.valor = valor;
    }
    
    public DataChar getAbajo() {
        return abajo;
    }
    
    public void setABajo(DataChar abajo){
        this.abajo = abajo;
    }
}
