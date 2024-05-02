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

public class ex10 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
        int numero; 
        int i;
        
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        
        for(i = 1; i < numero; i++){
            System.out.println("Os números correspondidos entre os intervalos são: " +i);
        }
        
     }
    
}