/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta9;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Pergunta9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double peso;
        
        
        System.out.println("Digite seu nome:");
         nome = sc.next();
         
        System.out.println("Digite seu peso:");
          peso = sc.nextDouble(); 
          
         if(peso < 65){
          System.out.println("Pena");
         }  
         else if(peso >= 65 || peso < 72){
           System.out.println("leve");
         }
         
    
    
    }
}
