/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;
import model.Biblioteca;
import model.Emprestimo;
import model.GerenciaEmprestimo;
import model.Livro;
import model.Usuario;
import model.UsuarioCliente;
import view.BibliotecaView;

/**
 *
 * @author jonat
 */
public class main {
    public static void main(String[] args) {
        //criando objetos
        Biblioteca biblioteca = Biblioteca.getInstancia("Biblioteca do Jonathan");
        Livro livro1 = new Livro( "01", "Teste1");
        Livro livro2 = new Livro( "02", "Teste2");
        Livro livro3 = new Livro( "03", "Teste3");
        Livro livro4 = new Livro( "04", "Teste4");
        
        Emprestimo emprestimo1 = new Emprestimo(LocalDate.now());
        Emprestimo emprestimo2 = new Emprestimo(LocalDate.now());
        
        UsuarioCliente userCliente1 = new UsuarioCliente("Jonathan", "Santos", "k");
        UsuarioCliente userCliente2 = new UsuarioCliente("Jhon", "Rezende", "j");
        
        GerenciaEmprestimo gerenciaEmprestimo = new GerenciaEmprestimo();
        
        //add no carrinho de compra
        emprestimo1.addLivros(livro1);
        emprestimo1.addLivros(livro2);
        emprestimo1.addLivros(livro3);
        emprestimo1.addLivros(livro4);
        
        
        System.out.println("disponibilidade dos livros: " + livro1.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro2.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro3.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro4.getDisponibilidade());
        
        System.out.println("Status emprestimo: " + emprestimo1.getStatus());
        
        System.out.println("data dev " + emprestimo1.getDataDev()); 
        System.out.println("data emp " + emprestimo1.getDataEmp()); 
        System.out.println("data prev" + emprestimo1.getDataPrev()); 
     
        gerenciaEmprestimo.realizaEmprestimo(userCliente1, emprestimo1);
        
        System.out.println("data dev" + emprestimo1.getDataDev()); 
        System.out.println("data emp" + emprestimo1.getDataEmp()); 
        System.out.println("data prev" + emprestimo1.getDataPrev()); 
        
        System.out.println("Status emprestimo: " + emprestimo1.getStatus());
        
        System.out.println("disponibilidade dos livros: " + livro1.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro2.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro3.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro4.getDisponibilidade());
        
        gerenciaEmprestimo.realizaDevolucao(userCliente1, emprestimo1);
        
        System.out.println("data dev" + emprestimo1.getDataDev()); 
        System.out.println("data emp" + emprestimo1.getDataEmp()); 
        System.out.println("data prev" + emprestimo1.getDataPrev()); 
        
        System.out.println("Status emprestimo: " + emprestimo1.getStatus());
        
        System.out.println("disponibilidade dos livros: " + livro1.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro2.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro3.getDisponibilidade());
        System.out.println("disponibilidade dos livros: " + livro4.getDisponibilidade());
        
        //Instanciando a view
        BibliotecaView view = new BibliotecaView();
        view.setVisible(true);
    }
}

