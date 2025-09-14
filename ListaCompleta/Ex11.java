package ListaCompleta;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {

    /*
     * Faça um programa, usando PilhaInt, que preencha uma
     * pilha. Mostre na tela. Some todos os elementos da pilha, sem
     * modificá-la. Mostre a pilha na tela novamente
     */

    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        preencherPilha(pilha);
        System.out.println("\nPilha original:");
        imprimirPilha(pilha);
        int soma = somaPilha(pilha);
        System.out.println("\nSoma de todos os elementos da pilha: " + soma);
        System.out.println("\nPilha depois:");
        imprimirPilha(pilha);
    }

    public static void preencherPilha(PilhaInt pilha) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = 0, i = 0;
        System.out.println("---- Preenche Pilha ----");

        do {
            System.out.print("Digite um número: ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                pilha.push(numeroDigitado);
            }
            i++;
        } while (numeroDigitado != 0);
        entrada.close();
    }

    // Imprime a pilha original
    public static void imprimirPilha(PilhaInt pilha) {
        PilhaInt pilhaAux = new PilhaInt();
        int i, quant = pilha.size(), numeroAtual;
        System.out.println("Pilha completa: ");
        for (i = 0; i < quant; i++) {
            numeroAtual = pilha.top();
            System.out.println(pilha.top());
            pilhaAux.push(numeroAtual);
            pilha.pop();
        }

        for (i = 0; i < quant; i++) {
            numeroAtual = pilhaAux.top();
            pilha.push(numeroAtual);
            pilhaAux.pop();
        }
    }

    public static int somaPilha(PilhaInt pilha) {
        PilhaInt pilhaAux = new PilhaInt();
        int soma = 0, quant = pilha.size(), numeroAtual = pilha.top();

        for (int i = 0; i < quant; i++) {
            numeroAtual = pilha.top();
            soma += numeroAtual;
            pilha.pop();
            pilhaAux.push(numeroAtual);
        }

        for (int i=0; i<quant; i++){
            pilha.push(pilhaAux.top());
            pilhaAux.pop();
        }

        return soma;
    }
}
