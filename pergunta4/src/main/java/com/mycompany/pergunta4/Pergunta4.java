/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta4;

import javax.swing.JOptionPane;

/**
 *
 * @author f.oliveira
 */
public class Pergunta4 {

    public static void main(String[] args) {
     
        int antecessor = 1, sucessor = 1;
        
        int numero = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero")); 
        
        antecessor = numero - antecessor;
        sucessor = sucessor + numero;
        
        JOptionPane.showMessageDialog(null,"Antecessor e: "+antecessor);
        JOptionPane.showMessageDialog(null,"Sucessor e: "+sucessor);
            
    }
}
