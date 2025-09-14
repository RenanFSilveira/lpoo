package ListaCompleta;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * Escreva um programa que leia vários inteiros, coloque em
uma pilha. Em seguida, retire todos os números iguais da
pilha
 */

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();

        preencherPilha(pilha);
        System.out.println("Pilha original: ");
        imprimirPilha(pilha);
        removerDuplicatas(pilha);
        System.out.println("Pilha depois: ");
        imprimirPilha(pilha);

        entrada.close();
    }

    public static void preencherPilha(PilhaInt pilha) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado = 0, i = 0, quant;
        System.out.println("---- Preenche Pilha ----");

        do {
            System.out.print("Digite um número: ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                pilha.push(numeroDigitado);
            }
            i++;
        } while (numeroDigitado != 0);
    }

    public static void removerDuplicatas(PilhaInt pilha) {
        LinkedHashSet<Integer> lista = new LinkedHashSet<>();
        int numeroAtual, quant = pilha.size();

        for (int i = 0; i < quant; i++) {
            numeroAtual = pilha.top();
            lista.add(numeroAtual);
            pilha.pop();
        }

        quant = lista.size();
        for (int i = 0; i < quant; i++) {
            pilha.push(lista.getLast());
            lista.removeLast();
        }
    }

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
}
