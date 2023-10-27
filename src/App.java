import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Passageiro> passageiros = new ArrayList<>();
        ArrayList <Usuario> usuarios = new ArrayList<>();
        
        

      Passageiro Lucas = new Passageiro("Passageiro", 1,"Masculino", "Lucas Baumer", "2004", "07290384920", "CS265436", "G3-9900");
      Passageiro Murilo = new Passageiro("Passageiro", 2,"Masculino", "Murilo Mayer", "2004", "82932183749", "IT228726", "A8-4207");
      passageiros.add(Lucas);
      passageiros.add(Murilo);

      for(int i = 0;i < passageiros.size(); i++){
          System.out.println("-Nome: " + passageiros.get(i).nome + "\n" +
                            "-Id: " + passageiros.get(i).id +"\n" + 
                            "-Gênero: " + passageiros.get(i).genero +"\n" + 
                            "-Ano de Nascimento: " + passageiros.get(i).anoNascimento + "\n" +
                            "-Cpf: " + passageiros.get(i).cpf + "\n" +
                            "-ID do Passaporte : " + passageiros.get(i).passaporteId + "\n" +
                            "-Código da Passagem : " + passageiros.get(i).codPassagem + "\n" +
                            "-----------------------------------------------------------------"
                            );
        };

      ArrayList <Recepcionista> recepcionistas = new ArrayList<>();

      Recepcionista Maria = new Recepcionista("Recepcionista", 1,"Feminino", "Maria dos Santos", "1983", "94203819203", "mardosS@skyboard.com", "madoss1322");
      Recepcionista Matheus = new Recepcionista("Recepcionista", 2,"Masculino", "Matheus Kormann", "1996", "37281934592", "Matkormmn@Skyboard.com", "mattkom2020");
      recepcionistas.add(Maria);
      recepcionistas.add(Matheus);

      for(int i = 0; i < recepcionistas.size(); i++){
        System.out.println("-Nome: " + recepcionistas.get(i).nome + "\n" +
                           "-Cargo: " + recepcionistas.get(i).cargo + "\n" +
                           "-Gênero: " + recepcionistas.get(i).genero + "\n" +
                          "-Ano de Nascimento: " + recepcionistas.get(i).anoNascimento + "\n" +
                          "-Cpf: " + recepcionistas.get(i).cpf + "\n" +
                          "-----------------------------------------------------------------"
                          );
        };

    
                         
     ArrayList <Bagagem> bagagens = new ArrayList<>();
    
      Bagagem a = new Bagagem(true, 1293, 1, 21.5);
      bagagens.add(a);

      for(int j = 0; j < bagagens.size(); j++){
        System.out.println("-Bagagem foi checada: " + bagagens.get(j).checada + "\n" +
                           "-ID da bagagem: " + bagagens.get(j).idBagagem + "\n" +
                          "-Id do Dono da bagagem: " + bagagens.get(j).idDono + "\n" +
                          "-Peso: " + bagagens.get(j).peso + "\n" +
                          "-----------------------------------------------------------------"
                          );
      };

      ArrayList <Voo> voo = new ArrayList<>();
      Voo a321 = new Voo(1323, "Decolando","Guarulhos", "Curitiba", "15:30","Airbus A321", 220, 93000);
      voo.add(a321);

      for(int j = 0; j < voo.size(); j++){
        System.out.println("-ID do Voo: " + voo.get(j).id + "\n" +
                           "-Status do Voo: " + voo.get(j).status + "\n" +
                          "-Local de Partida: " + voo.get(j).localPartida + "\n" +
                          "-Destino final: " + voo.get(j).destino + "\n" +
                          "-Horario de decolagem: " + voo.get(j).horario + "\n" +
                          "-Tipo do Avião: " + voo.get(j).tipoAviao + "\n" +
                          "-Capacidade Máxima de passageiros: " + voo.get(j).capacidade + "\n" +
                          "-Peso Máximo para decolagem: " + voo.get(j).pesoMaximo + "\n" +
                          "-----------------------------------------------------------------"
                          );
      };

    };
}
