package poo.idadevotar;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class IdadeVotar {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = dado.nextInt();
        if (idade < 16) {
            System.out.println("Não Vota!");
        } else if ((idade >= 18) && (idade <= 70)) {
            System.out.println("Voto Obrigatório!");
        } else {
            System.out.println("Voto Opcional!");

        }

    }

}
