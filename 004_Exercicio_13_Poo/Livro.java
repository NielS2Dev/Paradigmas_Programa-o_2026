public class Livro {

    private String titulo;
    private String autor;
    private String assunto;
    private int qtdExemplares;
    private int qtdEmprestados;
    private double preco;

    public Livro() {

    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getQtdExemplares() {
        return qtdExemplares;
    }

    public int getQtdEmprestados() {
        return qtdEmprestados;
    }

    public double getPreco() {
        return preco;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setQtdExemplares(int qtdExemplares) {
        this.qtdExemplares = qtdExemplares;
    }

    public void setQtdEmprestados(int qtdEmprestados) {
        this.qtdEmprestados = qtdEmprestados;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro(String titulo, String autor, String assunto,
                 int qtdExemplares, int qtdEmprestados, double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.qtdExemplares = qtdExemplares;
        this.qtdEmprestados = qtdEmprestados;
        this.preco = preco;
    }
}