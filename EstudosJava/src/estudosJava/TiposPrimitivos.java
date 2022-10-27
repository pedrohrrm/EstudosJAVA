package estudosJava;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //Informações de funcionarios

        //tipos numericos inteiros
        byte anosEmpresa = 23;
        short numeroDeVoos = 3276;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;//temos que colocar o L para mostrar que passou de inteiro e pertence ao Long.

        //Tipos numericos reais
        float salario = 11_445.44F;//colocar o F, para mostrar que esse literal está no float e não no double.
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo boleano
        boolean estaDeFerias = false; //true

        //tipo caractere
        char status = 'A'; //ativo
        
        //dias de empresa
        System.out.println(anosEmpresa * 365);    
        
        //numero de viagens
        System.out.println(numeroDeVoos / 2);
        
        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println("");
        System.out.println(id + "recebe:" + salario);
        System.out.println("Férias?" + estaDeFerias);
        
    }

}
