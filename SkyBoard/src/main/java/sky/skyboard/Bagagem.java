package sky.skyboard;

import java.util.ArrayList;

public class Bagagem{
    public String nomeDono;
    public String cpfDono;
    public String passaporteDono;
    public String peso;
    public Passageiro passageiro;
//
//    public Bagagem(boolean checada, int idBagagem, int idDono, double peso){
//        this.nomeDono = checada;
//        this.idBagagem = idBagagem;
//        this.idDono = idDono;
//        this.peso = peso;
//    }

    public String getNomeDono(){
        return nomeDono;
    }

    public String getCpfDono(){
        return cpfDono;
    }

    public String getPassaporteDono(){
        return passaporteDono;
    }

    public String getPeso(){
        return peso;
    }
    
    public void setNomeDono(String NomeDono) {
        this.nomeDono = NomeDono;
    }
    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }
    public void setPassaporteDono(String passaporteDono){
        this.passaporteDono = passaporteDono;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
}

