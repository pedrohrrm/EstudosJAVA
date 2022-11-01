/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudosJava;

/**
 *
 * @author pedro
 */
public class NotacaoPonto {

    public static void main(String[] args) {
        double g = 2.3;
        String s = "Bom dia X";
        s = s.toUpperCase();
        System.out.println(s);
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Pedro".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Pedro").toUpperCase()
                .concat("!!");
        System.out.println(y);

        //Tipos primitivos não possuem o operador.
        int a = 3;
        System.out.println(a);

    }

}
