package ListaCompleta;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Escreva um programa que, usando métodos, preencha
uma lista de inteiros, calcula a média dos valores da lista e
imprime tudo na tela. O cálculo não deve ser feito junto com
a entrada.
 */

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        preencheLista(entrada, lista);
        int media = calculaMedia(entrada, lista);

        System.out.println("Lista completa: " + lista + "\nMédia dos numeros: " + media);

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

    public static int calculaMedia(Scanner entrada, ArrayList<Integer> lista){
        int media=0, quant = lista.size();
        for (int num: lista){
            media += num;
        }
        media = (media/quant);
        return media;
    }

}
