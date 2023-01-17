/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.parimpar;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor a ser verificado: ");
        int num = valor.nextInt();
        if(num%2==0){
            System.out.println("O número digitado é par.");
        }else{
            System.out.println("O número digitado é impar.");
        }
        
        
        
    }
}
