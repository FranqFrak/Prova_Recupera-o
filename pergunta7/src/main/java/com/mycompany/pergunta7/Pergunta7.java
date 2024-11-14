/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta7;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Pergunta7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String jog1,jog2,nFilme,p1,p2;
        
        System.out.println("Digite seu nome Jogador 1:");
          jog1 = sc.next();
        System.out.println(jog1+" Digite o nome do Filme:");  
          nFilme  = sc.next();
        System.out.println(jog1+" Digite a pista 1:");  
          p1  = sc.next(); 
        System.out.println(jog1+" Digite a pista 2:");  
          p2  = sc.next();  
          
         System.out.println("Digite seu nome Jogador 2:");
          jog2 = sc.next();  
          
    }
}
