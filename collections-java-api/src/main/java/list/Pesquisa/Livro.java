package main.java.list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro titulo: "+ getTitulo()+", Autor: "+getAutor()+", Ano de publicação: "+getAnoPublicacao()+".";
    }
}
