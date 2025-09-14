package Aquecimento;

/*
 * Faça um programa que preencha uma LinkedList com
 * números inteiros (ele deve parar de armazenar quando
 * digitar zero), mostre a lista original na tela, peça ao usuário
 * um número e mostre na tela a quantidade de vezes esse
 * número aparece na lista
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        int quantNumeros;
        LinkedList<Integer> listaOriginal = new LinkedList<>();
        listaOriginal = preencheLinked();
        System.out.println("lista original: " + listaOriginal);
        quantNumeros = buscaNumero(listaOriginal);
        if (quantNumeros == 0) {
            System.out.println("O número não foi encontrado na LinkedList.");
        } else {
            System.out.println("O numero buscado foi encontrado na lista " + quantNumeros + " vez(es).");
        }

    }

    public static LinkedList<Integer> preencheLinked() {
        Scanner entrada = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        int numeroDigitado = 0;
        System.out.println("---- Preenchendo LinkedList ----");
        do {
            System.out.print("Digite um número -> ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                lista.add(numeroDigitado);
            }
        } while (numeroDigitado != 0);

        return lista;
    }

    public static int buscaNumero(LinkedList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        int numeroBuscado, quantNumeros = 0;

        System.out.print("Digite um número para buscar -> ");
        numeroBuscado = entrada.nextInt();

        for (int num : lista) {
            if (num == numeroBuscado) {
                quantNumeros++;
            }
        }
        entrada.close();
        return quantNumeros;
    }
}
