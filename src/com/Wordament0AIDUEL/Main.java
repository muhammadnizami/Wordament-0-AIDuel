package com.Wordament0AIDUEL;


import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas utama 
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        JFrame mainWindow = new JFrame("Wordament-0-AIDuel");
        
        
        mainWindow.add(new JPanelKonfigurasi());
        mainWindow.setSize(500, 400);

        mainWindow.setLocationRelativeTo(null);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainWindow.setVisible(true);
        

    }
}
