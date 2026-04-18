package ControledeBibliotecaEscolar.simples;

import java.util.Scanner;

public class Main {
    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("CAD. INICIAL DO LIVRO");

        String titulo = lerTexto("Título do livro: ");
        String autor = lerTexto("Autor do livro: ");
        int qtd = (int) lerValorNumerico("Quantidade disponível: ");

        Livro livroAcervo = new Livro(titulo, autor, qtd);

        System.out.println("\n--Realizar Emprestimo--");
        String aluno = lerTexto("Nome do Aluno: ");

        if (livroAcervo.quantidade > 0) {
            Emprestimo novoEmprestimo = new Emprestimo(aluno, livroAcervo);
            livroAcervo.quantidade--;

            System.out.println("\n-------------------------------");
            System.out.println("Emprestimo Realizado!");
            System.out.println("Livro: " + novoEmprestimo.livro.titulo);
            System.out.println("Aluno: " + novoEmprestimo.nomeAluno);
            System.out.println("Estoque atual do livro: " + livroAcervo.quantidade);
            System.out.println("-------------------------------");
        } else {
            System.out.println("\nERRO: Não há exemplares de '" + livroAcervo.titulo + "' disponíveis.");
        }

    }

    private static String lerTexto(String mensagem) {
        String entrada = "";
        while (entrada.trim().isEmpty()) {
            System.out.print(mensagem);
            entrada = leitor.nextLine();
            if (entrada.trim().isEmpty()) {
                System.out.println("Erro: Este campo não pode ficar vazio!");
            }
        }
        return entrada;
    }

    private static double lerValorNumerico(String mensagem) {
        double valor = -1;
        while (valor < 0) {
            System.out.print(mensagem);
            try {
                valor = Double.parseDouble(leitor.nextLine());
                if (valor < 0) System.out.println("Erro: O valor não pode ser negativo!");
            } catch (Exception e) {
                System.out.println("Erro: Digite um número válido!");
            }
        }
        return valor;
    }
}
