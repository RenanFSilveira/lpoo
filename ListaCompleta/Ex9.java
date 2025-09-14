package ListaCompleta;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

/*
 * Faça um programa que preencha duas listas, crie uma
terceira lista que armazenará os elementos que aparecem
em apenas umas das listas. Mostre as três listas na tela
 */

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaUm = new ArrayList<>();
        ArrayList<Integer> listaDois = new ArrayList<>();
        LinkedHashSet<Integer> listaFinal = new LinkedHashSet<>();

        preencheLista(entrada, listaUm);
        preencheLista(entrada, listaDois);
        int quantUm = listaUm.size(), quantDois = listaDois.size();
        for (int i=0; i<quantUm; i++){
            for (int j=0; j<quantDois; j++){
                if (listaUm.get(i) == listaDois.get(j)){
                    listaFinal.add(listaUm.get(i));
                }
            }
        }

        System.out.println("Lista um: " + listaUm);
        System.out.println("Lista dois: " + listaDois);
        System.out.println("Lista final: " + listaFinal);
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
