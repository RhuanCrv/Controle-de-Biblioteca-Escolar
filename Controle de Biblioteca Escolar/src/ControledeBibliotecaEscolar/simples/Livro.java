package ControledeBibliotecaEscolar.simples;

public class Livro {
    public String titulo;
    public String autor;
    public int quantidade;

    public Livro(String titulo, String autor, int quantidade) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O título do livro é obrigatório!");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Erro: A quantidade não pode ser negativa!");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }
}
