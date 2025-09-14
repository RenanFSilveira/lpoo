package Aquecimento;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Faça um aplicativo que vai armazenar na pilha vários
valores inteiros (o programa pára de armazenar quando o
usuário digitar 0 – zero), mostrar o valor que está no topo da
pilha, remover todos os elementos da pilha e, em seguida,
mostrar todos os elementos removidos na tela.
 */

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        pilha = preenchePilha(entrada);
        imprimePilha(pilha);
    }

    public static PilhaInt preenchePilha(Scanner entrada){
        PilhaInt pilha = new PilhaInt();
        int numeroDigitado = 0;
        System.out.println("---- Preenchendo Pilha -----");
        do {
            System.out.print("Digite um número -> ");
            numeroDigitado = entrada.nextInt();
            if (numeroDigitado != 0){
                pilha.push(numeroDigitado);
            }
        } while (numeroDigitado != 0);
        return pilha;
    }

    public static void imprimePilha(PilhaInt pilha){
        PilhaInt aux = new PilhaInt();
        int quant, numeroAtual;
        quant = pilha.size();

        System.out.println("Pilha completa:");
        for (int i = 0; i<quant; i++){
            numeroAtual = pilha.top();
            aux.push(pilha.top());
            pilha.pop();
        }

        // Voltando a pilha original
        quant = aux.size();
        for (int i = 0; i < quant; i++){
            numeroAtual = aux.top();
            pilha.push(numeroAtual);
            aux.pop();
            System.out.println(numeroAtual);
        }
    }
}
