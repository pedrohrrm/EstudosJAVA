/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.contador01;

/**
 *
 * @author pedro
 */
public class Contador01 {

    public static void main(String[] args) {
        int c = 0;
        while (c<10){
            c++;
            if(c == 5||c==7){
                continue;
            }
            if(c==6){
                break;
            }
            System.out.println("Cambalhota nº:" + c);
            
        }
    }
}
