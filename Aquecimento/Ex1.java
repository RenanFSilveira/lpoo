package Aquecimento;

import java.util.Scanner;
import java.util.ArrayList;

/*
 Faça um programa que preencha uma ArrayList com
números inteiros (ele deve parar de armazenar quando
digitar zero), mostre a lista original na tela, retire todos os
números pares da lista e imprima a lista final na tela
 */

public class Ex1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listaCompleta = new ArrayList<>();
        ArrayList<Integer> listaImpares = new ArrayList<>();

        listaCompleta = preenchedor();
        listaImpares = removePares(listaCompleta);

        System.out.println("Lista completa: " + listaCompleta + "\nLista de ímpares: " + listaImpares);
    }

    public static ArrayList<Integer> preenchedor() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numeroDigitado = -1;

        System.out.println("---- Preenchimento de Arraylist ----");
        do {
            System.out.print("Digite um numero inteiro -> ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                lista.add(numeroDigitado);
            }
        } while (numeroDigitado != 0);

        entrada.close();
        return lista;
    }

    public static ArrayList<Integer> removePares(ArrayList<Integer> listaOriginal) {
        ArrayList<Integer> listaImpares = new ArrayList<>();

        for (int num : listaOriginal) {
            if (num % 2 == 1) {
                listaImpares.add(num);
            }
        }
        return listaImpares;
    }
}