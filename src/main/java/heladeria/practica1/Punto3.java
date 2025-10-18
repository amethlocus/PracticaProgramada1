/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1;

import javax.swing.JOptionPane;

public class Punto3 {

    public static void listaEstudiantes() {
        Pila<Estudiante> pilaEstudiantes = new Pila<>();

        // Ingreso de datos
        for (int i = 1; i <= 20; i++) {
            String nombre = JOptionPane.showInputDialog("ingrese el nombre del estudiante " + i + ":");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad de " + nombre + ":"));
            pilaEstudiantes.push(new Estudiante(nombre, edad));
        }

        // Variables para determinar mayor y menor
        Estudiante mayor = null;
        Estudiante menor = null;

        // Pila auxiliar para no perder los datos
        Pila<Estudiante> aux = new Pila<>();

        StringBuilder sb = new StringBuilder("👩lista de estudiantes:\n\n");

        while (!pilaEstudiantes.estaVacia()) {
            Estudiante e = pilaEstudiantes.pop();
            sb.append(e).append("\n");

            if (mayor == null || e.getEdad() > mayor.getEdad()) {
                mayor = e;
            }
            if (menor == null || e.getEdad() < menor.getEdad()) {
                menor = e;
            }

            aux.push(e);
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            pilaEstudiantes.push(aux.pop());
        }

        sb.append("\n👑 estudiante de mayor edad: ").append(mayor.getNombre())
          .append(" (").append(mayor.getEdad()).append(" años)");
        sb.append("\n🌱 estudiante de menor edad: ").append(menor.getNombre())
          .append(" (").append(menor.getEdad()).append(" años)");

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
