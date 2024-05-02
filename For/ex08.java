/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno CA
 */
 public class ex08 {
    public static void main(String[] args) {
        
        int num = 10;
       
        for( int i = 10; i >= num; i --){

            if(i < 0){
                break;
            }
            
            num = num - i;
            
            System.out.println("Numeros em ordem decrescente " + i);
            
            
        }
            
    }
}