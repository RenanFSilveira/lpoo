package ListaCompleta;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Faça um programa que leia uma lista de inteiros e, a partir
dela, construa uma outra lista que contém os mesmos
elementos da primeira porém em ordem invertida. Em
seguida, as duas listas serão mostradas na tela
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> listaInversa = new ArrayList<Integer>();

        lista = preencheLista(entrada, lista);
        System.out.println("Lista original: " + lista);
        listaInversa = inverteOrdem(lista, listaInversa);
        System.out.println("Lista invertida: " + listaInversa);

        entrada.close();
    }

    public static ArrayList<Integer> preencheLista(Scanner entrada, ArrayList<Integer> lista) {
        System.out.println("---- preenchedor de lista ----");
        int numeroDigitado = -1;
        do {
            System.out.print("Digite um numero -> ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0) {
                lista.add(numeroDigitado);
            }
        } while (numeroDigitado != 0);
        return lista;
    }

    public static ArrayList<Integer> inverteOrdem(ArrayList<Integer> lista, ArrayList<Integer> listaInversa) {
        int numeroAtual, quant = lista.size();

        for (int i = 0; i < quant; i++) {
            numeroAtual = lista.get(i);
            listaInversa.addFirst(numeroAtual);
        }
        return listaInversa;
    }
}
