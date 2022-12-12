package poo.lanchonete;

public class Funcionario {
    public String nome, cpf, celular, dados;
    
//    Contador f1 = new Contador();
//    do{
//        f1.acrescentar();
//    } while(f1.valor < 15);


    

    public Funcionario(String nome, String cpf, String celular, String dados) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dados = dados;
    }

    public Funcionario() {
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public void dados(){
        System.out.println("Dados do funcionário" + this.getNome() + ":");
        System.out.println("Cpf:" + this.getCpf());
        System.out.println("Celular:" + this.getCelular());
                
    }

    
}

