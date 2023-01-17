/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.programaidade;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int nascimento = teclado.nextInt();
        int idade = 2023 - nascimento;
        if (idade>=18){
            System.out.println("Você é maior de idade, pois possui " +idade+ " anos.");
        }else{
            System.out.println("Você é menor de idade, pois possui " +idade+ " anos.");
        }
    }
}
