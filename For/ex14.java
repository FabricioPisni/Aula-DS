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

public class ex14 {
    public static void main(String[] args) {
        double pais_a = 80000;
        double pais_b = 200000;

        double taxa_pais_a = (pais_a / 100) * 1.5;

        int anos = 0;

        while(pais_a < pais_b){
            pais_a = pais_a + taxa_pais_a;
            anos++;
        }
        
        System.out.println("A quantidade de anos necessarias para o Pais A alcançar o país B é de: " + anos + "anos");
     }
        
}
