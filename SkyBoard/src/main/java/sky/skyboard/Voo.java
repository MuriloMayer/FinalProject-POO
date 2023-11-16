package sky.skyboard;

import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;

public class Voo {
    public String id;
    public String status;
    public String destino;
    public String localPartida;
    public String horario;
    public String tipoAviao;
    public String capacidade;
    public String pesoMaximo;


//    public Voo(int id, String status,String localPartida, String destino, String horario, String tipoAviao,  int capacidade, double pesoMaximo){
//        this.id = id;
//        this.status = status;
//        this.localPartida = localPartida;
//        this.destino = destino;
//        this.horario = horario;
//        this.tipoAviao = tipoAviao;
//        this.capacidade = capacidade;
//        this.pesoMaximo =pesoMaximo;
//
//    };


    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setTipoAviao(String tipoAviao) {
        this.tipoAviao = tipoAviao;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setPesoMaximo(String pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public String getId(){
        return id;
    }

    public String getStatus(){
        return status;
    }

    public String getDestino(){
        return destino;
    }

    public String getLocalPartida(){
        return localPartida;
    }
    public String getHorario(){
        return horario;
    }

    public String getTipoAviao(){
        return tipoAviao;
    }

    public String getCapacidade(){
        return capacidade;
    }

    public String getPesoMaximo(){
        return pesoMaximo;
    }

    public static void exibirVoo(Voo[] voos){
        for(Voo voo : voos){
        System.out.println("-ID:  " + voo.getId() + "\n" +
        "-Status: " + voo.getStatus() + "\n" +
       "-Destino: " + voo.getDestino() + "\n" +
       "-Local de Partida: " + voo.getLocalPartida() + "\n" +
       "-horario: " + voo.getHorario() + "\n" +
       "-Tipo do avião: " + voo.getTipoAviao() + "\n" +
       "-Capacidade: " + voo.getCapacidade() + "\n" +
       "-Peso máximo do Avião: " + voo.getPesoMaximo() + "\n" +
       "--------------------"
       );
    }
    };

    public void verificarVoo(){
        System.out.println(this.status);
        
    }

    public void verificarPesoMaximo(){
        System.out.println(this.pesoMaximo);
    }

}
