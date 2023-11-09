import java.util.ArrayList;

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

    public boolean getChecada(){
        return checada;
    }

    public int getIdBagagem(){
        return idBagagem;
    }

    public int getIdDono(){
        return idDono;
    }

    public double getPeso(){
        return peso;
    }

    public static void exibirBagagem(Bagagem[] bagagens){
        for(Bagagem bagagem : bagagens){
        System.out.println("-Bagagem foi checada: " + bagagem.getChecada() + "\n" +
        "-ID da bagagem: " + bagagem.getIdBagagem() + "\n" +
       "-Id do Dono da bagagem: " + bagagem.getIdDono() + "\n" +
       "-Peso: " + bagagem.getPeso() + "\n" +
       "--------------------"
       );
    };
    }

    public void verificarBagagem(){
        if (this.checada == true){
            System.out.println("Bagagem ja foi verificada");
        
        }else{
            System.out.println("Bagagem ainda não foi verificada");
        }
    }

    }

