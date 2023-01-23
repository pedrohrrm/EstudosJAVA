/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.aula02;

/**
 *
 * @author pedro
 */
public class Aula02 {

    public static void main(String[] args) {
        System.out.println("-----CANETA 1-----");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.tampada = false;
        //c1.tampar();
        c1.destampar();
        c1.status();
        c1.rabiscar();
                System.out.println("-----CANETA 2-----");

        Caneta c2 = new Caneta();
        c2.carga = 80;
        c2.cor = "Vermelho";
        c2.ponta = 1.0f;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
