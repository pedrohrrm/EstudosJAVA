/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.aula02;

/**
 *
 * @author pedro
 */
public class Caneta {
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? "+ this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! não é pssível escrever com a caneta tampada.");
        }else{
            System.out.println("A caneta está destampada, estou escrevendo.");
        }
        
    }
     public void tampar(){
        this.tampada = true;
        
    }
    public void destampar(){
        this.tampada = false;
        
    }
}
