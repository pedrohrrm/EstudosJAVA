package pedro.listaix;

public class Excecao {
    public Double valorTotal;
    public Double valorEntrada;
    public Integer parcela;

    public Excecao(Double valorTotal, Double valorEntrada, Integer parcela) {
        if(valorEntrada < valorTotal*0.30){
            throw new RuntimeException("A entrada deve ser 30% do valor do bem.");
        }
        else if(parcela < 10){
            throw new RuntimeException("A quantidade mínima de parcelas deve ser 10.");
                   
        }
        this.valorTotal = valorTotal;
        this.valorEntrada = valorEntrada;
        this.parcela = parcela;
    }
    public double prestacao(){
        return (valorTotal - valorEntrada)/ parcela;
    }

}

