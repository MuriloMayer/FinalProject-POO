import java.util.ArrayList;

public class Voo {
    public int id;
    public String status;
    public String destino;
    public String localPartida;
    public String horario;
    public String tipoAviao;
    public int capacidade;
    public double pesoMaximo;


    public Voo(int id, String status,String localPartida, String destino, String horario, String tipoAviao,  int capacidade, double pesoMaximo){
        this.id = id;
        this.status = status;
        this.localPartida = localPartida;
        this.destino = destino;
        this.horario = horario;
        this.tipoAviao = tipoAviao;
        this.capacidade = capacidade;
        this.pesoMaximo =pesoMaximo;

    };

    public void verificarVoo(){}

    public void verificarPesoMaximo(){}
    
}
