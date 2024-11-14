/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta6;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Pergunta6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1,n2,n3;
        double media;
       
        System.out.println("Digite um numero");
         n1 = sc.nextInt();
        System.out.println("Digite outro numero");
         n2 = sc.nextInt(); 
        System.out.println("Digite outro numero");
         n3 = sc.nextInt();
         
         media = (n1+n2+n3)/3;
         
         System.out.println("media e"+media);
    }
}
