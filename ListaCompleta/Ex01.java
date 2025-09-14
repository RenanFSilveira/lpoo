package ListaCompleta;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;

/*
 *  Faça um programa que leia duas listas de inteiros e
preencha uma outra lista com todos os elementos das duas
listas originais, sem repetição e ordenados. Ao final, mostre
as três listas na tela. Por exemplo: [3,6,5,3,7] [2,9,7,5,1] ==> [1,2,3,5,6,7,9]
 */

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaUm = new ArrayList<>();
        ArrayList<Integer> listaDois = new ArrayList<>();
        TreeSet<Integer> listaAux = new TreeSet<>();

        listaUm = preencheLista(entrada, listaUm);
        listaDois = preencheLista(entrada, listaDois);

        listaAux.addAll(listaUm);
        listaAux.addAll(listaDois);

        System.out.println("Lista 1: " + listaUm);
        System.out.println("Lista 2: " + listaDois);
        System.out.println("Lista final:" + listaAux);
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
}
