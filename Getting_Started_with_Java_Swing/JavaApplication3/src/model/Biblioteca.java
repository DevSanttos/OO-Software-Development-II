/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Usuario;

/**
 *
 * @author jonat
 */
public class Biblioteca {
    private static Biblioteca instanciaUnica;
    private static int cod = 1;
    private int id;
    private String nome;

    private Biblioteca( String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public static Biblioteca getInstancia(String nome) {
        if (instanciaUnica == null) {
            instanciaUnica = new Biblioteca(nome);
        }
        return instanciaUnica;
    }

    public static Biblioteca getInstancia() {
        if (instanciaUnica == null) {
            throw new IllegalStateException("A Biblioteca ainda não foi inicializada.");
        }
        return instanciaUnica;
    }
    
     private void setId() {
        this.id = Biblioteca.cod++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nome=" + nome + '}';
    }
    
    

}       
