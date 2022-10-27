/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudosJava;

/**
 *
 * @author pedro
 */
public class Inferencia {

    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.3;
        System.out.println(b);
        //inferencia do tipo da variavel no JAVA 
        //na inferencia, não pode mudar o tipo da variavel se não declarar
        //apenas o java inferindo, ele não faz essa alteração
        var c = "Texto";
        System.out.println(c);
        c = "outro texto";
        System.out.println(c);
        
        double d;//variavel foi declarada
        d = 123.654;//variavel foi inicializada
        System.out.println(d); //variavel foi usada.
        
    }

}
