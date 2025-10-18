/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1;

/**
 *
 * @author abb
 */
public class DatoEstudiante {
    private Estudiante valor;
    private DatoEstudiante abajo;
    
    public DatoEstudiante(Estudiante valor){
        this.valor = valor;
        this.abajo = null;
    }
    
    public Estudiante getValor() {
        return valor;
    }
    
    public void setValor(Estudiante valor){
        this.valor = valor;
    }
    
    public DatoEstudiante getAbajo() {
        return abajo;
    }
    
    public void setABajo(DatoEstudiante abajo){
        this.abajo = abajo;
    }
}
