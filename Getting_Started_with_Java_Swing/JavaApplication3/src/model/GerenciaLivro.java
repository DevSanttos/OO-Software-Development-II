    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonat
 */
public class GerenciaLivro {
    public static boolean tornarIndisponivel(Livro livro) {
        livro.setDisponibilidade(false);
        return true;
    }
    
    public static boolean tornarDisponivel(Livro livro) {
        livro.setDisponibilidade(true);
        return false;
    }
}
