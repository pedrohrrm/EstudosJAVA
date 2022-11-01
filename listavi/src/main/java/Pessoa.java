
public class Pessoa {

    private String nome;
    private String sobrenome;
    private static int contador;

    public Pessoa() {
        Pessoa.contador = Pessoa.contador + 1;
    } //não usa this no metodo estatico pois ele não depende da criação de objeto para ser chamado.

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        Pessoa.contador = Pessoa.contador + 1; //incrementando a cada chamada.
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public static int getContador() {
        return contador;
    }

}
