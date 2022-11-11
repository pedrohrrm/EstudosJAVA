
package estudosJava;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a =1; //implícita
        System.out.println(a);
        
        float b = (float ) 1.051; //explicita (CAST)//conversão explicita, de forma fácil seria 1.0F. Essa conversão fica explicito que o programador está cietne que pode haver perda de valores.
        System.out.println(b);       
        
        int c = 4; //JAVA não avalia os valores, e sim o tipo de dado.
        byte d = (byte) c; //explicita (CAST)
        System.out.println(d);
        
        double e = 1.9999;
        int f = (int) e; //explicita (CAST)
        System.out.println(f);
                
    }
           
    
}
