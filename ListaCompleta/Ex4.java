package ListaCompleta;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Escreva um programa, usando métodos, que leia uma
lista de inteiro. Depois preencha uma lista com metade dos
dados da lista original e na outra lista, a segunda metade dos
dados.
 */

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaUm = new ArrayList<>();
        ArrayList<Integer> listaDois = new ArrayList<>();
        ArrayList<Integer> listaOriginal = new ArrayList<>();

        preencheLista(entrada, listaOriginal);
        splitLista(listaOriginal, listaUm, listaDois);
        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista um: " + listaUm);
        System.out.println("Lista dois: " + listaDois);
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

    public static void splitLista(ArrayList<Integer> listaOriginal, ArrayList<Integer> listaUm, ArrayList<Integer> listaDois) {
        int i=0;

        for(int num: listaOriginal){
            if (i%2==0){
                listaUm.add(num);
            } else {
                listaDois.add(num);
            }
            i++;
        }
    }
}
