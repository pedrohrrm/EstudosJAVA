/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package poo.vetor02;

/**
 *
 * @author pedro
 */
public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mes de " + mes[i] + " possui " + dias[i] + " dias");
        }
    }
}
