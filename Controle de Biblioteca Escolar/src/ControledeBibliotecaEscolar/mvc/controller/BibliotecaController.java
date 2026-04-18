package ControledeBibliotecaEscolar.mvc.controller;

import ControledeBibliotecaEscolar.mvc.model.Emprestimo;
import ControledeBibliotecaEscolar.mvc.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private List<Livro> acervo = new ArrayList<>();
    private List<Emprestimo> emprestimosAtivos = new ArrayList<>();

    public void adicionarLivroAoAcervo(Livro livro) {
        acervo.add(livro);
    }

    public String processarEmprestimo(String nomeAluno, String tituloLivro) {
        for (Livro l : acervo) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro)) {
                if (l.getQuantidade() > 0) {
                    l.setQuantidade(l.getQuantidade() - 1);
                    emprestimosAtivos.add(new Emprestimo(nomeAluno, l));
                    return "Sucesso: Livro '" + l.getTitulo() + "' emprestado a " + nomeAluno;
                } else {
                    return "Erro: O livro '" + l.getTitulo() + "' está esgotado no momento.";
                }
            }
        }
        return "Erro: Livro não encontrado no acervo.";
    }

    public List<Emprestimo> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }
}
