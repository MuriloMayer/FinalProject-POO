public class Bagagem{
    private boolean checada;
    private int idBagagem;
    private int idDono;
    private double peso;
    private Passageiro passageiro;

    public Bagagem(boolean checada, int idBagagem, int idDono, double peso){
        this.checada = checada;
        this.idBagagem = idBagagem;
        this.idDono = idDono;
        this.peso = peso;
    }
}
