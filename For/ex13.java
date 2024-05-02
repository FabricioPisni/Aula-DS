/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;

public class ex13 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int num;
         
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        
        while(num <= 0 || num > 10){
            System.out.println("Numero invalido virgula digite novamente");
            num = sc.nextInt();

        }
        
       for(int i=0; i<=10; i++ ){
             System.out.println("Tabuada " +num*i);    
         }
         
     }
}