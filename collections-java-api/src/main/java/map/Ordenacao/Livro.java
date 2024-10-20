package main.java.map.Ordenacao;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public int compareTo(Livro l) {
        return Double.compare(this.preco, l.getPreco());
    }

    @Override
    public String toString() {
        return "{ Livro= " + titulo + ", autor= " + autor + ", preco= " + preco + " } ";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
