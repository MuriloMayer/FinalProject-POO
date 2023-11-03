public class Bagagem{
    public boolean checada;
    public int idBagagem;
    public int idDono;
    public double peso;
    public Passageiro passageiro;

    public Bagagem(boolean checada, int idBagagem, int idDono, double peso){
        this.checada = checada;
        this.idBagagem = idBagagem;
        this.idDono = idDono;
        this.peso = peso;
    }

    public void mostrarBagagem(){}
    
}
