
package poo.aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){//nese construtor estou setando que a caneta está tampada e tem cor azul.
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
public void status()    {
    System.out.println("Sobre a Caneta:");
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Cor da caneta: " + this.cor);
    System.out.println("Está tampada?" + this.tampada);
}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
