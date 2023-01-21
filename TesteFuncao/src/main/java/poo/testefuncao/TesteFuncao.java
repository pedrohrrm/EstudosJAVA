/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.testefuncao;

/**
 *
 * @author pedro
 */
public class TesteFuncao {
    static int soma (int a, int b){
        int s = a + b;
        //System.out.println("A soma é: " + s);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa...");
        int sm = soma(5,2);
        System.out.println("A soma vale: " + sm);
    }
}
