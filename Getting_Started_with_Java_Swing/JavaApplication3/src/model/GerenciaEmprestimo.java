/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import model.GerenciaLivro;
import model.Livro;

/**
 *
 * @author jonat
 */
public class GerenciaEmprestimo {

    private final Biblioteca biblioteca;

    public GerenciaEmprestimo() {
        this.biblioteca = Biblioteca.getInstancia();
    }

    public boolean realizaEmprestimo(Usuario user, Emprestimo emprestimo) {
        if (emprestimo.getLivros().isEmpty()) {
            return false;
        }

        if (emprestimo.getStatus()) {
            System.out.println("Erro ao realizar o emprestimo, tendo em vista que ele já está ativo!");
            return false;
        }

        if (verificaDisponibilidadeLivros(emprestimo, biblioteca)) {
            for (Livro livro : emprestimo.getLivros()) {
                GerenciaLivro.tornarIndisponivel(livro);
            }
            emprestimo.setDataDev(calculaDataDevolucao(user, emprestimo));
            emprestimo.setStatus(true);
            System.out.println("Empréstimo relizado com sucesso para o usuário de nome " + user.getNome() + "!");
            System.out.println("A data de devolução para o emprestimo em questão é: " + emprestimo.getDataDev());
            return true;
        }
        return false;
    }

    public boolean realizaDevolucao(Usuario user, Emprestimo emp) {
         if (!emp.getStatus()) {
                System.out.println("Erro ao realizar a devolução, posto que o empréstimo se encontra indisponível. (Status false)");
                return false;
            }

            if (emp.getLivros().isEmpty()) {
                System.out.println("Erro ao realizar a devolução, posto que o emprestimo em questão está vazio");
                return false;
            }

            for (Livro livro : emp.getLivros()) {
                GerenciaLivro.tornarDisponivel(livro);
            }

            emp.setDataDev(LocalDate.now());
            emp.setStatus(false);
            System.out.println("Devolução do empréstimo realizado com sucesso!");
            return true;
        }

    private boolean verificaDisponibilidadeLivros(Emprestimo emprestimo, Biblioteca biblioteca) {
        ArrayList<Livro> livrosEmprestimo = emprestimo.getLivros();

        for (Livro livro : livrosEmprestimo) {
            if (!livro.getDisponibilidade()) {
                System.out.println("O livro de nome: " + livro.getTitulo() + " está indisponível!");
                return false;
            }
        }
        return true;
    }

    private LocalDate calculaDataDevolucao(Usuario user, Emprestimo emprestimo) {
        LocalDate dataDevolucao = emprestimo.getDataEmp();
        return dataDevolucao.plusDays(10);
    }

}
