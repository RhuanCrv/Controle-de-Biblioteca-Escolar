package ControledeBibliotecaEscolar.simples;

public class Emprestimo {
    public String nomeAluno;
    public Livro livro;

    public Emprestimo(String nomeAluno, Livro livro) {
        if (nomeAluno == null || nomeAluno.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O nome do aluno é obrigatório!");
        }
        if (livro == null) {
            throw new IllegalArgumentException("Erro: Livro inválido!");
        }
        this.nomeAluno = nomeAluno;
        this.livro = livro;
    }
}
