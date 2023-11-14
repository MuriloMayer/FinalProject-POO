import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
      ArrayList <Usuario> usuarios = new ArrayList<>();
      
      //PASSAGEIROS
      Passageiro[] passageiros = new Passageiro[2];
      passageiros[0] = new Passageiro("Passageiro", 1,"Masculino", "Lucas Baumer", "2004", "07290384920", "CS265436", "G3-9900");
      passageiros[1] = new Passageiro("Passageiro", 2,"Masculino", "Murilo Mayer", "2004", "82932183749", "IT228726", "A8-4207");

     Passageiro.exibirPassageiros(passageiros);

   

        //RECEPCIONISTAS

        Recepcionista[] recepcionistas = new Recepcionista[2];

        recepcionistas[0]= new Recepcionista("Recepcionista", 1,"Feminino", "Maria dos Santos", "1983", "94203819203", "mardosS@skyboard.com", "madoss1322");
        recepcionistas[1] = new Recepcionista("Recepcionista", 2,"Masculino", "Matheus Kormann", "1996", "37281934592", "Matkormmn@Skyboard.com", "mattkom2020");

       Recepcionista.exibirRecepcionistas(recepcionistas);

        //BAGAGEM
        Bagagem[] bagagens = new Bagagem[1];
        bagagens[0] = new Bagagem(true, 1293, 1, 21.5);

        Bagagem.exibirBagagem(bagagens);
        

        //VOO

        Voo[] voos = new Voo[2];
        voos[0] = new Voo(1323, "Decolando","Guarulhos-GRU", "Curitiba-CWB", "15:30","Airbus A321", 220, 93000);
        voos[1] = new Voo(2342, "Esperando decolagem","Curitiba-CWB", "Congonhas-CGH", "10:00","Airbus A321", 220, 93000);


        Voo.exibirVoo(voos);
    };
}
