package pedro.listaix;


public class Principal {
    public static void main(String[] args) {
        double valorTotal = 2000.0;
        double valorEntrada = 200.0;
        int parcela = 15;
//o bloco try serve para tentar executar o comando abaixo, e caso aconteca uma exceção, vou executar a exceção
        try {
        Excecao C = new Excecao(valorTotal, valorEntrada, parcela);
        System.out.println(C.prestacao());
    }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    
}
