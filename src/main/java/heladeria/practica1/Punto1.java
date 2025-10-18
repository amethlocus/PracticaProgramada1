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
public class Punto1 {

    public void listaRevertida() {
        Pila<Integer> pila = new Pila<>();
        boolean continuar = true;

        while (continuar) {
            String input = JOptionPane.showInputDialog(null, "ingrese un numero:");
            if (input == null) { 
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                pila.push(numero);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debe ingresar un numero valido.");
                continue;
            }

            int opcion = JOptionPane.showConfirmDialog(null, "desea ingresar otro numero?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }

        // Mostrar pila en orden inverso
        String numerosInvertidos = pila.peek();
        JOptionPane.showMessageDialog(null, "Numeros en orden inversox:\n" + numerosInvertidos);
    }
}
