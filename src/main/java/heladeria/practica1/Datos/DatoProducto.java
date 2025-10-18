/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1.Datos;

import practica1.Modelos.Producto;

/**
 *
 * @author abb
 */
public class DatoProducto {
    private Producto valor;
    private DatoProducto abajo;
    
    public DatoProducto(Producto valor){
        this.valor = valor;
        this.abajo = null;
    }
    
    public Producto getValor() {
        return valor;
    }
    
    public void setValor(Producto valor){
        this.valor = valor;
    }
    
    public DatoProducto getAbajo() {
        return abajo;
    }
    
    public void setABajo(DatoProducto abajo){
        this.abajo = abajo;
    }
}
