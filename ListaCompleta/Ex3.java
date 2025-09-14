package ListaCompleta;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Faça um programa que leia duas listas de inteiros e, a
partir delas, construa uma terceira lista com os elementos
das duas primeiras intercalados. Em seguida, as três listas
serão mostradas na tela.
Por exemplo: [1,2,3] [4, 5, 6] ==> [1,4,2,5,3,6]
[1,2,3] [4] ==> [1,4,2,3]
[] [8,5,10] ==> [8,5,10]
 */

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaUm = new ArrayList<Integer>();
        ArrayList<Integer> listaDois = new ArrayList<Integer>();
        ArrayList<Integer> listaFinal = new ArrayList<Integer>();

        preencheLista(entrada, listaUm);
        preencheLista(entrada, listaDois);
        int quantUm = listaUm.size(), quantDois = listaDois.size();

        System.out.println("Lista 1: " + listaUm);
        System.out.println("Lista 2: " + listaDois);

        for (int quantFinal = 0; quantFinal != quantUm + quantDois; quantFinal++) {
            if (listaUm.isEmpty() == false) {
                listaFinal.add(listaUm.getFirst());
                listaUm.removeFirst();
            }
            if (listaDois.isEmpty() == false) {
                listaFinal.add(listaDois.getFirst());
                listaDois.removeFirst();
            }
        }

        System.out.println("Lista intercalada: " + listaFinal);

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
