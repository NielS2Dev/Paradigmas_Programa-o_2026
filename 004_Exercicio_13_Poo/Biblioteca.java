public class Biblioteca {

    public static void main(String[] args) {

        // Objeto 1
        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setAutor("J.R.R. Tolkien");
        livro1.setAssunto("Fantasia");
        livro1.setQtdExemplares(10);
        livro1.setQtdEmprestados(2);
        livro1.setPreco(59.90);

        // Objeto 2
        Livro livro2 = new Livro();
        livro2.setTitulo("Dom Casmurro");
        livro2.setAutor("Machado de Assis");
        livro2.setAssunto("Literatura Brasileira");
        livro2.setQtdExemplares(5);
        livro2.setQtdEmprestados(0);
        livro2.setPreco(35.00);

        // Exibindo os dados
        System.out.println("--- Dados do Livro 1 ---");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Preço: R$ " + livro1.getPreco());

        System.out.println("\n--- Dados do Livro 2 ---");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Preço: R$ " + livro2.getPreco());
    }
}