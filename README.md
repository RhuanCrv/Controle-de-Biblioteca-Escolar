Planejamento do meu projeto - Biblioteca Escolar
Neste arquivo, eu listei como organizei as informações e quais regras eu criei para o sistema não dar erro e funcionar direito, conforme o que foi pedido.

Exercício da Biblioteca
O foco aqui foi controlar os livros e não deixar emprestar o que não tem no estoque.

O que o sistema guarda (Tabelas):

Livro: Título, o autor e quantos livros tem na prateleira.

Empréstimo: O nome do aluno e qual livro ele pegou.
Regras que eu criei:

Antes de emprestar, o sistema checa se a quantidade é maior que zero. Se for zero, ele avisa que acabou.

Quando o aluno pega o livro, o sistema tira 1 da quantidade do estoque automaticamente.

Não aceita deixar o título do livro ou o nome do aluno vazio.

Como eu organizei o código
Eu usei o padrão MVC para deixar as pastas separadas:

Model: Onde ficam as informações dos produtos, livros e clientes.

Controller: Onde fica a "mágica" de fazer as contas e procurar os itens nas listas.

View: Onde eu usei o Scanner para conversar com quem está usando o programa.
Autor

Rhuan de Carvalho - Desenvolvedor do Projeto
Disciplina: Estrutura de Sistemas e Aplicações
