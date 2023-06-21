package MiniProyecto4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App{
    public static void vocalesYConsonantes(String texto) {
        Map<Character, Integer> contador = new HashMap<>();
        texto = texto.toLowerCase();
        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                if (Vocal(caracter)) {
                    contador.put(caracter, contador.getOrDefault(caracter, 0) + 1);
                } 
                else {
                    contador.put(caracter, contador.getOrDefault(caracter, 0) + 1);
                }
            }
        }

        System.out.println("Vocales:");
        for (char caracter : contador.keySet()) {
            if (Vocal(caracter)) {
            System.out.println(caracter + ": " + contador.get(caracter));
            }
        }

        System.out.println("\nConsonantes:");
        for (char caracter : contador.keySet()) {
            if (!Vocal(caracter)) {
            System.out.println(caracter + ": " + contador.get(caracter));
            }
        }
    }

    public static boolean Vocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public static void main(String[] args) {
        String palabra = " ";
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite una palabra: ");
        palabra = enter.nextLine();
        vocalesYConsonantes(palabra);
        enter.close();
    }
}
