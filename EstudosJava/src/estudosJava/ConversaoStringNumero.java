
package estudosJava;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro valor:");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo valor:");
        System.out.println(valor1 + valor2);//nesse caso não é uma soma, e sim uma concatenação.
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        
        double soma = numero1 + numero2;
        
        System.out.println("A soma é: " + soma);
        System.out.println("A média é:" + soma/2);
    }
    
}
