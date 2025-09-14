package ListaCompleta;

import java.util.Scanner;

public class Ex10 {

    /*
     * Faça um programa, usando a classe FilaInt, que preencha
     * uma fila. Imprima na tela. Retire os elementos pares da fila.
     * Imprima novamente na tela
     */

    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        preencher(fila);
        System.out.println("Fila original:");
        imprimeFila(fila);
        removePares(fila);
        System.out.println("Lista sem os pares:");
        imprimeFila(fila);
    }

    public static void preencher(FilaInt fila) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = 0, i = 0;
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

    public static void imprimeFila(FilaInt fila) {
        int quant = fila.size();
        for (int i = 0; i < quant; i++) {
            int numeroAtual = fila.peek();
            System.out.println(numeroAtual);
            fila.enqueue(numeroAtual);
            fila.dequeue();
        }
    }

    public static void removePares(FilaInt fila) {
        int quant = fila.size();
        for (int i = 0; i < quant; i++) {
            int numeroAtual = fila.peek();
            if (numeroAtual % 2 == 0) {
                fila.dequeue();
            } else {
                fila.enqueue(numeroAtual);
                fila.dequeue();
            }
        }
    }

}
