/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1;

import practica1.Pilas.PilaProducto;
import practica1.Modelos.Producto;
import javax.swing.JOptionPane;

public class Punto2 {

    public static void listaProductos() {
        PilaProducto pilaProductos = new PilaProducto();
        boolean continuar = true;

        while (continuar) {
            String codigo = JOptionPane.showInputDialog(null, "ingrese el codigo del producto:");
            if(codigo != null){
                String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripcino del producto:");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad:"));
                double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el precio:"));

                Producto p = new Producto(codigo, descripcion, cantidad, precio);
                pilaProductos.push(p);
            }
            int opcion = JOptionPane.showConfirmDialog(null, "desea agregar otro producto?", "continuar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }

        StringBuilder sb = new StringBuilder("rpoductos adquiridos:\n\n");
        double total = 0.0;

        // Se usa peek() modificado localmente porque el metodo original solo muestra texto simple
        PilaProducto aux = new PilaProducto();
        while (!pilaProductos.estaVacia()) {
            Producto prod = pilaProductos.pop();
            sb.append(prod).append("\n"); // aca el append de prod funciona porque la clase Producto tiene un override ToString()
            total += prod.getSubtotal();
            aux.push(prod); // conservar los datos
        }

        // restaurar los datos originales a la pila
        while (!aux.estaVacia()) {
            pilaProductos.push(aux.pop());
        }

        sb.append("\n total de la compra: $").append(total);

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
