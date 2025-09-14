package ListaCompleta;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaUm = new ArrayList<>();
        ArrayList<Integer> listaDois = new ArrayList<>();
        LinkedHashSet<Integer> listaFinal = new LinkedHashSet<>();

        preencheLista(entrada, listaUm);
        preencheLista(entrada, listaDois);
        LinkedHashSet<Integer> exclusivosListaUm = new LinkedHashSet<>(listaUm);
        exclusivosListaUm.removeAll(listaDois);

        LinkedHashSet<Integer> exclusivosListaDois = new LinkedHashSet<>(listaDois);
        exclusivosListaDois.removeAll(listaUm);

        listaFinal.addAll(exclusivosListaUm);
        listaFinal.addAll(exclusivosListaDois);

        System.out.println("Lista um original: " + listaUm);
        System.out.println("lista dois original: " + listaDois);
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
