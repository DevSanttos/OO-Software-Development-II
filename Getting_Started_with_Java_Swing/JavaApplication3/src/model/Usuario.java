/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonat
 */
public abstract class Usuario {
    public static int cod = 1;
    private int id;
    private String nome;
    private String username;
    private String passport;

    public Usuario(String nome, String username, String passport) {
        this.setId();
        this.nome = nome;
        this.username = username;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = Usuario.cod++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String texto) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + this.id + ", nome=" + this.nome + ", username=" + this.username + ", passport=" + this.passport + '}';
    }
}
