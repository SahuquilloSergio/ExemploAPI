/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergio.pruebapi;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 *
 * @author serxa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String login = JOptionPane.showInputDialog("Introduzca nombre de Usuario");
        String password = JOptionPane.showInputDialog("Introduzca la contraseña");
        String nombrerepositorio = JOptionPane.showInputDialog("Introduzca Nombre Del Repositorio");
        String descripcionrepositorio = JOptionPane.showInputDialog("Introduzca descripcion del repositorio");
        GitHub github = GitHub.connectUsingPassword(login, password);
        GHRepository repo = github.createRepository(
        nombrerepositorio,descripcionrepositorio,
        "http://www.github.com/SahuquilloSergio/api",true);
    }
    
}
