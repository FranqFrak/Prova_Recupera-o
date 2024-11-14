/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Pergunta8 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numero;
        
         System.out.println("Digite um numero:");
          numero = sc.nextInt();
          
            for(int i=0;i<=10;i++){
             System.out.println(i*numero);
            }
           
            FileWriter arquivo = new FileWriter ("C:\\Users\\TABUADA.txt");
            PrintWriter gravar = new PrintWriter(arquivo);
            
            gravar.println("TABUADA DE NUMERO");
    }
}
