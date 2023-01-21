/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package poo.vetor04;

import java.util.Arrays;

/**
 *
 * @author pedro
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.println(v + " ");

        }
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição: " + p);

    }
}
