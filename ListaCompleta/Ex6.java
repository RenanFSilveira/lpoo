package ListaCompleta;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * Escreva um programa que leia vários inteiros, coloque em
uma fila. Em seguida, retire todos os números iguais da fila
 */

public class Ex6 {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        preencher(fila);
        System.out.println("Fila antes:");
        imprimeFila(fila);
        removeDuplicatas(fila);
        System.out.println("Fila depois:");
        imprimeFila(fila);
        
        
    }

    public static void preencher(FilaInt fila) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = 0, i = 0, quant;
        System.out.println("---- Preenche Fila ----");

        do {
            System.out.print("Digite um número: ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                fila.enqueue(numeroDigitado);
            }
            i++;
        } while (numeroDigitado != 0);
        entrada.close();
    }

    public static void imprimeFila(FilaInt fila){
        int quant = fila.size();
        for (int i=0; i<quant; i++){
            int numeroAtual = fila.peek();
            System.out.println(numeroAtual);
            fila.enqueue(numeroAtual);
            fila.dequeue();
        }
    }

    public static void removeDuplicatas(FilaInt fila){
        LinkedHashSet<Integer> lista = new LinkedHashSet<>();
        int quant = fila.size();
        for (int i=0; i<quant; i++){
            lista.add(fila.peek());
            fila.dequeue();
        }
        quant = lista.size();
        for (int i=0; i<quant; i++){
            fila.enqueue(lista.getFirst());
            lista.removeFirst();
        }
    }
}
