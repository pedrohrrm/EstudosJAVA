/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.programamedia;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("A sua média foi: " + m);
        if(m>9){
            System.out.println("Parabens!!");
        }
                
      
    }
}
