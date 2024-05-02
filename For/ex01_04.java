/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;

public class ex01_04 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        double valor1;
        double valor2;
        
        System.out.println("Digite o primeiro número: ");
        valor1 = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        valor2 = sc.nextInt();
        
        while(valor2 == 0){
            System.out.println("0 não é um valor válido. Digite outro número: ");
            valor2 = sc.nextInt();
        }
        
        double divisao;
        
        divisao = valor1/valor2;
        
        System.out.println("O resultado da divisão é: "+divisao);

     }
}