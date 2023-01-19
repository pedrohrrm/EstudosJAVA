/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package poo.programapernas;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas: ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isso é um(a)");
        switch (perna) {
            case 1 ->
                tipo = "Saci";
            case 2 ->
                tipo = "Bípede";
            case 3 ->
                tipo = "Tripé";
            case 4 ->
                tipo = "Quadrupede";
            case 5 ->
                tipo = "Aranha";
            default -> {
                tipo = "ET";
                break;
            }
        }
        System.out.println(tipo);

    }
}
