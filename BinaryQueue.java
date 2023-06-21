package MiniProyecto4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryQueue {
    public static Queue<String> binaryQueue;
    public static void countBinary(int n) {
        binaryQueue = new LinkedList<>();
        System.out.println("--------------------------------");
        for (int i = 1; i <= n; i++) {
            String binary = Integer.toBinaryString(i); //conversion a binario
            binaryQueue.add(binary);// agrega los binarios a la cola
        }
        while (binaryQueue.peek()!= null) {
            String binaryNumber = binaryQueue.poll(); //Resultado de la cola 
            System.out.println(binaryNumber);//Print
        }
        System.out.println("--------------------------------");

    }

    public static void main() {
        //countBinary(8); //Prueba con ejemplo del profesor
        System.out.println("Que numero desea imprimir en binario de 0 a ese numero (Cola): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        countBinary(n);
    }
}

