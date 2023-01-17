/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.operadoresaritmeticos;

/**
 *
 * @author pedro
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é: " + m);
        int numero = 10;
        numero--;
        System.out.println(numero);
        
        //Pre e pós incremento
        int num = 10;
        int valor = 5 + num++;
        System.out.println(valor);
        System.out.println(num);
        int val = 5 + ++num;
        System.out.println(val);
        System.out.println(num);
        
        int x = 4;
        x += 2; //x = x + 2
        System.out.println(x);
        
        int y = 4;
        y -= 2; //y = y - 2
        System.out.println(y);
    }
}
