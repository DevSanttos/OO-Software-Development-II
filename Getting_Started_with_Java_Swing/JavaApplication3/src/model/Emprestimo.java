/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author jonat
 */

public class Emprestimo {
    private static AtomicInteger codGenerator = new AtomicInteger(1);
    private int id;
    private LocalDate dataEmp;
    private LocalDate dataPrev;
    private LocalDate dataDev;
    private boolean status;
    private final ArrayList<Livro> livros;

    public Emprestimo(LocalDate dataEmp) {
        this.id = codGenerator.getAndIncrement();
        livros = new ArrayList<Livro>();
        this.setDataEmp(dataEmp);
        this.status = false;
    }
    
    public void addLivros(Livro livro) {
        if (livro != null && !this.livros.contains(livro)) {
            this.livros.add(livro);
        }   
    }

    public void removeLivros(Livro liv) {
        this.livros.remove(liv);
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }
    
    public int getId() {
        return id;
    }
    
    public void setDataEmp(LocalDate dataEmp) {
        this.dataEmp = dataEmp;
    }

    public void setDataPrev(LocalDate dataPrev) {
        this.dataPrev = dataPrev;
    }

    public void setDataDev(LocalDate dataDev) {
        this.dataDev = dataDev;
    }

    public LocalDate getDataEmp() {
        return dataEmp;
    }

    public LocalDate getDataPrev() {
        return dataPrev;
    }

    public LocalDate getDataDev() {
        return dataDev;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "dataEmp=" + dataEmp + ", dataPrev=" + dataPrev + ", dataDev=" + dataDev + ", status=" + status + ", livros=" + livros + '}';
    }
    
    
}