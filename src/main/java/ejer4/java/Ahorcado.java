package ejer4.java;

import java.util.*;

public class Ahorcado {
    public static void main(String[] args) {
        // Lista de palabras
        String[] palabras = { "manzana", "banana", "cereza" };
        // Selecciona una palabra al azar
        String palabra = palabras[new Random().nextInt(palabras.length)];
        // Crea un array para almacenar el estado de la palabra
        char[] estado = new char[palabra.length()];
        Arrays.fill(estado, '_');

        int intentos = 7;
        Scanner scanner = new Scanner(System.in);

        while (intentos > 0 && new String(estado).contains("_")) {
            System.out.println("Palabra actual: " + new String(estado));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            if (palabra.contains(String.valueOf(letra))) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        estado[i] = letra;
                    }
                }
            } else {
                intentos--;
            }
        }

        if (intentos > 0) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + palabra);
        }

        scanner.close();
    }
}