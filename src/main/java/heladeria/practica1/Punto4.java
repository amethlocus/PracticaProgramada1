/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practica1;

import javax.swing.JOptionPane;

public class Punto4 {

    public static void consonantesVocales() {
        Pila<Character> pilaLetras = new Pila<>();

        // ingreso de letras
        for (int i = 1; i <= 10; i++) {
            String letra = JOptionPane.showInputDialog("ingrese la letra #" + i + ":");
            // validar que solo sea una letra
            while (letra == null || letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                letra = JOptionPane.showInputDialog("entrada invalida. una sola letra de a la A a al Z):");
            }
            pilaLetras.push(Character.toLowerCase(letra.charAt(0)));
        }

        // contadores de cada tipo de letra
        int vocales = 0;
        int consonantes = 0;
        StringBuilder pilaOriginal = new StringBuilder("🔠 pila original (de arriba a abajo):\n");

        // auxiliar para recorrer sin perder los datos
        Pila<Character> aux = new Pila<>();

        while (!pilaLetras.estaVacia()) {
            char letra = pilaLetras.pop();
            pilaOriginal.append(letra).append("\n");

            if (esVocal(letra))
                vocales++;
            else
                consonantes++;

            aux.push(letra); // lo guarda en la auxiliar para no preder los datos
        }

        // restaurar pila original
        while (!aux.estaVacia()) {
            pilaLetras.push(aux.pop());
        }

        pilaOriginal.append("\n🔎 cantidad de vocales: ").append(vocales)
                    .append("\n🔎 cantidad de consonantes: ").append(consonantes);

        JOptionPane.showMessageDialog(null, pilaOriginal.toString());

        // 🔽 eliminar vocales
        Pila<Character> pilaSinVocales = new Pila<>();
        while (!pilaLetras.estaVacia()) {
            char letra = pilaLetras.pop();
            if (!esVocal(letra)) {
                pilaSinVocales.push(letra);
            }
        }

        // Mostrar pila sin vocales
        StringBuilder pilaNueva = new StringBuilder("🧹 Pila después de eliminar las vocales:\n");
        if (pilaSinVocales.estaVacia()) {
            pilaNueva.append("(solo habia vocales,  nada que mostrar)");
        } else {
            while (!pilaSinVocales.estaVacia()) {
                pilaNueva.append(pilaSinVocales.pop()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, pilaNueva.toString());
    }

    // verificar si una letra es vocal
    private static boolean esVocal(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
}
