public class BombaCombustivel {
    
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;


    // Aqui seria os meus modificadores ou meu "seyt"
    public void setTipoCombustivel(String tipo){
        this.tipoCombustivel = tipo;
    }

    public void setValorLitro(double valor){
        this.valorLitro = valor;
    }

    public void setQuantidadeCombustivel(double quantidade){
        this.quantidadeCombustivel = quantidade;
    }

    // Aqui é os getts ou meus acessadores
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public double getValorLitro(){
        return valorLitro;
    }

    public double getQuantidadeCombustivel(){
        return quantidadeCombustivel;
    }

    
    public static void main(String[] args){
        BombaCombustivel bomba = new BombaCombustivel();
        bomba.setTipoCombustivel("Gasolina");
        bomba.setValorLitro(5.89);
        bomba.setQuantidadeCombustivel(1000.0);
    }
}