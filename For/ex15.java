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

public class ex15 {
    public static void main(String[] args) {
        int numero = 10; 
        int termoUm = 1;
        int termoDois = 1;

        System.out.println("Série de Fibonacci até o " + numero + "º termo:");
        System.out.print(termoUm + " " + termoDois + " ");
        
        for (int i = 3; i <= numero; i++) {
            int proximoTermo = termoUm + termoDois;
            System.out.print(proximoTermo + " ");
            termoUm = termoDois;
            termoDois = proximoTermo;
        }
        
    }
}