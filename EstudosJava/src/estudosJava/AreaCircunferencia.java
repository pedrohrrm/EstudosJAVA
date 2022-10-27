/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudosJava;

/**
 *
 * @author pedro
 */
public class AreaCircunferencia {
    public static void main(String[] args) {
        System.out.println(2+3);
        double raio = 3.4;
        final double PI = 3.14159;//transformando a variável pi em constante. COLOCA-SE LETRA MAIÚSCULA.
        double area = PI * raio * raio;
        double temperatura = 86;
        final int CONS = 32;
        final double CONS2 = 5.0/9.0;
        double c = (temperatura  - CONS) * CONS2;
        System.out.println("A área é:" + area + "m2.");
        System.out.println("O resultado é " + c + "ºC.");

    }
}
