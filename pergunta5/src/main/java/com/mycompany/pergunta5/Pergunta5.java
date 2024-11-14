/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta5;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Pergunta5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha;
        int senhaI = 1234;
        int senhaC = 9999;
        
        System.out.println("Digite sua senha:");
           senha = sc.nextInt();
           
           if(senha == senhaI){
            System.out.println("Usuario Invalido");
           }
           else if(senha == senhaC){
            System.out.println("Acesso Permitido");
           }
           else{
            System.out.println("Senha incorreta");
           }
    }
}
