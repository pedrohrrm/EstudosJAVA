/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.numerosrepeticao;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class NumerosRepeticao {

    public static void main(String[] args) {
        int n, s =0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um número");
            n = teclado.nextInt();
            s += n; //é a mesma coisa que s = s + n
            System.out.println("Quer continuar? [s/n]");
            resp = teclado.next();
        }while(resp.equals("s"));
        System.out.println("A soma de todos os valores é: "+ s);
    }
}
