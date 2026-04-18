package ControledeBibliotecaEscolar.mvc.view;

import ControledeBibliotecaEscolar.mvc.controller.BibliotecaController;
import ControledeBibliotecaEscolar.mvc.model.Livro;
import ControledeBibliotecaEscolar.mvc.model.Emprestimo;

import java.util.Scanner;

public class Main {
    private static Scanner leitor = new Scanner(System.in);
    private static BibliotecaController controller = new BibliotecaController();

    public static void main(String[] args) {
        controller.adicionarLivroAoAcervo(new Livro("Java para Iniciantes", "Rhuan", 2));
        controller.adicionarLivroAoAcervo(new Livro("Estrutura de Dados", "Carvalho", 1));

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n Biblioteca Don Rhuan de Carvalho: ");
            System.out.println("1. Novo Empréstimo");
            System.out.println("2. Listar Livros Emprestados");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(leitor.nextLine());
                if (opcao == 1) telaEmprestimo();
                else if (opcao == 2) telaListagem();
            } catch (Exception e) {
                System.out.println("Erro: Opção inválida.");
            }
        }
    }

    private static void telaEmprestimo() {
        String aluno = lerTexto("Nome do Aluno: ");
        String titulo = lerTexto("Título do Livro: ");

        String resultado = controller.processarEmprestimo(aluno, titulo);
        System.out.println(resultado);
    }

    private static void telaListagem() {
        System.out.println("\n--- LISTA DE EMPRÉSTIMOS ---");
        if (controller.getEmprestimosAtivos().isEmpty()) {
            System.out.println("Nenhum livro emprestado no momento.");
        } else {
            for (Emprestimo e : controller.getEmprestimosAtivos()) {
                System.out.println("Aluno: " + e.getNomeAluno() + " | Livro: " + e.getLivro().getTitulo());
            }
        }
    }

    private static String lerTexto(String msg) {
        String t = "";
        while (t.trim().isEmpty()) {
            System.out.print(msg);
            t = leitor.nextLine();
            if (t.trim().isEmpty()) System.out.println("Erro: Campo obrigatório.");
        }
        return t;
    }
}