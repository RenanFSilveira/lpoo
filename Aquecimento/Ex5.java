package Aquecimento;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Faça um aplicativo que vai armazenar na fila vários valores
inteiros (o programa pára de armazenar quando o usuário
digitar 0 – zero), mostrar o valor que está no início da fila,
remover todos os elementos da fila e, em seguida, mostrar
todos os elementos removidos na tela
 */

public class Ex5 {
    public static void main(String[] args) throws Exception {
        FilaInt fila = new FilaInt();
        Scanner entrada = new Scanner(System.in);

        fila = preencheFila(entrada, fila);
        System.out.println("Primeiro da fila: " + fila.peek());

        removerFila(fila);
    }

    public static FilaInt preencheFila(Scanner entrada, FilaInt fila) {
        int numeroDigitado = -1;
        System.out.println("---- Preenchedor de fila ----");
        while (numeroDigitado != 0) {
            System.out.print("Digite um número -> ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                fila.enqueue(numeroDigitado);
            }
        }
        return fila;
    }

    public static void removerFila(FilaInt fila){
        int i, quant = fila.size();
        for (i=0; i<quant; i++){
            System.out.println(fila.peek());
            fila.dequeue();
        }
    }
}
