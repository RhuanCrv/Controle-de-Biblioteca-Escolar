package ControledeBibliotecaEscolar.mvc.model;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(String titulo, String autor, int quantidade) {

        if (titulo == null || titulo.trim().isEmpty()) throw new IllegalArgumentException("Título inválido");
        if (quantidade < 0) throw new IllegalArgumentException("Quantidade não pode ser negativa");

        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
