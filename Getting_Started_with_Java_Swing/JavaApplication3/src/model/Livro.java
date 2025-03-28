/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonat
 */
public class Livro {
    public static int cod = 1;
    private int id;
    private String ISBN;
    private String titulo;
    private boolean disponibilidade;

    public Livro(String ISBN, String titulo) {
        this.setId();
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.setDisponibilidade(true); 
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public int getId() {
        return id;
    }

    private void setId() {
        this.id = Livro.cod++;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", ISBN=" + ISBN + ", titulo=" + titulo + ", disponibilidade=" + disponibilidade + '}';
    }
    
}
