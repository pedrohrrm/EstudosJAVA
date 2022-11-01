
public class Sistema {

    public static void main(String[] args) {
        System.out.println(Pessoa.getContador());
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Pedro", "Henrique");
        System.out.println(Pessoa.getContador());
    }

}
