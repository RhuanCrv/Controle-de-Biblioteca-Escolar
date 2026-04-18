package ControledeBibliotecaEscolar.mvc.model;

public class Emprestimo {
    private String nomeAluno;
    private Livro livro;

    public Emprestimo(String nomeAluno, Livro livro) {
        this.nomeAluno = nomeAluno;
        this.livro = livro;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public Livro getLivro() {
        return livro;
    }
}
