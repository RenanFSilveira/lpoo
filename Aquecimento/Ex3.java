package Aquecimento;

/*
 * Faça a classe UsaAluno usando um ArrayList de Aluno
com o menu:
1 - Cadastrar
2 - Pesquisar pela matricula
3 - Imprimir todos (somente o nome)
4 - Sair
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        int opcao = -1;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Pesquisar pela matrícula");
            System.out.println("3 - Imprimir todos (somente o nome)");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    cadastraAluno(listaAlunos, entrada);
                    break;
                case 2:
                    pesquisarAlunos(listaAlunos, entrada);
                    break;
                case 3:
                    imprimirAlunos(listaAlunos);
                    break;
                case 9:
                    break;
            }
        } while (opcao != 9);
    }

    public static ArrayList<Aluno> cadastraAluno(ArrayList<Aluno> listaAlunos, Scanner entrada) {
        int matricula;
        String nome;
        System.out.print("Digite o nome -> ");
        nome = entrada.nextLine();
        System.out.print("Digite a matricula -> ");
        matricula = entrada.nextInt();
        listaAlunos.add(new Aluno(nome, matricula));
        return listaAlunos;
    }

    public static void pesquisarAlunos(ArrayList<Aluno> listaAlunos, Scanner entrada) {
        int matriculaBuscada, achou = 0;
        System.out.print("Digite a matricula buscada -> ");
        matriculaBuscada = entrada.nextInt();
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula() == matriculaBuscada) {
                System.out.println("Aluno encontrado, nome: " + aluno.getNome());
                achou++;
            }
        }
        if (achou == 0) {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void imprimirAlunos(ArrayList<Aluno> listaAlunos) {
        System.out.println("Lista de alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getNome());
        }

    }

}
